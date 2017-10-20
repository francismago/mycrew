package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by francis on 10/20/17.
 */
@Entity
@Table(name = "player_account")
public class PlayerAccount {

    private Integer ballerId;
    private String username;
    private String password;
    private Timestamp createTime;
    private String accountType;
    private String token;
    private String remarks;

    @Id @Column(name ="ballerId")
    public Integer getBallerId() {
        return ballerId;
    }

    @Column(name ="username")
    public String getUsername() {
        return username;
    }

    @Column(name ="password")
    public String getPassword() {
        return password;
    }

    @Column(name ="createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    @Column(name ="accountType")
    public String getAccountType() {
        return accountType;
    }

    @Column(name ="token")
    public String getToken() {
        return token;
    }

    @Column(name="remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setBallerId(Integer ballerId) {
        this.ballerId = ballerId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public PlayerAccount() {
    }

    public PlayerAccount(Integer ballerId, String username, String password, Timestamp createTime, String accountType, String token, String remarks) {
        this.ballerId = ballerId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.accountType = accountType;
        this.token = token;
        this.remarks = remarks;
    }

    public static class Builder{
        private Integer ballerId;
        private String username;
        private String password;
        private Timestamp createTime;
        private String accountType;
        private String token;
        private String remarks;

        public Builder() {
        }

        public Builder(PlayerAccount playerAccount) {
            this.ballerId = playerAccount.ballerId;
            this.username = playerAccount.username;
            this.password = playerAccount.password;
            this.createTime = playerAccount.createTime;
            this.accountType = playerAccount.accountType;
            this.token = playerAccount.token;
            this.remarks = playerAccount.remarks;
        }

        public Builder ballerId(Integer ballerId){
            this.ballerId = ballerId;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder createTime(Timestamp createTime){
            this.createTime = createTime;
            return this;
        }

        public Builder accountType(String accountType){
            this.accountType = accountType;
            return this;
        }

        public Builder token(String token){
            this.token = token;
            return this;
        }

        public Builder remarks(String remarks){
            this.remarks = remarks;
            return this;
        }

        public PlayerAccount build(){
            return new PlayerAccount(ballerId,username,password,createTime,accountType,token,remarks);
        }
    }

    @Override
    public String toString() {
        return "PlayerAccount{" +
                "ballerId=" + ballerId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", accountType='" + accountType + '\'' +
                ", token='" + token + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
