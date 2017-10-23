package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by francis on 10/23/17.
 */
@Entity
@Table(name = "season")
public class Season {

    private Integer seasonId;
    private Integer clubId;
    private String seasonType;
    private String description;
    private String remarks;

    public Season() {
    }

    public Season(Integer seasonId, Integer clubId, String seasonType, String description, String remarks) {
        this.seasonId = seasonId;
        this.clubId = clubId;
        this.seasonType = seasonType;
        this.description = description;
        this.remarks = remarks;
    }

    @Id @Column(name = "seasonId")
    public Integer getSeasonId() {
        return seasonId;
    }

    @Column(name = "clubId")
    public Integer getClubId() {
        return clubId;
    }

    @Column(name = "seasonType")
    public String getSeasonType() {
        return seasonType;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public void setSeasonType(String seasonType) {
        this.seasonType = seasonType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Season{" +
                "remarks='" + remarks + '\'' +
                ", description='" + description + '\'' +
                ", seasonType='" + seasonType + '\'' +
                ", clubId=" + clubId +
                ", seasonId=" + seasonId +
                '}';
    }
}
