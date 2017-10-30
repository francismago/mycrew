package com.arbalest.mycrew.controller.club;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francis on 10/27/17.
 */
@Controller("/club")
public class ClubController {

    @RequestMapping("/club")
    public String none(){
        return "/html/club/club_page";
    }


    @PostMapping("/season/submit")
    public String createNewSeason(){
        return "html/club/club_page";
    }

    @PostMapping("/players/submit")
    public String linkAndCreateTeam(){
        return "html/club/club_page";
    }

}
