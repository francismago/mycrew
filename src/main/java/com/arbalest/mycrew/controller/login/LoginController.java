package com.arbalest.mycrew.controller.login;

import com.arbalest.mycrew.model.vo.AuthenticateUser;
import com.arbalest.mycrew.services.facades.LoginFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by francis on 10/19/17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginFaces loginFaces;

    @RequestMapping("/admin")
    public String adminLogin(){
        return "/html/login";
    }

    @RequestMapping("/login")
    public String login(AuthenticateUser authenticateUse){
        System.out.println(authenticateUse);
        loginFaces.goLoginAdmin(authenticateUse);
        return "/html/login";
    }

}
