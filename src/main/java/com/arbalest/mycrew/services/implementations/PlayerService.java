package com.arbalest.mycrew.services.implementations;

import com.arbalest.mycrew.model.db.PlayerAccount;
import com.arbalest.mycrew.model.vo.RequestNewPlayer;
import com.arbalest.mycrew.model.repositories.PlayerAccountRepository;
import com.arbalest.mycrew.model.repositories.PlayerRepository;
import com.arbalest.mycrew.services.interfaces.SaveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

/**
 * Created by francis on 10/20/17.
 */
@Service
public class PlayerService implements SaveDataService<RequestNewPlayer> {

    @Autowired
    private PlayerAccountRepository playerAccountRepository;

    @Override
    public void save(RequestNewPlayer requestNewPlayer) {
        PlayerAccount playerAccount= new PlayerAccount();
//                                            .Builder()
//                                            .ballerId(generateId())
//                                            .username(requestNewPlayer.getUsername())
//                                            .password(requestNewPlayer.getPassword())
//                                            .build();
        playerAccountRepository.save(playerAccount);
    }


    private Integer generateId() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000000);
        String formatted = String.format("%08d", num);
        return Integer.valueOf(formatted);
    }
}
