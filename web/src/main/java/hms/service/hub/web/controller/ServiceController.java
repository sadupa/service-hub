package hms.service.hub.web.controller;

import hms.service.hub.core.dto.ServicesDto;
import hms.service.hub.core.service.*;
import hms.service.hub.orm.model.Area;
import hms.service.hub.orm.model.Category;
import hms.service.hub.orm.model.Service;
import hms.service.hub.orm.model.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(ServiceController.class);


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
    public String postService(@RequestParam("area") Long areaId, @RequestParam("category") Long categoryId,
                              @RequestParam(value = "title", required = false) String title, @RequestParam(value = "description", required = false) String description,
                              @RequestParam(value = "tags", required = false) List<Long> tagsIds) {
        Service service = new Service();
        service.setArea(areaService.getAreaById(areaId));
        service.setCategory(categoryService.getCategoryById(categoryId));
        service.setTitle(title);
        service.setDescription(description);
        service.setTags(tagService.getTagsByIds(tagsIds));
        service.setCreatedDate(new Date());
        service.setStatus(Service.STATUS_ACTIVE);
        service.setUser(userService.getUserById(1));

        servicesService.save(service);
        logger.info("New service created {}", service);

        return "create-service";
    }

    @RequestMapping(value = "/all")
    public String viewAllServices(ModelMap modalMap) {

        Random rand = new Random();

        List<ServicesDto> servicesDtos = new ArrayList<>();
        for (Service services : servicesService.getAllServices()) {
            servicesDtos.add(new ServicesDto(services.getId(), (long) (rand.nextInt(5) + 1), services.getTitle(), services.getDescription().substring(0,50) + "...", services.getCreatedDate(), services.getStatus(), services.getCategory(), services.getArea(), services.getUser(), services.getTags()));
        }
        modalMap.put("services", servicesDtos);
        return "view_services";
    }

    @RequestMapping(value = "/view" , method=RequestMethod.GET)
    public String viewService(@RequestParam("id")long id, ModelMap modalMap) {

        Random rand = new Random();

        Service service = servicesService.getSeriveById(id);
        ServicesDto servicesDto = new ServicesDto(service.getId(), (long) (rand.nextInt(5) + 1), service.getTitle(), service.getDescription(), service.getCreatedDate(), service.getStatus(), service.getCategory(), service.getArea(), service.getUser(), service.getTags());
        modalMap.put("service", servicesDto);
        return "view_single_service";
    }

}
