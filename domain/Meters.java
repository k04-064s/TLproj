package billGuru.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "METERS")
public class Meters implements java.io.Serializable {

    private long id;
    private Double consumption;
    private String type;
    private Date fromDate;
    private Date toDate;
    private Float enrgPlan;
    private Boolean notification;
    private PremiumUsers premUserId;

    public Meters() {
    }

    public Meters(double consumption, String type, Date fromDate, Date toDate, Float enrgPlan, Boolean notification, PremiumUsers premUserId) {
        this.consumption = consumption;
        this.type = type;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.enrgPlan = enrgPlan;
        this.notification = notification;
        this.premUserId = premUserId;
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

    @Column(name = "CONSUMPTION", nullable = false)
    public Double getConsumption() {
        return this.consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    @Column(name = "TYPE", nullable = false)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "FROM_DATE", nullable = false)
    public Date getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Column(name = "TO_DATE", nullable = false)
    public Date getToDate() {
        return this.toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Column(name = "ENRG_PLAN")
    public Float getEnrgPlan() {
        return this.enrgPlan;
    }

    public void setEnrgPlan(Float enrgPlan) {
        this.enrgPlan = enrgPlan;
    }

    @Column(name = "NOTIFICATION", nullable = false)
    public Boolean isNotification() {
        return this.notification;
    }

    public void setNotification(Boolean notification) {
        this.notification = notification;
    }
    
    @ManyToOne
    @JoinColumn(name = "PREM_USER_ID", nullable = false)
    public PremiumUsers getPremUserId() {
        return this.premUserId;
    }

    public void setPremUserId(PremiumUsers premUserId) {
        this.premUserId = premUserId;
    }
}