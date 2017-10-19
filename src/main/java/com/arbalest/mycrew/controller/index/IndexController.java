package com.arbalest.mycrew.controller.index;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by francis on 10/18/17.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
