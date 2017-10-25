package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by francis on 10/24/17.
 */
@Embeddable
public class GamePlayerStatisticId {
    private Integer ballerId;
    private Integer gameId;

    public GamePlayerStatisticId() {
    }

    public GamePlayerStatisticId(Integer ballerId, Integer gameId) {
        this.ballerId = ballerId;
        this.gameId = gameId;
    }

    @Column(name = "ballerId")
    public Integer getBallerId() {
        return ballerId;
    }

    @Column(name = "gameId")
    public Integer getGameId() {
        return gameId;
    }

    public void setBallerId(Integer ballerId) {
        this.ballerId = ballerId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GamePlayerStatisticId that = (GamePlayerStatisticId) o;

        if (!ballerId.equals(that.ballerId)) return false;
        return gameId.equals(that.gameId);

    }

    @Override
    public int hashCode() {
        int result = ballerId.hashCode();
        result = 31 * result + gameId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "GamePlayerStatisticId{" +
                "ballerId=" + ballerId +
                ", gameId=" + gameId +
                '}';
    }
}
