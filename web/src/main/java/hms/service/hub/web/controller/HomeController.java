package hms.service.hub.web.controller;

import hms.service.hub.core.dto.ServiceRequestDto;
import hms.service.hub.core.dto.ServicesDto;
import hms.service.hub.core.service.AreaService;
import hms.service.hub.core.service.CategoryService;
import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.core.service.ServicesService;
import hms.service.hub.orm.model.Area;
import hms.service.hub.orm.model.Category;
import hms.service.hub.orm.model.Service;
import hms.service.hub.orm.model.ServiceRequest;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by chathura on 7/26/16.
 */
@Controller
public class HomeController {

    @Autowired
    AreaService areaService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ServiceRequestService serviceRequestService;
    @Autowired
    ServicesService servicesService;

    Random rand = new Random();

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(ModelMap model) {


        List<Area> areas = areaService.getAllArea();
        List<Category> categories = categoryService.getAllCategory();
        List<ServiceRequest> serviceRequests = serviceRequestService.getAllServiceRequests();
        List<Service> services = servicesService.getAllServices(3);
        List<ServicesDto> servicesDtos = new ArrayList<>();
        for (Service service : services) {
            servicesDtos.add(new ServicesDto(service.getId(), (long) (rand.nextInt(5) + 1), service.getTitle(), getFirstTwenty(service.getDescription()), service.getCreatedDate(), service.getStatus(), service.getCategory(), service.getArea(), service.getUser(), service.getTags()));
        }

        List<ServiceRequestDto> serviceRequestDtos = new ArrayList<>();
        for (ServiceRequest serviceRequest : serviceRequests) {
            boolean isAccepted=false;
            if(serviceRequest.getAssigned_bid() != null){
                isAccepted = true;
            }
            serviceRequestDtos.add(new ServiceRequestDto(serviceRequest.getId(),rand.nextInt(5) + 1,serviceRequest.getTitle(),getFirstTwenty(serviceRequest.getDescription()),null/*serviceRequest.getArea().getName()*/,
                    DurationFormatUtils.formatDurationWords(new Date().getTime() - serviceRequest.getCreatedDate().getTime(), true, false)+" ago",isAccepted));
        }

        model.put("area",areas);
        model.put("category",categories);
        model.put("service",serviceRequestDtos);
        model.put("services",servicesDtos);
        logger.debug("home page working fine");
        return "home";
    }

    public String getFirstTwenty(String input ){
        if(input.length() > 50){
            return input.substring(0,50);
        }else {
            return input;
        }
    }
}
