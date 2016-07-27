package hms.service.hub.web.controller;

import hms.service.hub.core.service.ProfileService;
import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.model.Profile;
import hms.service.hub.orm.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by yasitha on 7/27/16.
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {
    Logger logger = LoggerFactory.getLogger(ProfileController.class);

    private static final String CSS_DANGER = "danger";
    private static final String CSS_SUCCESS = "success";

    @Autowired
    private UserService userService;

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getProfilePage(ModelMap modelMap) {
        User user = getCurrectUser();
        if (user != null) {
            modelMap.put("user", user);
        }
        return "profile";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProfile(@ModelAttribute Profile profile, RedirectAttributes redirectAttributes) {

        try {
            profileService.createProfile(profile);
            addRedirectAttr(redirectAttributes, CSS_SUCCESS, "Registration success");
            return "redirect:/";
        } catch (Exception e) {
            logger.error("error occurred", e);
            addRedirectAttr(redirectAttributes, CSS_DANGER, "Error occurred");
            return "redirect:/register/";
        }
    }

    private void addRedirectAttr(RedirectAttributes redirectAttributes, String css, String msg) {
        redirectAttributes.addFlashAttribute("css", css);
        redirectAttributes.addFlashAttribute("msg", msg);
    }

    private User getCurrectUser() {
        Object obj = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(obj.toString());
        if (!(obj instanceof org.springframework.security.core.userdetails.User)) {
            return null;
        }
        org.springframework.security.core.userdetails.User authUser =
                (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext()
                        .getAuthentication().getPrincipal();
        String username = authUser.getUsername();

        return userService.getUserByName(username);
    }
}
