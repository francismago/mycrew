package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.PlayerAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/20/17.
 */
@Repository
public interface PlayerAccountRepository extends CrudRepository<PlayerAccount, Integer>{
}
