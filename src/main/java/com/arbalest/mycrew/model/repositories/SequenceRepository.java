package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.Sequence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/26/17.
 */
@Repository
public interface SequenceRepository extends CrudRepository<Sequence,Integer>{

    Sequence findByType(String type);
}
