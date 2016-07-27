package hms.service.hub.web.controller;

import hms.service.hub.orm.model.ServiceRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PostServiceRequestController {

    @RequestMapping(value = "/postRequest", method = RequestMethod.GET)
    public String requestForm(Model model) {
        model.addAttribute("postRequest", new ServiceRequest());
        return "postRequest";
    }

}
