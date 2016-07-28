package hms.service.hub.core.dto;

import hms.service.hub.orm.model.Area;
import hms.service.hub.orm.model.Category;
import hms.service.hub.orm.model.User;
import java.util.Date;

/**
 * Created by interview on 7/28/16.
 */
public class ServicesDto {

    private Long id;
    private String title;
    private String description;
    private Date createdDate;
    private String status;
    private Category category;
    private Area area;
    private User user;

    public ServicesDto(Long id, String title, String description, Date createdDate, String status, Category category, Area area, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        this.status = status;
        this.category = category;
        this.area = area;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
