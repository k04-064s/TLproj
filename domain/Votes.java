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
@Table(name = "VOTES")
public class Votes implements java.io.Serializable {

    private long id;
    private Integer vote;
    private String description;
    private String name;
    private Users userId;
    private Admins adminId;

    public Votes() {
    }

    public Votes(Integer vote, String description, String name, Users userId, Admins adminId) {
        this.vote = vote;
        this.description = description;
        this.name = name;
        this.userId = userId;
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

    @Column(name = "VOTE", nullable = false)
    public Integer getVote() {
        return this.vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    @Column(name = "DESCRIPTION", columnDefinition="TEXT")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "NAME", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    public Users getUserId() {
        return this.userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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