package com.arbalest.mycrew.controller.common;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by francis on 10/18/17.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class CallBackApiController {

    @RequestMapping("/test")
    public  String  test(){
        return "test was called";
    }

}
