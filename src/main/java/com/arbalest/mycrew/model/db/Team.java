package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by francis on 10/23/17.
 */
@Entity
@Table(name = "team")
public class Team {

    private Integer teamId;
    private Integer clubId;
    private Integer seasonId;
    private String teamName;
    private String players;
    private String coachName;
    private String location;

    public Team() {
    }

    public Team(Integer teamId, Integer clubId, Integer seasonId, String teamName, String players, String coachName, String location) {
        this.teamId = teamId;
        this.clubId = clubId;
        this.seasonId = seasonId;
        this.teamName = teamName;
        this.players = players;
        this.coachName = coachName;
        this.location = location;
    }

    @Id @Column(name = "teamId")
    public Integer getTeamId() {
        return teamId;
    }

    @Column(name = "clubId")
    public Integer getClubId() {
        return clubId;
    }

    @Column(name = "seasonId")
    public Integer getSeasonId() {
        return seasonId;
    }

    @Column(name = "teamName")
    public String getTeamName() {
        return teamName;
    }

    @Column(name = "players")
    public String getPlayers() {
        return players;
    }

    @Column(name = "coachName")
    public String getCoachName() {
        return coachName;
    }

    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", clubId=" + clubId +
                ", seasonId=" + seasonId +
                ", teamName='" + teamName + '\'' +
                ", players='" + players + '\'' +
                ", coachName='" + coachName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
