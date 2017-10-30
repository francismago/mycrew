package com.arbalest.mycrew.services.implementations;

import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.model.vo.PlayerVo;
import com.arbalest.mycrew.services.interfaces.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/30/17.
 */
@Service("playerUserRegistration")
public class PlayerUserRegistration implements UserRegistrationService<PlayerVo> {

    @Autowired
    private SaveDataRepository<PlayerVo> playerRegistrationDao;

    @Override
    public void register(PlayerVo data) {
        playerRegistrationDao.save(DataModelCommand.PLAYER_SAVE_NEW_ACCOUNT,data);
    }
}
