package com.arbalest.mycrew.model.vo;

/**
 * Created by francis on 10/26/17.
 */
public class ClubVo {

    private String username;
    private String password;
    private String clubName;
    private String clubAbbr;
    private String clubType;

    public ClubVo() {
    }

    public ClubVo(String username, String password, String clubName, String clubAbbr, String clubType) {
        this.username = username;
        this.password = password;
        this.clubName = clubName;
        this.clubAbbr = clubAbbr;
        this.clubType = clubType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubAbbr() {
        return clubAbbr;
    }

    public void setClubAbbr(String clubAbbr) {
        this.clubAbbr = clubAbbr;
    }

    public String getClubType() {
        return clubType;
    }

    public void setClubType(String clubType) {
        this.clubType = clubType;
    }


    public static class Builder{

        private String username;
        private String password;
        private String clubName;
        private String clubAbbr;
        private String clubType;

        public Builder() {
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder clubName(String clubName){
            this.clubName = clubName;
            return this;
        }

        public Builder clubAbbr(String clubAbbr){
            this.clubAbbr = clubAbbr;
            return this;
        }

        public Builder clubType(String clubType){
            this.clubType = clubType;
            return this;
        }

        public ClubVo build(){
            return new ClubVo(username,password,clubName,clubAbbr,clubType);
        }

    }
}
