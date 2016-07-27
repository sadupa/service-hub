package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.ServiceRequestDao;
import hms.service.hub.orm.model.ServiceRequest;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */

@Repository("serviceRequestDao")
public class ServiceRequestDaoImpl extends UniversalDaoImpl<ServiceRequest> implements ServiceRequestDao{

    @Override
    public List<ServiceRequest> getServiceRequest(String area,String category,String keyword) {
        Session session = getCurrentSession();
        if (keyword != null || !keyword.isEmpty()) {
            return session.createCriteria(ServiceRequest.class)
                    .createAlias("area", "area")
                    .createAlias("category", "category")
                    .add(Restrictions.eq("area.areaName", area))
                    .add(Restrictions.eq("category.categoryName", category))
                    .add(Restrictions.like("description",keyword))
                    .list();
        } else {
            return session.createCriteria(ServiceRequest.class)
                    .createAlias("area", "area")
                    .createAlias("category", "category")
                    .add(Restrictions.eq("area.areaName", area))
                    .add(Restrictions.eq("category.categoryName", category))
                    .list();
        }
    }
}
