package com.arbalest.mycrew.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francis on 10/27/17.
 */

@Controller
public class CommonViewController {

    @RequestMapping("/")
    public String none(){
        return "/html/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "/html/index";
    }

    @RequestMapping("/home")
    public String home(){
        return "/html/index";
    }


}
