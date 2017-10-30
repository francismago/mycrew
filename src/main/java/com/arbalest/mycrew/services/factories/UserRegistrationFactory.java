package com.arbalest.mycrew.services.factories;

import com.arbalest.mycrew.enums.UserType;
import com.arbalest.mycrew.services.interfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/26/17.
 */
@Service
public class UserRegistrationFactory {

    @Autowired
    UserRegistrationService clubUserRegistration;

    @Autowired
    UserRegistrationService playerUserRegistration;


    public UserRegistrationService getRegistrationBy(UserType userType){
        switch (userType){
            case CLUB:  return clubUserRegistration;
            case PLAYER:return playerUserRegistration;
        }

        return null;
    }
}
