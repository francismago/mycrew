package com.arbalest.mycrew.repository;

import com.arbalest.mycrew.model.db.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/20/17.
 */
@Repository
public interface PlayerDao  extends CrudRepository<Player,Integer>{
}
