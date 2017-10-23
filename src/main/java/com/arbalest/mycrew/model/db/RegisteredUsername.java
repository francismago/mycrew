package com.arbalest.mycrew.model.db;


import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by francis on 10/17/17.
 */
@Entity
@Table(name = "registered_username")
public class RegisteredUsername {
    private RegisteredUsernameId id;
    private Timestamp createTime;

    public RegisteredUsername() {
    }

    public RegisteredUsername(RegisteredUsernameId id, Timestamp createTime) {
        this.id = id;
        this.createTime = createTime;
    }

    @EmbeddedId
    @Column(name = "id")
    public RegisteredUsernameId getId() {
        return id;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }


    public void setId(RegisteredUsernameId id) {
        this.id = id;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RegisteredUsername{" +
                "id=" + id +
                ", createTime=" + createTime +
                '}';
    }
}
