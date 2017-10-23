//package com.arbalest.mycrew.model.db;
//
//import javax.persistence.*;
//import javax.persistence.criteria.CriteriaBuilder;
//import java.sql.Timestamp;
//
///**
// * Created by francis on 10/23/17.
// */
//
//@Embeddable
//@Table(name = "club")
//public class Club {
//
//    private Integer clubId;
//    private String clubName;
//    private String clubAbbr;
//    private String clubType;
//    private String premiumStatus;
//    private Timestamp createTime;
//
//    public Club() {
//    }
//
//    public Club(Integer clubId, String clubName, String clubAbbr, String clubType, String premiumStatus, Timestamp createTime) {
//        this.clubId = clubId;
//        this.clubName = clubName;
//        this.clubAbbr = clubAbbr;
//        this.clubType = clubType;
//        this.premiumStatus = premiumStatus;
//        this.createTime = createTime;
//    }
//
//    @Column(name = "clubId")
//    public Integer getClubId() {
//        return clubId;
//    }
//
//    @Column(name = "clubName")
//    public String getClubName() {
//        return clubName;
//    }
//
//    @Column(name = "clubAbbr")
//    public String getClubAbbr() {
//        return clubAbbr;
//    }
//
//    @Column(name = "clubType")
//    public String getClubType() {
//        return clubType;
//    }
//
//    @Column(name = "premiumStatus")
//    public String getPremiumStatus() {
//        return premiumStatus;
//    }
//
//    @Column(name = "createTime")
//    public Timestamp getCreateTime() {
//        return createTime;
//    }
//
//    public void setClubId(Integer clubId) {
//        this.clubId = clubId;
//    }
//
//    public void setClubName(String clubName) {
//        this.clubName = clubName;
//    }
//
//    public void setClubAbbr(String clubAbbr) {
//        this.clubAbbr = clubAbbr;
//    }
//
//    public void setClubType(String clubType) {
//        this.clubType = clubType;
//    }
//
//    public void setPremiumStatus(String premiumStatus) {
//        this.premiumStatus = premiumStatus;
//    }
//
//    public void setCreateTime(Timestamp createTime) {
//        this.createTime = createTime;
//    }
//
//    @Override
//    public String toString() {
//        return "Club{" +
//                "createTime=" + createTime +
//                ", premiumStatus='" + premiumStatus + '\'' +
//                ", clubType='" + clubType + '\'' +
//                ", clubAbbr='" + clubAbbr + '\'' +
//                ", clubName='" + clubName + '\'' +
//                ", clubId=" + clubId +
//                '}';
//    }
//}
