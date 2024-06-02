package billGuru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

import billGuru.controllers.ajax.AjaxUtils;
import billGuru.controllers.beans.LoginFormBean;



@Controller
@RequestMapping ("/login")
@SessionAttributes("loginFormBean")
public class LoginController {
    // Invoked on every request
    @ModelAttribute
    public void ajaxAttribute(WebRequest request, Model model) {
        model.addAttribute("ajaxRequest", AjaxUtils.isAjaxRequest(request));
    }


    @ModelAttribute("loginFormBean")
    public LoginFormBean createFormBean() {
        return new LoginFormBean();
    }

    @RequestMapping(method=RequestMethod.GET)
    public void form() {
    }

}