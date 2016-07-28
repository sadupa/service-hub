package hms.service.hub.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by udara on 7/26/16.
 */

@Entity
@Table(name = "feedback")
public class Feedback implements Serializable{

    private static final long serialVersionUID = 1995487244278436381L;

    public Feedback(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "service_request_id")
    private ServiceRequest serviceRequest;

    @Column(name = "rate_quality_of _the_work")
    private int qualityOfWork;

    @Column(name = "rate_communication")
    private int communication;

    @Column(name = "rate_expertise")
    private int expertise;

    @Column(name = "rate_hire_again")
    private int hireAgain;

    @Column(name = "rate_professionalism")
    private int professionalism;

    @Column(name = "comment")
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public int getQualityOfWork() {
        return qualityOfWork;
    }

    public void setQualityOfWork(int qualityOfWork) {
        this.qualityOfWork = qualityOfWork;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getExpertise() {
        return expertise;
    }

    public void setExpertise(int expertise) {
        this.expertise = expertise;
    }

    public int getHireAgain() {
        return hireAgain;
    }

    public void setHireAgain(int hireAgain) {
        this.hireAgain = hireAgain;
    }

    public int getProfessionalism() {
        return professionalism;
    }

    public void setProfessionalism(int professionalism) {
        this.professionalism = professionalism;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
