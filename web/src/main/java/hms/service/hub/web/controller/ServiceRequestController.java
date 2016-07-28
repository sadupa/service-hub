package hms.service.hub.web.controller;


import hms.service.hub.core.dto.ServiceRequestDto;
import hms.service.hub.core.service.ServiceRequestService;
import hms.service.hub.orm.model.ServiceRequest;
import org.apache.commons.lang3.time.DurationFormatUtils;

import hms.service.hub.core.service.AreaService;
import hms.service.hub.core.service.CategoryService;
import hms.service.hub.core.service.TagService;
import hms.service.hub.orm.model.Area;
import hms.service.hub.orm.model.Category;
import hms.service.hub.orm.model.ServiceRequest;
import hms.service.hub.orm.model.Tag;
import hms.service.hub.orm.model.User;

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
    public String requestFormSubmit(@RequestParam("title") String title, @RequestParam("category") long category, @RequestParam
            ("area") long area, @RequestParam("description") String description, @RequestParam("tags") List<Long> tags) {


        return "postRequest";
    }


    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewServiceRequests(@RequestParam("area") long area, @RequestParam("category") long category,
                                      @RequestParam("keyword") String keyword, ModelMap model) {
        Random rand = new Random();

        List<ServiceRequest> serviceRequests = serviceRequestService.getServiceRequest(area, category, keyword);
        List<ServiceRequestDto> serviceRequestDtos = new ArrayList<>();
        for (ServiceRequest serviceRequest : serviceRequests) {
            serviceRequestDtos.add(new ServiceRequestDto(rand.nextInt(5) + 1, serviceRequest.getTitle(),
                    getFirstTwenty(serviceRequest.getDescription()), serviceRequest.getArea().getName(),
                    DurationFormatUtils
                            .formatDurationWords(new Date().getTime() - serviceRequest.getCreatedDate().getTime(), true,
                                    false)));
        }

        model.put("service", serviceRequestDtos);
        return "services";


    }

    public String getFirstTwenty(String input) {
        if (input.length() > 50) {
            return input.substring(0, 50);
        } else {
            return input;
        }
    }

}
