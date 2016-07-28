package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.ServiceRequestDao;
import hms.service.hub.orm.model.ServiceRequest;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */

@Repository("serviceRequestDao")
public class ServiceRequestDaoImpl extends UniversalDaoImpl<ServiceRequest> implements ServiceRequestDao{

    @Override
    public List<ServiceRequest> getServiceRequest(long area,long category,String keyword) {
        Session session = getCurrentSession();
        if (keyword == null || keyword.isEmpty()) {
            return session.createCriteria(ServiceRequest.class)
                    .add(Restrictions.eq("area.id", area))
                    .add(Restrictions.eq("category.id", category))
                    .list();
        } else {
            return session.createCriteria(ServiceRequest.class)
                    .add(Restrictions.like("description", keyword, MatchMode.ANYWHERE))
                    .add(Restrictions.eq("area.id", area))
                    .add(Restrictions.eq("category.id", category))
                    .list();
        }
    }

    @Override
    public List<ServiceRequest> getAllServiceRequest() {
        Session session = getCurrentSession();
        return session.createCriteria(ServiceRequest.class)
                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY)
                .list();
    }
}
