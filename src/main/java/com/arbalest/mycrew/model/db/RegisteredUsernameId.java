package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by francis on 10/23/17.
 */
@Embeddable
public class RegisteredUsernameId implements Serializable {

    private String username;
    private String userType;

    public RegisteredUsernameId() {
    }

    public RegisteredUsernameId(String username, String userType) {
        this.username = username;
        this.userType = userType;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    @Column(name = "userType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "RegisteredUsernameId{" +
                "username='" + username + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
