package hms.service.hub.web.controller;


import hms.service.hub.core.dto.BidDto;
import hms.service.hub.core.dto.ServiceRequestDto;
import hms.service.hub.core.service.*;
import hms.service.hub.orm.model.*;
import org.apache.commons.lang3.time.DurationFormatUtils;

import hms.service.hub.orm.model.ServiceRequest;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;



import javax.servlet.http.HttpServletRequest;

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


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String requestForm(Model model) {

        List<Category> categoryList = categoryService.getAllCategory();
        List<Tag> tagList = tagService.getAllTags();
        List<Area> areaList = areaService.getAllArea();

        model.addAttribute("categories", categoryList);
        model.addAttribute("areas", areaList);
        model.addAttribute("tags", tagList);

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbb");

        return "postRequest";
    }

    @RequestMapping(value = "/submitPostRequest", method = RequestMethod.POST)
    public String requestFormSubmit(@ModelAttribute ServiceRequest serviceRequest,
                                    RedirectAttributes redirectAttributes, HttpServletRequest request) {

        //model.addAttribute("PostRequest", serviceRequest);

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbcccccccccccccccccccccdddddddddddddddddd");

        return "result";
    }


    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewServiceRequests(@RequestParam("area") long area, @RequestParam("category") long category,
                                      @RequestParam("keyword") String keyword,ModelMap model) {
        Random rand = new Random();
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
        Random rand = new Random();

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
