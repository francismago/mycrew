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
@Table(name = "game")
public class Game {

    private Integer gameId;
    private Integer seasonId;
    private Integer clubId;
    private String location;
    private Timestamp startDate;
    private Timestamp endDate;
    private String gameType;
    private Integer winnerTeamId;
    private Integer loserTeamId;
    private Integer winnerScore;
    private Integer loserScore;
    private Integer numberOfOT;
    private String remarks;


    public Game() {
    }

    public Game(Integer gameId, Integer seasonId, Integer clubId, String location, Timestamp startDate, Timestamp endDate, String gameType, Integer winnerTeamId, Integer loserTeamId, Integer winnerScore, Integer loserScore, Integer numberOfOT, String remarks) {
        this.gameId = gameId;
        this.seasonId = seasonId;
        this.clubId = clubId;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gameType = gameType;
        this.winnerTeamId = winnerTeamId;
        this.loserTeamId = loserTeamId;
        this.winnerScore = winnerScore;
        this.loserScore = loserScore;
        this.numberOfOT = numberOfOT;
        this.remarks = remarks;
    }

    @Id @Column(name = "gameId")
    public Integer getGameId() {
        return gameId;
    }

    @Column(name = "seasonId")
    public Integer getSeasonId() {
        return seasonId;
    }

    @Column(name = "clubId")
    public Integer getClubId() {
        return clubId;
    }

    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    @Column(name = "startDate")
    public Timestamp getStartDate() {
        return startDate;
    }

    @Column(name = "endDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    @Column(name = "gameType")
    public String getGameType() {
        return gameType;
    }

    @Column(name = "winnerTeamId")
    public Integer getWinnerTeamId() {
        return winnerTeamId;
    }

    @Column(name = "loserTeamId")
    public Integer getLoserTeamId() {
        return loserTeamId;
    }

    @Column(name = "winnerScore")
    public Integer getWinnerScore() {
        return winnerScore;
    }

    @Column(name = "loserScore")
    public Integer getLoserScore() {
        return loserScore;
    }

    @Column(name = "numberOfOT")
    public Integer getNumberOfOT() {
        return numberOfOT;
    }

    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void setWinnerTeamId(Integer winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }

    public void setLoserTeamId(Integer loserTeamId) {
        this.loserTeamId = loserTeamId;
    }

    public void setWinnerScore(Integer winnerScore) {
        this.winnerScore = winnerScore;
    }

    public void setLoserScore(Integer loserScore) {
        this.loserScore = loserScore;
    }

    public void setNumberOfOT(Integer numberOfOT) {
        this.numberOfOT = numberOfOT;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", seasonId=" + seasonId +
                ", clubId=" + clubId +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", gameType='" + gameType + '\'' +
                ", winnerTeamId=" + winnerTeamId +
                ", loserTeamId=" + loserTeamId +
                ", winnerScore=" + winnerScore +
                ", loserScore=" + loserScore +
                ", numberOfOT=" + numberOfOT +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
