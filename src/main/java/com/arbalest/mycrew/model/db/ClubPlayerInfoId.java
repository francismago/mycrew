package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by francis on 10/25/17.
 */
@Embeddable
public class ClubPlayerInfoId {

    private Integer clubId;
    private Integer seasonId;
    private Integer teamId;
    private Integer ballerId;

    public ClubPlayerInfoId() {
    }

    public ClubPlayerInfoId(Integer clubId, Integer seasonId, Integer teamId, Integer ballerId) {
        this.clubId = clubId;
        this.seasonId = seasonId;
        this.teamId = teamId;
        this.ballerId = ballerId;
    }

    @Column(name = "clubId")
    public Integer getClubId() {
        return clubId;
    }

    @Column(name = "seasonId")
    public Integer getSeasonId() {
        return seasonId;
    }

    @Column(name = "teamId")
    public Integer getTeamId() {
        return teamId;
    }

    @Column(name = "ballerId")
    public Integer getBallerId() {
        return ballerId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public void setBallerId(Integer ballerId) {
        this.ballerId = ballerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubPlayerInfoId that = (ClubPlayerInfoId) o;

        if (clubId != null ? !clubId.equals(that.clubId) : that.clubId != null) return false;
        if (seasonId != null ? !seasonId.equals(that.seasonId) : that.seasonId != null) return false;
        if (teamId != null ? !teamId.equals(that.teamId) : that.teamId != null) return false;
        return ballerId != null ? ballerId.equals(that.ballerId) : that.ballerId == null;

    }

    @Override
    public int hashCode() {
        int result = clubId != null ? clubId.hashCode() : 0;
        result = 31 * result + (seasonId != null ? seasonId.hashCode() : 0);
        result = 31 * result + (teamId != null ? teamId.hashCode() : 0);
        result = 31 * result + (ballerId != null ? ballerId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClubPlayerInfoId{" +
                "clubId=" + clubId +
                ", seasonId=" + seasonId +
                ", teamId=" + teamId +
                ", ballerId=" + ballerId +
                '}';
    }
}
