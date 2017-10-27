package com.arbalest.mycrew.model.db;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;

/**
 * Created by francis on 10/23/17.
 */

@Entity
@Table(name = "club")
public class Club {

    private Integer clubId;
    private String clubName;
    private String clubAbbr;
    private String clubType;
    private String premiumStatus;
    private Timestamp createTime;


    private ClubAccount clubAccount;

    @OneToOne(mappedBy = "club")
    @Cascade(CascadeType.SAVE_UPDATE)
    public ClubAccount getClubAccount() {
        return clubAccount;
    }

    public void setClubAccount(ClubAccount clubAccount) {
        this.clubAccount = clubAccount;
    }

    public Club() {
    }

    public Club(Integer clubId, String clubName, String clubAbbr, String clubType, String premiumStatus, Timestamp createTime, ClubAccount clubAccount) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.clubAbbr = clubAbbr;
        this.clubType = clubType;
        this.premiumStatus = premiumStatus;
        this.createTime = createTime;
        this.clubAccount = clubAccount;
    }


    @Id @Column(name = "clubId")
    public Integer getClubId() {
        return clubId;
    }

    @Column(name = "clubName")
    public String getClubName() {
        return clubName;
    }

    @Column(name = "clubAbbr")
    public String getClubAbbr() {
        return clubAbbr;
    }

    @Column(name = "clubType")
    public String getClubType() {
        return clubType;
    }

    @Column(name = "premiumStatus")
    public String getPremiumStatus() {
        return premiumStatus;
    }

    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }


    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setClubAbbr(String clubAbbr) {
        this.clubAbbr = clubAbbr;
    }

    public void setClubType(String clubType) {
        this.clubType = clubType;
    }

    public void setPremiumStatus(String premiumStatus) {
        this.premiumStatus = premiumStatus;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", clubAbbr='" + clubAbbr + '\'' +
                ", clubType='" + clubType + '\'' +
                ", premiumStatus='" + premiumStatus + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
