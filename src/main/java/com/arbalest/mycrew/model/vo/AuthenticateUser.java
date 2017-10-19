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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
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

    @Override
    public String toString() {
        return "AuthenticateUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", validateCode='" + validateCode + '\'' +
                ", userType=" + userType +
                '}';
    }
}
