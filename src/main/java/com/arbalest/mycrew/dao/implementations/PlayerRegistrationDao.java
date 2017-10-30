package com.arbalest.mycrew.dao.implementations;

import com.arbalest.mycrew.dao.interfaces.GenerateDataRepository;
import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.enums.AccountType;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.enums.UserType;
import com.arbalest.mycrew.model.db.Player;
import com.arbalest.mycrew.model.db.PlayerAccount;
import com.arbalest.mycrew.model.db.RegisteredUsername;
import com.arbalest.mycrew.model.db.RegisteredUsernameId;
import com.arbalest.mycrew.model.repositories.PlayerAccountRepository;
import com.arbalest.mycrew.model.repositories.PlayerRepository;
import com.arbalest.mycrew.model.repositories.RegisteredUsernameReposity;
import com.arbalest.mycrew.model.vo.PlayerVo;
import com.arbalest.mycrew.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

/**
 * Created by francis on 10/26/17.
 */
@Repository("playerRegistrationDao")
public class PlayerRegistrationDao implements SaveDataRepository<PlayerVo> {

    @Autowired
    private PlayerAccountRepository playerAccountRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private GenerateDataRepository<Integer,Integer> generateIdDao;

    @Autowired
    private RegisteredUsernameReposity registeredUsernameReposity;

    @Override
    public void save(DataModelCommand dataModelCommand, PlayerVo data) {
        if (DataModelCommand.PLAYER_SAVE_NEW_ACCOUNT!=dataModelCommand)
            return;

        System.out.println("PlayerRegistrationDao:save="+data);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Integer ballerId = generateIdDao.generate(DataModelCommand.PLAYER_GENERATE_ID, DateUtil.getYear());
        PlayerAccount playerAccount = new PlayerAccount();
        playerAccount.setBallerId(ballerId);
        playerAccount.setUsername(data.getUsername());
        playerAccount.setPassword(data.getPassword());
        playerAccount.setAccountType(AccountType.PENDING.toString());
        playerAccount.setCreateTime(now);

        playerAccountRepository.save(playerAccount);


        Player player = new Player();
        player.setBallerId(ballerId);
        player.setFirstName(data.getFirstName());
        player.setLastName(data.getLastName());
        player.setBirthday(new Timestamp(data.getBirthday().getTime()));
        player.setCountry(data.getCountry());
        player.setCity(data.getCity());
//        playerRepository.save(player);

        playerAccount.setPlayer(player);


        playerAccountRepository.save(playerAccount);


        RegisteredUsernameId id = new RegisteredUsernameId(data.getUsername(), UserType.PLAYER.name());
        RegisteredUsername registeredUsername = new RegisteredUsername(id,now);
        registeredUsernameReposity.save(registeredUsername);

    }
}
