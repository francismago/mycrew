package com.arbalest.mycrew.services.interfaces;

import com.arbalest.mycrew.model.db.RegisteredUsername;

/**
 * Created by francis on 10/17/17.
 */
public interface PeekerService {

    public RegisteredUsername peekRegisteredUser(String username);
}
