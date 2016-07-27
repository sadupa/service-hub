package hms.service.hub.web.controller;

import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.orm.model.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ServiceRequestController {

    @Autowired
    ServiceRequestService serviceRequestService;

    @RequestMapping(value = "/postRequest", method = RequestMethod.GET)
    public String requestForm(Model model) {
        model.addAttribute("postRequest", new ServiceRequest());
        return "postRequest";
    }

    @RequestMapping(value = "/postRequest", method = RequestMethod.POST)
    public String requestFormSubmit(@ModelAttribute ServiceRequest serviceRequest, Model model) {
        model.addAttribute("PostRequest", serviceRequest);
        return "result";
    }

    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String viewServiceRequests(@RequestParam("area") String area,@RequestParam("category") String category,@RequestParam("keyword") String keyword){

        List<ServiceRequest> serviceRequests = serviceRequestService.getServiceRequest(area,category,keyword);
        System.out.println("--------"+serviceRequests.size());
        return "services";
    }

}
