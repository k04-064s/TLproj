package billGuru.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ADMINS")
public class Admins  implements java.io.Serializable {


     private long id;
     private String password;
     private String email;
     private String username;
     
     public Admins() {
     }
    
    public Admins(String username, String password, String email) {
    	this.username = username;
    	this.password = password;
    	this.email = email;
    }

	   
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="ID", unique= true, nullable= false)
     public long getId() {
    	 return this.id;
     }
     
     public void setId(long id) {
    	 this.id = id;
     }
     
     @Column(name="PASSWORD", nullable= false)
     public String getPassword() {
    	 return this.password;
     }
     
     public void setPassword(String password) {
    	 this.password = password;
     }
     
     @Column(name="EMAIL", nullable= false)
     public String getEmail() {
    	 return this.email;
     }
     
     public void setEmail(String email) {
    	 this.email = email;
     }
     
     @Column(name="USERNAME", nullable= false)
     public String getUsername() {
    	 return this.username;
     }
     
     public void setUsername(String username) {
    	 this.username= username;
     }
     
}
     
    
  