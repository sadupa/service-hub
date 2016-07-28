package hms.service.hub.core.service.impl;

import hms.service.hub.core.service.BidService;
import hms.service.hub.orm.dao.BidDao;
import hms.service.hub.orm.model.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by chathura on 7/28/16.
 */
@Transactional
@Service("bidService")
public class BidServiceImpl implements BidService{

    @Autowired
    BidDao bidDao;

    @Override
    public List<Bid> getBidForRequestService(long requestId) {
        return bidDao.getBidForRequestService(requestId);
    }

    @Override
    public Bid getBitById(long id) {
        return bidDao.getBidById(id);
    }

    @Override
    public void create(Bid bid) {
        bidDao.save(bid);
    }
}
