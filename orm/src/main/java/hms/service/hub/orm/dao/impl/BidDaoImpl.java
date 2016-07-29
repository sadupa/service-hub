package hms.service.hub.orm.dao.impl;

import hms.service.hub.orm.dao.BidDao;
import hms.service.hub.orm.model.Bid;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chathura on 7/28/16.
 */
@Repository("bidDao")
public class BidDaoImpl extends UniversalDaoImpl<Bid> implements BidDao {
    @Override
    public List<Bid> getBidForRequestService(long requestId) {
        Session session = getCurrentSession();
        return session.createCriteria(Bid.class)
                .add(Restrictions.eq("serviceRequest.id",requestId))
                .addOrder(Order.asc("amount"))
                .list();
    }

    @Override
    public Bid getBidById(long id) {
        Session session = getCurrentSession();
        return (Bid) session.createCriteria(Bid.class)
                .add(Restrictions.eq("id",id))
                .uniqueResult();
    }
}
