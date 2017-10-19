package com.arbalest.mycrew.services.facades;

import com.arbalest.mycrew.model.enums.UserType;
import com.arbalest.mycrew.model.vo.AuthenticateUser;
import com.arbalest.mycrew.services.factories.LoginAuthenticationFactory;
import com.arbalest.mycrew.services.interfaces.LoginAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/19/17.
 */
@Service
public class LoginFaces {
    @Autowired
    private LoginAuthenticationFactory loginAuthenticationFactory;

    public void goLoginAdmin(AuthenticateUser authenticateUse){
        loginAuthenticationFactory.getAuthenticationType(UserType.ADMIN).authenticate(authenticateUse);
    }
}
