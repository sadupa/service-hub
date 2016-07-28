package hms.service.hub.core.service.impl;

import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.orm.dao.ServiceRequestDao;
import hms.service.hub.orm.model.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
@Transactional
@Service("serviceRequestService")
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
    ServiceRequestDao serviceRequestDao;

    @Override
    public List<ServiceRequest> getServiceRequest(long area, long category, String keyword) {
        return serviceRequestDao.getServiceRequest(area, category, keyword);
    }

    @Override
    public List<ServiceRequest> getAllServiceRequests() {
        return serviceRequestDao.getAllServiceRequest();
    }
}
