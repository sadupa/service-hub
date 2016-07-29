package hms.service.hub.core.dto;

import java.util.Date;

/**
 * Created by chathura on 7/27/16.
 */
public class ServiceRequestDto {

    public long id;
    public int random;
    public String title;
    public String description;
    public String area;
    public String createdOn;
    public boolean accepted;
    public long bid;

    public ServiceRequestDto() {
    }

    public ServiceRequestDto(long id, int random, String title, String description, String area, String createdOn,
                             boolean accepted, long bid) {
        this.id = id;
        this.random = random;
        this.title = title;
        this.description = description;
        this.area = area;
        this.createdOn = createdOn;
        this.accepted = accepted;
        this.bid = bid;
    }

    public ServiceRequestDto(long id, int random, String title, String description, String area, String createdOn, boolean accepted) {
        this.id = id;
        this.random = random;
        this.title = title;
        this.description = description;
        this.area = area;
        this.createdOn = createdOn;
        this.accepted = accepted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }
}
