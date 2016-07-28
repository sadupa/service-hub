package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.ServicesDao;
import hms.service.hub.orm.model.Service;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by parinda on 7/27/16.
 */

@Repository("ServicesDao")
public class ServicesDaoImpl extends UniversalDaoImpl<Service> implements ServicesDao{

    public List<Service> getAllServices(int getCount) {
        Session session = sessionFactory.getCurrentSession();
        if(getCount == 0){
            return session.createCriteria(Service.class).list();
        }else {
            return session.createCriteria(Service.class)
                    .setMaxResults(getCount)
                    .list();
        }
    }

    public Service getSeriveById(long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Service) session.createCriteria(Service.class).add(Restrictions.eq("id", id)).uniqueResult();
    }
}
