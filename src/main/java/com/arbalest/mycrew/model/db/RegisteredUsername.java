//package com.arbalest.mycrew.model.db;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import java.sql.Timestamp;
//
///**
// * Created by francis on 10/17/17.
// */
//@Entity
//@Table(name = "registered_username", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
//public class RegisteredUsername {
//    private String username;
//    private String userType;
//    private Timestamp createTime;
//
//    public RegisteredUsername() {
//    }
//
//    private RegisteredUsername(String username, String userType, Timestamp createTime) {
//        this.username = username;
//        this.userType = userType;
//        this.createTime = createTime;
//    }
//
//
//
//     @Column(name = "username", unique = true)
//    public String getUsername() {
//        return username;
//    }
//
//    @Column(name = "userType")
//    public String getUserType() {
//        return userType;
//    }
//
//    @Column(name = "createTime")
//    public Timestamp getCreateTime() {
//        return createTime;
//    }
//
//    public static class Builder{
//        private String username;
//        private String userType;
//        private Timestamp createTime;
//
//        public Builder(String username, String userType, Timestamp createTime) {
//            this.username = username;
//            this.userType = userType;
//            this.createTime = createTime;
//        }
//
//        public RegisteredUsername build(){
//            return new RegisteredUsername(username,userType, createTime);
//        }
//    }
//}
