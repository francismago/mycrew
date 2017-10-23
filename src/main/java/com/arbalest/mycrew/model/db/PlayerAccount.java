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
