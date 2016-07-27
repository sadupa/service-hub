package hms.service.hub.web.controller;

import hms.service.hub.core.service.AreaService;
import hms.service.hub.core.service.CategoryService;
import hms.service.hub.orm.model.Area;
import hms.service.hub.orm.model.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by chathura on 7/26/16.
 */
@Controller
public class HomeController {

    @Autowired
    AreaService areaService;
    @Autowired
    CategoryService categoryService;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(ModelMap model) {

        List<Area> areas = areaService.getAllArea();
        List<Category> categories = categoryService.getAllCategory();

        model.put("area",areas);
        model.put("category",categories);
        logger.debug("home page working fine");
        return "home";
    }

}
