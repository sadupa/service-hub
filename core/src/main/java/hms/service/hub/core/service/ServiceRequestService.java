package hms.service.hub.core.service;

import hms.service.hub.orm.model.ServiceRequest;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
public interface ServiceRequestService {

    /**
     *
     * @param area area name
     * @param category category name
     * @param keyword service request description search key word
     * @return {@link hms.service.hub.orm.model.ServiceRequest}
     */
    List<ServiceRequest> getServiceRequest(String area,String category,String keyword);
}
