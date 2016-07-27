package hms.service.hub.web;

import hms.service.hub.core.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yasitha on 7/27/16.
 */
@Controller
@RequestMapping("register")
public class RegisterController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRegisterPage() {

        return "register";
    }
}
