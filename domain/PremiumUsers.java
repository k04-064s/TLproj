package billGuru.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PREMIUM_USERS")
@PrimaryKeyJoinColumn(name = "USER_ID")
public class PremiumUsers extends Users {

    private int points;

    public PremiumUsers() {
    }

    public PremiumUsers(String name, String surname, String phone, String password, String appartment, int points ) {
        super(name, surname, phone, password, appartment);
        this.points = points;
    }
    
    

    @Column(name = "POINTS")
    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}