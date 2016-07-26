package hms.service.hub.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by udara on 7/26/16.
 */
@Entity
@Table(name = "service_request")
public class ServiceRequest implements Serializable{
    private static final long serialVersionUID = 1927535795278436381L;

    public ServiceRequest(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
}
