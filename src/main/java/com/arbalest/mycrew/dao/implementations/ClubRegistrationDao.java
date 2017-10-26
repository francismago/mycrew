package com.arbalest.mycrew.dao.implementations;

import com.arbalest.mycrew.dao.interfaces.GenerateDataRepository;
import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.enums.AccountType;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.enums.UserType;
import com.arbalest.mycrew.model.db.Club;
import com.arbalest.mycrew.model.db.ClubAccount;
import com.arbalest.mycrew.model.db.RegisteredUsername;
import com.arbalest.mycrew.model.db.RegisteredUsernameId;
import com.arbalest.mycrew.model.repositories.ClubAccountRepository;
import com.arbalest.mycrew.model.repositories.RegisteredUsernameReposity;
import com.arbalest.mycrew.model.vo.ClubVo;
import com.arbalest.mycrew.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by francis on 10/26/17.
 */
@Repository("clubRegistrationDao")
public class ClubRegistrationDao implements SaveDataRepository<ClubVo> {

    @Autowired
    private ClubAccountRepository clubAccountRepository;

    @Autowired
    private RegisteredUsernameReposity registeredUsernameReposity;

    @Autowired
    private GenerateDataRepository<Integer,Integer> generateIdDao;

    @Override
    public void save(DataModelCommand dataModelCommand, ClubVo data) {
        if (DataModelCommand.CLUB_SAVE_NEW_ACCOUNT != dataModelCommand)
            return;

        Timestamp now = new Timestamp(System.currentTimeMillis());
        Integer clubId = generateIdDao.generate(DataModelCommand.CLUB_GENERATE_ID, DateUtil.getYear());
        ClubAccount clubAccount =  new ClubAccount();
        clubAccount.setClubId(clubId);
        clubAccount.setAccountType(AccountType.PENDING.toString());
        clubAccount.setUsername(data.getUsername());
        clubAccount.setPassword(data.getPassword());
        clubAccount.setCreateTime(now);



        Club club = new Club();
        club.setClubId(clubId);
        club.setClubAbbr(data.getClubAbbr());
        club.setCreateTime(now);

//        clubAccount.setClub(club);

        clubAccountRepository.save(clubAccount);


        RegisteredUsernameId id = new RegisteredUsernameId(data.getUsername(), UserType.CLUB.name());
        RegisteredUsername registeredUsername = new RegisteredUsername(id,now);
        registeredUsernameReposity.save(registeredUsername);

        clubAccountRepository.save(clubAccount);
    }
}
