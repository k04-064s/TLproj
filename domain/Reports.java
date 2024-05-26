package billGuru.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REPORTS")
public class Reports implements java.io.Serializable {

    private long reportId;
    private String title;
    private String description;
    private Users userId;
    private String status;
    private Boolean update;

    public Reports() {
    }

    public Reports(String title, String description, Users userId, String status, boolean update) {
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.status = status;
        this.update = update;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_ID", unique = true, nullable = false)
    public long getReportId() {
        return this.reportId;
    }

    public void setReportId(long reportId) {
        this.reportId = reportId;
    }

    @Column(name = "TITLE", nullable = false)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "DESCRIPTION", nullable = false)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    public Users getUserId() {
        return this.userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Column(name = "STATUS", nullable = false)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "UPDATE", nullable = false)
    public Boolean isUpdate() {
        return this.update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }
}