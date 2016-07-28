package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Bid;

import java.util.List;

/**
 * Created by chathura on 7/28/16.
 */
public interface BidDao extends UniversalDao<Bid> {
    List<Bid> getBidForRequestService(long requestId);
}
