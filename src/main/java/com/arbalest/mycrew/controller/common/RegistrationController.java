package com.arbalest.mycrew.controller.common;

import com.arbalest.mycrew.enums.UserType;
import com.arbalest.mycrew.model.vo.ClubVo;
import com.arbalest.mycrew.model.vo.NewPlayer;
import com.arbalest.mycrew.model.vo.PlayerVo;
import com.arbalest.mycrew.services.facades.RegisterFacades;
import com.arbalest.mycrew.services.factories.UserRegistrationFactory;
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

    @Autowired
    private UserRegistrationFactory userRegistrationFactory;

    @RequestMapping("/player")
    public String playerRegisrationPage(){
        return "/html/registration/player_registration";
    }

    @RequestMapping("/club")
    public String clubRegistrationPage(){
        return "/html/registration/club_registration";
    }

    @PostMapping("/player/submit")
    public String registerPlayer(PlayerVo playerVo) {
        System.out.println("createPlayer:"+playerVo);
        userRegistrationFactory.getRegistrationBy(UserType.PLAYER).register(playerVo);
        return "/html/registration/success_registration";
    }

    @PostMapping("/club/submit")
    public String registerClub(ClubVo clubVo){
        System.out.println("registerClub:"+clubVo);
        userRegistrationFactory.getRegistrationBy(UserType.CLUB).register(clubVo);
        return "/html/registration/success_registration";
    }
}
