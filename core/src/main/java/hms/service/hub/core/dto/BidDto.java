package hms.service.hub.core.dto;

/**
 * Created by chathura on 7/28/16.
 */
public class BidDto {

    public long id;
    public String description;
    public String user;
    public Double amount;
    public int random;

    public BidDto() {
    }

    public BidDto(long id, String description, String user, Double amount,int random) {
        this.id = id;
        this.description = description;
        this.user = user;
        this.amount = amount;
        this.random = random;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
}
