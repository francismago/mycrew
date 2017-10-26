package com.arbalest.mycrew.model.vo;

/**
 * Created by francis on 10/26/17.
 */
public class AuthenticationSession {

    private String username;
    private Boolean isSuccess;
    private String userType;
    private String token;

    public AuthenticationSession() {
    }

    public AuthenticationSession(String username, Boolean isSuccess) {
        this.username = username;
        this.isSuccess = isSuccess;
    }

    public AuthenticationSession(String username, Boolean isSuccess, String userType, String token) {
        this.username = username;
        this.isSuccess = isSuccess;
        this.userType = userType;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "AuthenticationSession{" +
                "username='" + username + '\'' +
                ", isSuccess=" + isSuccess +
                ", userType='" + userType + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
