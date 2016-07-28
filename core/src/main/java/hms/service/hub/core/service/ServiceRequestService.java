package hms.service.hub.core.service;

import hms.service.hub.orm.model.ServiceRequest;

import javax.swing.*;
import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
public interface ServiceRequestService {

    /**
     *
     * @param area area id
     * @param category category id
     * @param keyword service request description search key word
     * @return {@link hms.service.hub.orm.model.ServiceRequest}
     */

    List<ServiceRequest> getServiceRequest(long area,long category,String keyword);

    List<ServiceRequest> getAllServiceRequests();

    ServiceRequest getServiceRequestById(Long id);

    Long saveServiceRequest(ServiceRequest serviceRequest);

    void updateServiceRequest(ServiceRequest serviceRequest);

    void removeServiceRequest(ServiceRequest serviceRequest);

}
