package hms.service.hub.orm.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by udara on 7/26/16.
 */
@Entity
@Table(name = "service_request")
public class ServiceRequest implements Serializable {

    private static final long serialVersionUID = 1927535795278436381L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "title")
    private String title;

    @Column(name = "created_date")
    private Date createdDate;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany
    @JoinTable(name = "service_request_area", joinColumns = {
            @JoinColumn(name = "service_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "area_id", nullable = false)})
    private List<Area> area;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "service_request_tag", joinColumns = {
            @JoinColumn(name = "service_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "tag_id", nullable = false)})
    private List<Tag> tags;

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "assigned_bid_id")
    private Bid assigned_bid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Bid getAssigned_bid() {
        return assigned_bid;
    }

    public void setAssigned_bid(Bid assigned_bid) {
        this.assigned_bid = assigned_bid;
    }

    public List<Area> getArea() {
        return area;
    }

    public void setArea(List<Area> area) {
        this.area = area;
    }
}
