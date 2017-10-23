package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/20/17.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player,Integer>{
}
