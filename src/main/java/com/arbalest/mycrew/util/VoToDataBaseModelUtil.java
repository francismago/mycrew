package com.arbalest.mycrew.util;

import com.arbalest.mycrew.model.db.Club;
import com.arbalest.mycrew.model.db.ClubAccount;
import com.arbalest.mycrew.model.db.Player;
import com.arbalest.mycrew.model.db.PlayerAccount;
import com.arbalest.mycrew.model.vo.ClubVo;
import com.arbalest.mycrew.model.vo.PlayerVo;

/**
 * Created by francis on 10/26/17.
 */
public class VoToDataBaseModelUtil {

    public static ClubAccount convertToClubAccount(ClubVo clubVo){
        ClubAccount clubAccount = new ClubAccount();

        return clubAccount;
    }



    public static PlayerAccount convertToplayer(PlayerVo playerVo){
        PlayerAccount playerAccount = new PlayerAccount();

        return playerAccount;
    }
}
