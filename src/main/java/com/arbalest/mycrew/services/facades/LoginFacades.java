package com.arbalest.mycrew.services.facades;

import com.arbalest.mycrew.model.enums.UserType;
import com.arbalest.mycrew.model.vo.RequestAuthenticateUser;
import com.arbalest.mycrew.services.factories.LoginAuthenticationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/19/17.
 */
@Service
public class LoginFacades {
    @Autowired
    private LoginAuthenticationFactory loginAuthenticationFactory;

    public void goLoginAdmin(RequestAuthenticateUser authenticateUse){

        loginAuthenticationFactory.getAuthenticationType(UserType.ADMIN).authenticate(authenticateUse);
    }
}
