package hms.service.hub.web.controller;

import hms.service.hub.core.service.FeedbackService;
import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.model.Feedback;
import hms.service.hub.orm.model.ServiceRequest;
import hms.service.hub.orm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by yasitha on 7/28/16.
 */
@Controller
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    UserService userService;

    @Autowired
    ServiceRequestService serviceRequestService;

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(value = "/rate", method = RequestMethod.GET)
    public String getRatePage(ModelMap modelMap, @RequestParam("id") int id,
                              @RequestParam(name = "is_save", required = false) String isSave) {
        User user = userService.getUserById(1);
        modelMap.put("serviceId", id);
        modelMap.put("user", user);
        if ("true".equals(isSave)) {
            modelMap.put("saveSuccess", true);
        }
        return "rateService";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String getRatePage(@RequestParam Map<String, String> request) {
        ServiceRequest serviceRequest = serviceRequestService.getServiceRequestById(new Long(request.get("serviceId")));
        Feedback feedback = new Feedback();
        feedback.setServiceRequest(serviceRequest);
        feedback.setQualityOfWork(new Integer(request.get("quality")));
        feedback.setCommunication(new Integer(request.get("communication")));
        feedback.setExpertise(new Integer(request.get("expertise")));
        feedback.setHireAgain(new Integer(request.get("hireAgain")));
        feedback.setProfessionalism(new Integer(request.get("professionalism")));
        feedback.setComment(request.get("comment"));
        feedbackService.saveFeedback(feedback);
        return "redirect:/rating/rate?is_save=true&id=" + request.get("serviceId");
    }
}
