package com.arbalest.mycrew.dao.implementations;

import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.model.db.Player;
import com.arbalest.mycrew.model.db.PlayerAccount;
import com.arbalest.mycrew.model.repositories.PlayerAccountRepository;
import com.arbalest.mycrew.model.vo.PlayerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/26/17.
 */
@Repository("playerRegistrationDao")
public class PlayerRegistrationDao implements SaveDataRepository<PlayerVo> {

    @Autowired
    private PlayerAccountRepository playerAccountRepository;

    @Override
    public void save(DataModelCommand dataModelCommand, PlayerVo data) {
        if (DataModelCommand.PLAYER_SAVE_NEW_ACCOUNT!=dataModelCommand)
            return;

        PlayerAccount playerAccount = new PlayerAccount();
        Player player = new Player();

        playerAccountRepository.save(playerAccount);


    }
}
