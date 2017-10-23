//package com.arbalest.mycrew.model.db;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.io.Serializable;
//
///**
// * Created by francis on 10/23/17.
// */
//@Embeddable
//@Table(name = "club_player_info")
//public class ClubPlayerInfo{
//
//    private Integer ballerId;
//    private Integer clubId;
//    private Integer teamId;
//    private String jerseyNo;
//    private String alias;
//    private String position;
//    private String remark;
//
//    public ClubPlayerInfo() {
//    }
//
//    public ClubPlayerInfo(Integer ballerId, Integer clubId, Integer teamId, String jerseyNo, String alias, String position, String remark) {
//        this.ballerId = ballerId;
//        this.clubId = clubId;
//        this.teamId = teamId;
//        this.jerseyNo = jerseyNo;
//        this.alias = alias;
//        this.position = position;
//        this.remark = remark;
//    }
//
//
//    @Column(name = "ballerId")
//    public Integer getBallerId() {
//        return ballerId;
//    }
//
//    @Column(name = "clubId")
//    public Integer getClubId() {
//        return clubId;
//    }
//
//    @Column(name = "teamId")
//    public Integer getTeamId() {
//        return teamId;
//    }
//
//    @Column(name = "jerseyNo")
//    public String getJerseyNo() {
//        return jerseyNo;
//    }
//
//    @Column(name = "alias")
//    public String getAlias() {
//        return alias;
//    }
//
//    @Column(name = "position")
//    public String getPosition() {
//        return position;
//    }
//
//    @Column(name = "remarks")
//    public String getRemark() {
//        return remark;
//    }
//
//    public void setBallerId(Integer ballerId) {
//        this.ballerId = ballerId;
//    }
//
//    public void setClubId(Integer clubId) {
//        this.clubId = clubId;
//    }
//
//    public void setTeamId(Integer teamId) {
//        this.teamId = teamId;
//    }
//
//    public void setJerseyNo(String jerseyNo) {
//        this.jerseyNo = jerseyNo;
//    }
//
//    public void setAlias(String alias) {
//        this.alias = alias;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
//
//    @Override
//    public String toString() {
//        return "ClubPlayerInfo{" +
//                "remark='" + remark + '\'' +
//                ", position='" + position + '\'' +
//                ", alias='" + alias + '\'' +
//                ", jerseyNo='" + jerseyNo + '\'' +
//                ", teamId=" + teamId +
//                ", clubId=" + clubId +
//                ", ballerId=" + ballerId +
//                '}';
//    }
//}
