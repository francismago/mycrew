package com.arbalest.mycrew.services.factories;

import com.arbalest.mycrew.model.enums.UserType;
import com.arbalest.mycrew.services.interfaces.LoginAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/16/17.
 */
@Service
public class LoginAuthenticationFactory {

    @Autowired
    LoginAuthenticationService adminLoginAuthentication;

    public LoginAuthenticationService getAuthenticationType(UserType userType){
        switch (userType){
            case ADMIN:
                return adminLoginAuthentication;
        }
        return null;
    }


}
