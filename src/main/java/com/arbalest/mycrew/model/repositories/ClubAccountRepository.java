package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.ClubAccount;
import com.arbalest.mycrew.model.db.ClubPlayerInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by francis on 10/23/17.
 */
@Repository
public interface ClubAccountRepository extends CrudRepository<ClubAccount,Integer> {

}
