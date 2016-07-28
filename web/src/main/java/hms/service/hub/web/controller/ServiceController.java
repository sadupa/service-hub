package hms.service.hub.web.controller;

import hms.service.hub.core.dto.ServiceRequestDto;
import hms.service.hub.core.dto.ServicesDto;
import hms.service.hub.core.service.AreaService;
import hms.service.hub.core.service.CategoryService;
import hms.service.hub.core.service.ServicesService;
import hms.service.hub.core.service.TagService;
import hms.service.hub.orm.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * (C) Copyright 2016 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 * <p/>
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 * <p/>
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 *
 * @Author Sadupa Wijeratne
 * Created on : 7/27/16 10:07 AM
 */

@Controller
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TagService tagService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private ServicesService servicesService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String postServiceView(ModelMap modelMap) throws IOException {
        List<Category> categoryList = categoryService.getAllCategory();
        List<Tag> tagList = tagService.getAllTags();
        List<Area> areaList = areaService.getAllArea();

        modelMap.put("categories", categoryList);
        modelMap.put("areas", areaList);
        modelMap.put("tags", tagList);

        return "create-service";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postService(ModelMap modelMap) {
        return "create-service";
    }

    @RequestMapping(value = "/all")
    public String viewAllServices(ModelMap modalMap) {

        Random rand = new Random();

        List<ServicesDto> servicesDtos = new ArrayList<>();
        for (Service services : servicesService.getAllServices()) {
            servicesDtos.add(new ServicesDto((long) (rand.nextInt(5) + 1), services.getTitle(), services.getDescription(), services.getCreatedDate(), services.getStatus(), services.getCategory(), services.getArea(), services.getUser()));
        }
        modalMap.put("services", servicesDtos);
        return "view_services";
    }
}
