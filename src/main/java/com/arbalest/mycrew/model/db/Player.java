package com.arbalest.mycrew.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by francis on 10/20/17.
 */
@Entity
@Table(name = "player")
public class Player {
    private Integer ballerId;
    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private Timestamp birthday;

    public Player() {
    }

    public Player(Integer ballerId, String firstName, String lastName, String country, String city, Timestamp birthday) {
        this.ballerId = ballerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.birthday = birthday;
    }


    @Id @Column(name = "ballerId")
    public Integer getBallerId() {
        return ballerId;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    @Column(name = "birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBallerId(Integer ballerId) {
        this.ballerId = ballerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public static class Builder{
        private Integer ballerId;
        private String firstName;
        private String lastName;
        private String country;
        private String city;
        private Timestamp birthday;

        public Builder() {
        }

        public Builder(Player player){
            this.ballerId = player.ballerId;
            this.firstName = player.firstName;
            this.lastName = player.lastName;
            this.country = player.country;
            this.city = player.city;
            this.birthday = player.birthday;

        }

        public Builder ballerId(Integer ballerId){
            this.ballerId = ballerId;
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

        public Builder birthday(){
            this.birthday = birthday;
            return this;
        }

    }

}
