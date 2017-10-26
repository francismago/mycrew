package com.arbalest.mycrew.services.implementations;

import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.model.vo.ClubVo;
import com.arbalest.mycrew.services.interfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/20/17.
 */
@Service("clubUserRegistration")
public class ClubUserRegistration implements UserRegistrationService<ClubVo> {

    @Autowired
    private SaveDataRepository<ClubVo> clubRegistrationDao;


    @Override
    public void register(ClubVo data) {
        clubRegistrationDao.save(DataModelCommand.CLUB_SAVE_NEW_ACCOUNT,data);
    }
}
