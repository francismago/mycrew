package com.arbalest.mycrew.services.implementations;

import com.arbalest.mycrew.model.db.AdminAccount;
import com.arbalest.mycrew.model.vo.AuthenticateUser;
import com.arbalest.mycrew.model.repositories.AdminAccountRepository;
import com.arbalest.mycrew.services.interfaces.LoginAuthenticationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/16/17.
 */
@Service
public class AdminLoginAuthentication implements LoginAuthenticationService {

    @Autowired
    private AdminAccountRepository adminAccountRepository;

    @Override
    public void authenticate(AuthenticateUser authenticateUser) {
        if (authenticateUser == null | authenticateUser.getUsername() == null || authenticateUser == null){
            System.out.println("no data");
            return;
        }

        AdminAccount adminAccount = adminAccountRepository.findOne(authenticateUser.getUsername());
        if (adminAccount == null){
            System.out.println("user does not exist");
        }else if(!StringUtils.equals(adminAccount.getUsername(),authenticateUser.getUsername()) ||
                 !StringUtils.equals(adminAccount.getPassword(),authenticateUser.getPassword())){
            System.out.println("username and password does not match");
        }else if(StringUtils.equals(adminAccount.getUsername(),authenticateUser.getUsername()) &&
                StringUtils.equals(adminAccount.getPassword(),authenticateUser.getPassword())){
            System.out.println("successful");
        }

    }
}
