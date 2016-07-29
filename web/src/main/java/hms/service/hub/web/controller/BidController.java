package hms.service.hub.web.controller;

import hms.service.hub.core.service.BidService;
import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.model.Bid;
import hms.service.hub.orm.model.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by chathura on 7/29/16.
 */
@Controller
@RequestMapping(value = "/bid")
public class BidController {

    @Autowired
    BidService bidService;
    @Autowired
    UserService userService;
    @Autowired
    ServiceRequestService serviceRequestService;


    @RequestMapping(value = "create",method = RequestMethod.POST)
    public String createBid(@RequestParam("requestId") long requestId,@RequestParam("amount") Double amount,
                            @RequestParam("description") String description){
        Bid bid = new Bid();
        bid.setAmount(amount);
        bid.setBidDate(new Date());
        bid.setDescription(description);
        bid.setUser(userService.getUserById(1));
        bid.setServiceRequest(serviceRequestService.getServiceRequestById(requestId));
        bidService.create(bid);
        return "redirect:/postRequest/bid-service?id="+requestId;
    }

    @RequestMapping(value = "/accept",method = RequestMethod.POST)
    public String acceptBid(@RequestParam("bidId") long bidId,@RequestParam("requestId") long requestId){
        ServiceRequest serviceRequest = serviceRequestService.getServiceRequestById(requestId);
        serviceRequest.setAssigned_bid(bidService.getBitById(bidId));
        serviceRequestService.updateServiceRequest(serviceRequest);
        return "redirect:/postRequest/bid-service?id="+requestId;
    }
}
