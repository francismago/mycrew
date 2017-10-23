package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by francis on 10/13/17.
 */

@Entity
@Table(name = "admin_account")
public class AdminAccount {

    private String username;
    private String password;
    private String token;

    public AdminAccount() {
    }

    private AdminAccount(String username, String password, String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }

    @Id @Column(name = "username")
    public String getUsername() {
        return username;
    }
    @Column(name = "password")
    public String getPassword() {
        return password;
    }
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "AdminAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
