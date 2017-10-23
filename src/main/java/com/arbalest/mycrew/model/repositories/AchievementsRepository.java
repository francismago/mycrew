package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.Achievements;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/23/17.
 */
@Repository
public interface AchievementsRepository extends CrudRepository<Achievements,Integer> {

}
