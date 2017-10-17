package com.arbalest.mycrew.exceptions;

/**
 * Created by francis on 10/16/17.
 */
public class AuthenticationFailedException extends RuntimeException {
    private String errorMsg;

    public AuthenticationFailedException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return "AuthenticationFailedException{" +
                "errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
