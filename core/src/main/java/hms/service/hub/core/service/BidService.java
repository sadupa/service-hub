package hms.service.hub.core.service;

import hms.service.hub.orm.model.Bid;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * Created by chathura on 7/28/16.
 */
public interface BidService {

    List<Bid> getBidForRequestService(long requestId);
}
