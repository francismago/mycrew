package com.arbalest.mycrew.model.repositories;

import com.arbalest.mycrew.model.db.AdminAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/17/17.
 */
@Repository
public interface AdminAccountRepository extends CrudRepository<AdminAccount,String> {

}
