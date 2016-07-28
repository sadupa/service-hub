package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.AreaDao;
import hms.service.hub.orm.model.Area;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
@Repository("areaDao")
public class AreaDaoImpl extends UniversalDaoImpl<Area> implements AreaDao {
    @Override
    public List<Area> getAllArea() {
        Session session = getCurrentSession();
        return session.createCriteria(Area.class)
                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY)
                .addOrder(Order.asc("name"))
                .list();
    }

    @Override
    public Area getAreaById(long id) {
        Session session = getCurrentSession();
        return (Area) session.createCriteria(Area.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }
}
