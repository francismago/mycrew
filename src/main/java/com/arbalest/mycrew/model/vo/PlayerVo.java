package com.arbalest.mycrew.model.vo;

import java.util.Date;

/**
 * Created by francis on 10/26/17.
 */
public class PlayerVo {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private Date birthday;

    public PlayerVo() {
    }

    public PlayerVo(String username, String password, String firstName, String lastName, String country, String city, Date birthday) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.birthday = birthday;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "PlayerVo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public static class Builder {
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String country;
        private String city;
        private Date birthday;

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder country(String country){
            this.country = country;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder birthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public PlayerVo build(){
            return new PlayerVo(username,password,firstName,lastName,country,city,birthday);
        }
    }

}
