package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by francis on 10/23/17.
 */
@Entity
@Table(name = "system_logs")
public class SystemLogs {
    private String logId;
    private String logType;
    private String value;
    private String remarks;

    public SystemLogs() {
    }

    public SystemLogs(String logId, String logType, String value, String remarks) {
        this.logId = logId;
        this.logType = logType;
        this.value = value;
        this.remarks = remarks;
    }
    @Id @Column(name = "logId")
    public String getLogId() {
        return logId;
    }

    @Column(name = "logType")
    public String getLogType() {
        return logType;
    }

    @Column(name = "value")
    public String getValue() {
        return value;
    }

    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "SystemLogs{" +
                "logId='" + logId + '\'' +
                ", logType='" + logType + '\'' +
                ", value='" + value + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
