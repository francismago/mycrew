package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by francis on 10/23/17.
 */
@Entity
@Table(name = "achievements")
public class Achievements {

    private Integer achievementsId;
    private Integer ballerId;
    private String type;
    private String value;
    private Integer seasonId;
    private Integer gameId;
    private Timestamp year;

    public Achievements() {
    }

    public Achievements(Integer achievementsId, Integer ballerId, String type, String value, Integer seasonId, Integer gameId, Timestamp year) {
        this.achievementsId = achievementsId;
        this.ballerId = ballerId;
        this.type = type;
        this.value = value;
        this.seasonId = seasonId;
        this.gameId = gameId;
        this.year = year;
    }

    @Id @Column(name = "achievementsId")
    public Integer getAchievementsId() {
        return achievementsId;
    }

    @Column(name = "ballerId")
    public Integer getBallerId() {
        return ballerId;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    @Column(name = "value")
    public String getValue() {
        return value;
    }

    @Column(name="seasonId")
    public Integer getSeasonId() {
        return seasonId;
    }

    @Column(name ="gameId")
    public Integer getGameId() {
        return gameId;
    }

    @Column(name = "year")
    public Timestamp getYear() {
        return year;
    }

    public void setAchievementsId(Integer achievementsId) {
        this.achievementsId = achievementsId;
    }

    public void setBallerId(Integer ballerId) {
        this.ballerId = ballerId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public void setYear(Timestamp year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Achievements{" +
                "achievementsId=" + achievementsId +
                ", ballerId=" + ballerId +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", seasonId=" + seasonId +
                ", gameId=" + gameId +
                ", year=" + year +
                '}';
    }
}
