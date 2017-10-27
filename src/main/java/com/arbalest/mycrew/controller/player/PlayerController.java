package com.arbalest.mycrew.controller.player;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francis on 10/27/17.
 */
@Controller("/player")
public class PlayerController {

    @RequestMapping("/player")
    public String none(){
        return "/html/player/player_page";
    }

}
