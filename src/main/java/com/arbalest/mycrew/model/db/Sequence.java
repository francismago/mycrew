package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by francis on 10/23/17.
 */
@Entity
@Table(name = "sequence")
public class Sequence {
    private Integer sequenceId;
    private String type;
    private String value;

    public Sequence() {
    }

    public Sequence(Integer sequenceId, String type, String value) {
        this.sequenceId = sequenceId;
        this.type = type;
        this.value = value;
    }

    @Id @Column(name = "sequenceId")
    public Integer getSequenceId() {
        return sequenceId;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "sequenceId=" + sequenceId +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
