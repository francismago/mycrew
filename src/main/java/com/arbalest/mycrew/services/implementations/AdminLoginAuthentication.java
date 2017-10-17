package com.arbalest.mycrew.services.implementations;

import com.arbalest.mycrew.model.vo.AuthenticateUser;
import com.arbalest.mycrew.services.interfaces.LoginAuthenticationService;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/16/17.
 */
@Service
public class AdminLoginAuthentication implements LoginAuthenticationService {

    @Override
    public void authenticate(AuthenticateUser authenticateUser) {

    }
}
