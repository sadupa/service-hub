package hms.service.hub.web.controller;

import hms.service.hub.core.service.RoleService;
import hms.service.hub.core.service.UserService;
import hms.service.hub.orm.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

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
    private RoleService roleService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    @Qualifier("authenticationManager")
    private AuthenticationManager authenticationManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRegisterPage(ModelMap modelMap, HttpServletRequest request) {
        modelMap.put("isSignUpPage", true);
        return "register";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {

        try {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            user.setRole(roleService.getRoleById(1));
            userService.createUser(user);
            addRedirectAttr(redirectAttributes, CSS_SUCCESS, "Registration success");
            return "redirect:/login";
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

    private void authenticateUserAndSetSession(String username, String password, HttpServletRequest request) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);

        // generate session if one doesn't exist
        request.getSession();

        token.setDetails(new WebAuthenticationDetails(request));
        Authentication authenticatedUser = authenticationManager.authenticate(token);

        SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
    }
}
