package billGuru.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="USERS")
public class Users  implements java.io.Serializable {


     private long id;
     private String name;
     private String surname;
     private String email;
     private String phone;
     private String password;
     private String appartment;
    
    public Users() {
    	
    }
    
    public Users(String name, String surname, String phone, String password, String appartment) {

    	this.name = name;
    	this.surname = surname;
    	this.password = password;
    	this.phone = phone;
    	this.appartment = appartment;
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
     
     @Column(name="NAME", nullable= false)
     public String getName() {
    	 return this.name;
     }
     
     public void setName(String name) {
    	 this.name = name;
     }
     
     @Column(name="SURNAME", nullable= false)
     public String getSurname() {
    	 return this.surname;
     }
     
     public void setSurname(String surname) {
    	 this.surname = surname;
     }
     
     @Column(name="PASSWORD", nullable= false)
     public String getPassword() {
    	 return this.password;
     }
     
     public void setPassword(String password) {
    	 this.password = password;
     }
     
     @Column(name="EMAIL")
     public String getEmail() {
    	 return this.email;
     }
     
     public void setEmail(String email) {
    	 this.email = email;
     }
     
     @Column(name="PHONE")
     public String getPhone() {
    	 return this.phone;
     }
     
     public void setPhone(String phone) {
    	 this.phone = phone;
     }
     
     @Column(name="APPARTMENT", nullable= false)
     public String getAppartment() {
    	 return this.appartment;
     }
     
     public void setAppartment(String appartment) {
    	 this.appartment = appartment;
     }
     
     
     
}
     
    
  