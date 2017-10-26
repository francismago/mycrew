package com.arbalest.mycrew.dao.implementations;

import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.dao.interfaces.SearchDataRepository;
import com.arbalest.mycrew.dao.interfaces.UpdateDataRepository;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.model.vo.AuthenticateUser;

/**
 * Created by francis on 10/26/17.
 */
public class ClubDao implements SaveDataRepository,SearchDataRepository,UpdateDataRepository {

    private static String UNKNOWN = "UNKNOWN";

    @Override
    public void save(DataModelCommand dataModelCommand, Object data) {

    }

    @Override
    public Object search(DataModelCommand dataModelCommand, Object data) {
        switch (dataModelCommand){
//            case CLUB_LOGIN_VERIFICATION: loginVerification(data);
        }
        return null;
    }

    @Override
    public void update(DataModelCommand dataModelCommand, Object data) {

    }


    private AuthenticateUser loginVerification(AuthenticateUser authenticateUser) {
        if (authenticateUser!= null && authenticateUser.getUsername()!=null){

        }
        return new AuthenticateUser();
    }
}
