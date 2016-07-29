package hms.service.hub.web.controller;


import hms.service.hub.core.RequestStatus;
import hms.service.hub.core.dto.BidDto;
import hms.service.hub.core.dto.ServiceRequestDto;
import hms.service.hub.core.service.BidService;
import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.model.Bid;
import hms.service.hub.orm.model.ServiceRequest;
import org.apache.commons.lang3.time.DurationFormatUtils;
import hms.service.hub.core.service.AreaService;
import hms.service.hub.core.service.CategoryService;
import hms.service.hub.core.service.TagService;
import hms.service.hub.orm.model.Area;
import hms.service.hub.orm.model.Category;
import hms.service.hub.orm.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Controller
@RequestMapping("/postRequest")
public class ServiceRequestController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TagService tagService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private ServiceRequestService serviceRequestService;
    @Autowired
    private BidService bidService;
    @Autowired
    private UserService userService;

    Random rand = new Random();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String requestForm(Model model) {

        List<Category> categoryList = categoryService.getAllCategory();
        List<Tag> tagList = tagService.getAllTags();
        List<Area> areaList = areaService.getAllArea();

        model.addAttribute("categories", categoryList);
        model.addAttribute("areas", areaList);
        model.addAttribute("tags", tagList);

        return "postRequest";
    }

    @RequestMapping(value = "/submitPostRequest", method = RequestMethod.POST)
    public String requestFormSubmit(@RequestParam("title") String title, @RequestParam("category") long category,
                                    @RequestParam
            ("area") List<Long> areas, @RequestParam("description") String description, @RequestParam("tags") List<Long>
                                                tags) {

        ServiceRequest request = new ServiceRequest();
        request.setTitle(title);
        request.setCategory(categoryService.getCategoryById(category));
        //request.setArea(areaService.getAreasByIds(areas));
        request.setDescription(description);
        request.setTags(tagService.getTagsByIds(tags));
        request.setStatus(RequestStatus.CREATED);
        request.setUser(userService.getUserById(1));
        request.setCreatedDate(new Date());

        serviceRequestService.saveServiceRequest(request);

        return "postRequest";
    }


    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewServiceRequests(@RequestParam("area") long area, @RequestParam("category") long category,

                                      @RequestParam("keyword") String keyword,ModelMap model) {


        List<Area> areas = areaService.getAllArea();
        List<Category> categories = categoryService.getAllCategory();
        List<ServiceRequest> serviceRequests = serviceRequestService.getServiceRequest(area, category, keyword);
        List<ServiceRequestDto> serviceRequestDtos = new ArrayList<>();
        for (ServiceRequest serviceRequest : serviceRequests) {
            serviceRequestDtos.add(new ServiceRequestDto(serviceRequest.getId(),rand.nextInt(5) + 1,serviceRequest.getTitle(),getFirstTwenty(serviceRequest.getDescription()),serviceRequest.getArea().getName(),
                    DurationFormatUtils.formatDurationWords(new Date().getTime() -  serviceRequest.getCreatedDate().getTime(), true, false)+" ago"));
        }
        model.put("area",areas);
        model.put("category",categories);
        model.put("service", serviceRequestDtos);
        return "services";


    }

    public String getFirstTwenty(String input ){
        if(input.length() > 50){
            return input.substring(0,50);
        }else {
            return input;
        }
    }


    @RequestMapping(value = "/bid-service",method = RequestMethod.GET)
    public String getServiceRequestBidView(@RequestParam("id") long id,ModelMap model){


        ServiceRequest serviceRequestToAdd = serviceRequestService.getServiceRequestById(id);
        List<ServiceRequest> serviceRequests = new ArrayList<>();
        List<ServiceRequestDto> serviceRequestDtos = new ArrayList<>();
        List<BidDto> bidDtos = new ArrayList<>();
        List<Bid> bids = bidService.getBidForRequestService(serviceRequestToAdd.getId());
        serviceRequests.add(serviceRequestToAdd);
        for (ServiceRequest serviceRequest : serviceRequests) {
            serviceRequestDtos.add(new ServiceRequestDto(serviceRequest.getId(),rand.nextInt(5) + 1,serviceRequest.getTitle(),serviceRequest.getDescription(),serviceRequest.getArea().getName(),
                    DurationFormatUtils.formatDurationWords(new Date().getTime() -  serviceRequest.getCreatedDate().getTime(), true, false)+" ago"));
        }

        for (Bid bid : bids) {
            bidDtos.add(new BidDto(bid.getId(),bid.getDescription(),bid.getUser().getName(),bid.getAmount(),rand.nextInt(2) + 1));
        }

        model.put("bid",bidDtos);
        model.put("service",serviceRequestDtos);
        return "bid_services";
    }

}
