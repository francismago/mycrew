package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/27/17.
 */
@Repository
public interface ClubRepository extends CrudRepository<Club,Integer> {
}
