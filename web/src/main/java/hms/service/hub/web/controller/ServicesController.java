package hms.service.hub.web.controller;

import hms.service.hub.core.service.ServicesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by parinda on 7/27/16.
 */
@Controller
@RequestMapping("/services")
public class ServicesController {

    Logger logger = LoggerFactory.getLogger(ServicesController.class);

    @Autowired
    private ServicesService servicesService;

    @RequestMapping(value = "/all")
    public String viewAllServices(ModelMap modalMap) {

        logger.debug("services controller");
        modalMap.put("services", servicesService.getAllServices());
        return "view_services";
    }
}
