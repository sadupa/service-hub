package hms.service.hub.web.controller;

import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by yasitha on 7/27/16.
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    Logger logger = LoggerFactory.getLogger(RegisterController.class);

    private static final String CSS_DANGER = "danger";
    private static final String CSS_SUCCESS = "success";

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRegisterPage() {

        return "register";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {

        try {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userService.createUser(user);
            addRedirectAttr(redirectAttributes, CSS_SUCCESS, "Registration success");
            return "redirect:/";
        } catch (Exception e) {
            addRedirectAttr(redirectAttributes, CSS_DANGER, "Error occurred");
            return "redirect:/register/";
        }
    }

    private void addRedirectAttr(RedirectAttributes redirectAttributes, String css, String msg) {
        redirectAttributes.addFlashAttribute("css", css);
        redirectAttributes.addFlashAttribute("msg", msg);
    }
}
