package com.arbalest.mycrew.controller.login;

import com.arbalest.mycrew.model.vo.AuthenticateUser;
import com.arbalest.mycrew.services.facades.LoginFacades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francis on 10/19/17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginFacades loginFaces;

    @RequestMapping("/login")
    public String none(){
        return "/html/login";
    }

    @RequestMapping("/admin")
    public String adminLogin(){
        return "/html/login";
    }

    @RequestMapping("/submit")
    public String login(AuthenticateUser authenticateUse){
        System.out.println(authenticateUse);
        loginFaces.goLoginAdmin(authenticateUse);
        return "/html/login";
    }

}
