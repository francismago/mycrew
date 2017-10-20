package com.arbalest.mycrew.controller.common;

import com.arbalest.mycrew.model.vo.RequestNewPlayer;
import com.arbalest.mycrew.services.facades.RegisterFacades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francis on 10/20/17.
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private RegisterFacades registerFacades;

    @RequestMapping("/player")
    public String playerRegisrationPage(){
        return "/html/registration/player_registration";
    }

    @RequestMapping("/club")
    public String clubRegistrationPage(){
        return "/html/registration/club_registration";
    }

    @PostMapping("/player/create")
    public String createPlayer(RequestNewPlayer requestNewPlayer) {
        System.out.println("createPlayer:"+requestNewPlayer);
        registerFacades.registerNewPlayer(requestNewPlayer);
        return "/html/registration/success_registration";
    }

    @PostMapping("/club/create")
    public String createClub(){
        return "/html/registration/success_registration";
    }
}
