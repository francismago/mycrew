package com.arbalest.mycrew.test.services;

import com.arbalest.mycrew.enums.UserType;
import com.arbalest.mycrew.model.vo.ClubVo;
import com.arbalest.mycrew.services.factories.UserRegistrationFactory;
import com.arbalest.mycrew.startup.MyCrewApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by francis on 10/27/17.
 */




@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyCrewApplication.class)
public class TodoServiceTesting {

    @Autowired
    private UserRegistrationFactory userRegistrationFactory;

    @Test
    public void registerClub(){
        System.out.println("==== start registerClub =====");
        ClubVo clubVo = new ClubVo.Builder()
                .username("francis")
                .password("123123")
                .clubName("Project 6 basketball")
                .clubAbbr("psbc")
                .build();

        userRegistrationFactory.getRegistrationBy(UserType.CLUB).register(clubVo);
        System.out.println("==== end registerClub =====");
    }

}
