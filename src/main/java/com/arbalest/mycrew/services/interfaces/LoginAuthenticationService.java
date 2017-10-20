package com.arbalest.mycrew.services.interfaces;

import com.arbalest.mycrew.model.vo.RequestAuthenticateUser;

/**
 * Created by francis on 10/16/17.
 */
public interface LoginAuthenticationService {

    public void authenticate(RequestAuthenticateUser authenticateUser);

}
