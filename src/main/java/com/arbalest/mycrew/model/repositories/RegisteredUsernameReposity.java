package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.RegisteredUsername;
import com.arbalest.mycrew.model.db.RegisteredUsernameId;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by francis on 10/17/17.
 */
public interface RegisteredUsernameReposity extends CrudRepository<RegisteredUsername,RegisteredUsernameId> {

}
