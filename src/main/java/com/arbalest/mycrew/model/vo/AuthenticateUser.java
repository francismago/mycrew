package com.arbalest.mycrew.model.vo;

import com.arbalest.mycrew.model.enums.UserType;

/**
 * Created by francis on 10/16/17.
 */
public class AuthenticateUser {

    private String username;
    private String password;
    private String validateCode;
    private UserType userType;

    public AuthenticateUser() {
    }

    private AuthenticateUser(String username, String password, String validateCode, UserType userType) {
        this.username = username;
        this.password = password;
        this.validateCode = validateCode;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public UserType getUserType() {
        return userType;
    }

    public class Builder{
        private String username;
        private String password;
        private String validateCode;
        private UserType userType;

        public Builder(String username, String password, UserType userType) {
            this.username = username;
            this.password = password;
            this.userType = userType;
        }

        public Builder(String username, String password, String validateCode, UserType userType) {
            this.username = username;
            this.password = password;
            this.validateCode = validateCode;
            this.userType = userType;
        }

        public AuthenticateUser build(){
            return new AuthenticateUser(username,password, validateCode,userType);
        }

    }
}
