package com.arbalest.mycrew.model.db;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by francis on 10/23/17.
 */
@Entity
@Table(name = "club_account")
public class ClubAccount {

    private Integer clubId;
    private String username;
    private String password;
    private String accountType;
    private Timestamp createTime;
    private String token;
    private String remarks;

    private Club club;

    @OneToOne(fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "clubId")
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public ClubAccount() {
    }

    public ClubAccount(Integer clubId, String username, String password, String accountType, Timestamp createTime, String token, String remarks, Club club) {
        this.clubId = clubId;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.createTime = createTime;
        this.token = token;
        this.remarks = remarks;
        this.club = club;
    }


    @Id @Column(name = "clubId")
    public Integer getClubId() {
        return clubId;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    @Column(name = "accountType")
    public String getAccountType() {
        return accountType;
    }

    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    @Column(name = "token")
    public String getToken() {
        return token;
    }

    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }


    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    @Override
    public String toString() {
        return "ClubAccount{" +
                "clubId=" + clubId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountType='" + accountType + '\'' +
                ", createTime=" + createTime +
                ", token='" + token + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }




}
