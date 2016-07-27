package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Service;

import java.util.List;

/**
 * Created by parinda on 7/27/16.
 */
public interface ServicesDao {

    List <Service> getAllServices();
    Service getSeriveById(long id);
}
