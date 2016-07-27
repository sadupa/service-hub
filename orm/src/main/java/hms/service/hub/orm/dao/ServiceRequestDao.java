package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.ServiceRequest;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */

public interface ServiceRequestDao extends UniversalDao<ServiceRequest> {
    List<ServiceRequest> getServiceRequest(String area,String category,String keyword);

}