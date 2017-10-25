package com.arbalest.mycrew.model.db;

import javax.persistence.*;

/**
 * Created by francis on 10/23/17.
 */

@Embeddable
@Table(name = "game_player_statistic")
public class GamePlayerStatistic {
    private GamePlayerStatisticId id;
    private Boolean gameStarted;
    private Integer points;
    private Integer assists;
    private Integer steals;
    private Integer blocks;
    private Integer rebounds;
    private Integer fouls;
    private Integer turnovers;
    private Integer freeThrowsMade;
    private Integer freeThrowsAttempt;
    private Integer fieldGoalsMade;
    private Integer fieldGoalsAttempt;
    private Integer threePointMade;
    private Integer threePointAttempt;
    private Integer offensiveRebound;
    private Integer defensiveRebound;

    public GamePlayerStatistic() {
    }

    public GamePlayerStatistic(GamePlayerStatisticId id, Boolean gameStarted, Integer points, Integer assists, Integer steals, Integer blocks, Integer rebounds, Integer fouls, Integer turnovers, Integer freeThrowsMade, Integer freeThrowsAttempt, Integer fieldGoalsMade, Integer fieldGoalsAttempt, Integer threePointMade, Integer threePointAttempt, Integer offensiveRebound, Integer defensiveRebound) {
        this.id = id;
        this.gameStarted = gameStarted;
        this.points = points;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.rebounds = rebounds;
        this.fouls = fouls;
        this.turnovers = turnovers;
        this.freeThrowsMade = freeThrowsMade;
        this.freeThrowsAttempt = freeThrowsAttempt;
        this.fieldGoalsMade = fieldGoalsMade;
        this.fieldGoalsAttempt = fieldGoalsAttempt;
        this.threePointMade = threePointMade;
        this.threePointAttempt = threePointAttempt;
        this.offensiveRebound = offensiveRebound;
        this.defensiveRebound = defensiveRebound;
    }

    @EmbeddedId
    @Column(name = "id")
    public GamePlayerStatisticId getId() {
        return id;
    }

    @Column(name = "gameStarted")
    public Boolean getGameStarted() {
        return gameStarted;
    }

    @Column(name = "points")
    public Integer getPoints() {
        return points;
    }

    @Column(name = "assists")
    public Integer getAssists() {
        return assists;
    }

    @Column(name = "steals")
    public Integer getSteals() {
        return steals;
    }

    @Column(name = "blocks")
    public Integer getBlocks() {
        return blocks;
    }

    @Column(name = "rebounds")
    public Integer getRebounds() {
        return rebounds;
    }

    @Column(name = "fouls")
    public Integer getFouls() {
        return fouls;
    }

    @Column(name = "turnovers")
    public Integer getTurnovers() {
        return turnovers;
    }

    @Column(name = "freeThrowsMade")
    public Integer getFreeThrowsMade() {
        return freeThrowsMade;
    }

    @Column(name = "freeThrowsAttempt")
    public Integer getFreeThrowsAttempt() {
        return freeThrowsAttempt;
    }

    @Column(name = "fieldGoalsMade")
    public Integer getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    @Column(name = "fieldGoalsAttempt")
    public Integer getFieldGoalsAttempt() {
        return fieldGoalsAttempt;
    }

    @Column(name = "threePointName")
    public Integer getThreePointMade() {
        return threePointMade;
    }

    @Column(name = "threePointAttempt")
    public Integer getThreePointAttempt() {
        return threePointAttempt;
    }

    @Column(name = "offensiveRebound")
    public Integer getOffensiveRebound() {
        return offensiveRebound;
    }

    @Column(name = "defensiveRebound")
    public Integer getDefensiveRebound() {
        return defensiveRebound;
    }

    public void setId(GamePlayerStatisticId id) {
        this.id = id;
    }

    public void setGameStarted(Boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }

    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    public void setFreeThrowsMade(Integer freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }

    public void setFreeThrowsAttempt(Integer freeThrowsAttempt) {
        this.freeThrowsAttempt = freeThrowsAttempt;
    }

    public void setFieldGoalsMade(Integer fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public void setFieldGoalsAttempt(Integer fieldGoalsAttempt) {
        this.fieldGoalsAttempt = fieldGoalsAttempt;
    }

    public void setThreePointMade(Integer threePointMade) {
        this.threePointMade = threePointMade;
    }

    public void setThreePointAttempt(Integer threePointAttempt) {
        this.threePointAttempt = threePointAttempt;
    }

    public void setOffensiveRebound(Integer offensiveRebound) {
        this.offensiveRebound = offensiveRebound;
    }

    public void setDefensiveRebound(Integer defensiveRebound) {
        this.defensiveRebound = defensiveRebound;
    }

    @Override
    public String toString() {
        return "GamePlayerStatistic{" +
                "id=" + id +
                ", gameStarted=" + gameStarted +
                ", points=" + points +
                ", assists=" + assists +
                ", steals=" + steals +
                ", blocks=" + blocks +
                ", rebounds=" + rebounds +
                ", fouls=" + fouls +
                ", turnovers=" + turnovers +
                ", freeThrowsMade=" + freeThrowsMade +
                ", freeThrowsAttempt=" + freeThrowsAttempt +
                ", fieldGoalsMade=" + fieldGoalsMade +
                ", fieldGoalsAttempt=" + fieldGoalsAttempt +
                ", threePointMade=" + threePointMade +
                ", threePointAttempt=" + threePointAttempt +
                ", offensiveRebound=" + offensiveRebound +
                ", defensiveRebound=" + defensiveRebound +
                '}';
    }
}
