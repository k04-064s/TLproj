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
@Table(name = "ANNOUNCEMENTS")
public class Announcements implements java.io.Serializable {

    private long id;
    private String title;
    private Date date;
    private String description;
    private Admins adminId;

    public Announcements() {
    }

    public Announcements(String title, Date date, String description, Admins adminId) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.adminId = adminId;
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

    @Column(name = "TITLE", nullable = false)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "DATE", nullable = false)
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "DESCRIPTION", columnDefinition="TEXT")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "ADMIN_ID", nullable = false)
    public Admins getAdminId() {
        return this.adminId;
    }

    public void setAdminId(Admins adminId) {
        this.adminId = adminId;
    }
}