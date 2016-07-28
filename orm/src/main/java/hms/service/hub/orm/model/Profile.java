package hms.service.hub.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by udara on 7/26/16.
 */
@Entity
@Table(name="profile")
public class Profile implements Serializable{

    private static final long serialVersionUID = 1927557244205936381L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "summary")
    private String summary;

    @Column(name = "mobile_no", nullable = false)
    private String mobileNo;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
