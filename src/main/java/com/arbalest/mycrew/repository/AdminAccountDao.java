package com.arbalest.mycrew.repository;

import com.arbalest.mycrew.model.db.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/17/17.
 */
@Repository
public interface AdminAccountDao  extends CrudRepository<AdminAccount,String> {

}
