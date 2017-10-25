package com.arbalest.mycrew.model.db;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by francis on 10/23/17.
 */
@Embeddable
@Table(name = "club_player_info")
public class ClubPlayerInfo{

    private ClubPlayerInfoId id;
    private String jerseyNo;
    private String alias;
    private String position;
    private String remark;
    private Integer seasonYear;

    public ClubPlayerInfo() {
    }

    public ClubPlayerInfo(ClubPlayerInfoId id, String jerseyNo, String alias, String position, String remark, Integer seasonYear) {
        this.id = id;
        this.jerseyNo = jerseyNo;
        this.alias = alias;
        this.position = position;
        this.remark = remark;
        this.seasonYear = seasonYear;
    }


    @EmbeddedId
    @Column(name = "id")
    public ClubPlayerInfoId getId() {
        return id;
    }

    @Column(name = "jerseyNo")
    public String getJerseyNo() {
        return jerseyNo;
    }

    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    @Column(name = "remarks")
    public String getRemark() {
        return remark;
    }

    @Column(name = "seasonYear")
    public Integer getSeasonYear() {
        return seasonYear;
    }

    public void setId(ClubPlayerInfoId id) {
        this.id = id;
    }

    public void setJerseyNo(String jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSeasonYear(Integer seasonYear) {
        this.seasonYear = seasonYear;
    }

    @Override
    public String toString() {
        return "ClubPlayerInfo{" +
                "id=" + id +
                ", jerseyNo='" + jerseyNo + '\'' +
                ", alias='" + alias + '\'' +
                ", position='" + position + '\'' +
                ", remark='" + remark + '\'' +
                ", seasonYear=" + seasonYear +
                '}';
    }
}
