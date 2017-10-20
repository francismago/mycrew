package com.arbalest.mycrew.services.facades;

import com.arbalest.mycrew.model.vo.RequestNewPlayer;
import com.arbalest.mycrew.services.interfaces.SaveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 10/20/17.
 */
@Service
public class RegisterFacades {

    @Autowired
    private SaveDataService<RequestNewPlayer> playerService;

    public void registerNewPlayer(RequestNewPlayer requestNewPlayer){
        playerService.save(requestNewPlayer);

    }
}
