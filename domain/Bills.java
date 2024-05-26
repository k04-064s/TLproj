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
import java.util.Date;

@Entity
@Table(name = "BILLS")
public class Bills implements java.io.Serializable {

    private long id;
    private Double amount;
    private Date dueDate;
    private String status;
    private String detailedBill;
    private Admins adminId;
    private Users userId;

    public Bills() {
    }

    public Bills(Double amount, Date dueDate, String status, String detailedBill, Admins adminId, Users userId) {
        this.amount = amount;
        this.dueDate = dueDate;
        this.status = status;
        this.detailedBill = detailedBill;
        this.adminId = adminId;
        this.userId = userId;
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

    @Column(name = "AMOUNT", nullable = false)
    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Column(name = "DUE_DATE", nullable = false)
    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Column(name = "STATUS", nullable = false)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "DETAILED_BILL", columnDefinition = "TEXT" )
    public String getDetailedBill() {
        return this.detailedBill;
    }

    public void setDetailedBill(String detailedBill) {
        this.detailedBill = detailedBill;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ADMIN_ID", nullable = false)
    public Admins getAdminId() {
        return this.adminId;
    }

    public void setAdminId(Admins adminId) {
        this.adminId = adminId;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID", nullable = false)
    public Users getUserId() {
        return this.userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }
}