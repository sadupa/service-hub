package hms.service.hub.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by parinda on 7/27/16.
 */

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login")
    public String Authentication() {

        logger.debug("login controller");

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            logger.debug("user logged!");
            return "redirect:/home";
        }

        return "redirect:/auth";
    }

    @RequestMapping(value = "auth")
    public String loginPage() {

        logger.debug("login controller");
        return "login";
    }

    @RequestMapping(value = "login/403")
    public String response403(ModelMap model) {
        model.put("response_msg", "You have no permission to Login, contact the admin to revoke the permission");
        return "login";
    }
}
