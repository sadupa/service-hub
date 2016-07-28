package hms.service.hub.core.service.impl;

import hms.service.hub.orm.dao.ServicesDao;
import org.springframework.beans.factory.annotation.Autowired;
import hms.service.hub.core.service.ServicesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by parinda on 7/27/16.
 */

@Transactional
@Service("servicesService")
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServicesDao servicesDao;

    public List<hms.service.hub.orm.model.Service> getAllServices() {
        return servicesDao.getAllServices();
    }

    public hms.service.hub.orm.model.Service getSeriveById(long id) {
        return servicesDao.getSeriveById(id);
    }
}
