package billGuru.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OFFERS")
public class Offers implements java.io.Serializable {

    private long id;
    private Double discount;
    private String description;
    private Admins admin;
    private PremiumUsers premiumUser;

    public Offers() {
    }

    public Offers(Double discount, String description, Admins admin, PremiumUsers premiumUser) {
        this.discount = discount;
        this.description = description;
        this.admin = admin;
        this.premiumUser = premiumUser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "DISCOUNT", nullable = false)
    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Column(name = "DESCRIPTION", nullable = false)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ADMIN_ID", nullable = false)
    public Admins getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "PREMIUM_USER_ID", nullable = false)
    public PremiumUsers getPremiumUser() {
        return this.premiumUser;
    }

    public void setPremiumUser(PremiumUsers premiumUser) {
        this.premiumUser = premiumUser;
    }
}