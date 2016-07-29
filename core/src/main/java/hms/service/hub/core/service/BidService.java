package hms.service.hub.core.service;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;
import hms.service.hub.orm.model.Bid;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * Created by chathura on 7/28/16.
 */
public interface BidService {

    List<Bid> getBidForRequestService(long requestId);

    Bid getBitById(long id);

    void create(Bid bid);
}
