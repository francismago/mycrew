package com.arbalest.mycrew.model.db;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
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

    private PlayerAccount playerAccount;

    @OneToOne(mappedBy = "player")
    @Cascade(CascadeType.SAVE_UPDATE)
    public PlayerAccount getPlayerAccount() {
        return playerAccount;
    }

    public void setPlayerAccount(PlayerAccount playerAccount) {
        this.playerAccount = playerAccount;
    }

    public Player() {
    }

    public Player(Integer ballerId, String firstName, String lastName, String country, String city, Timestamp birthday, PlayerAccount playerAccount) {
        this.ballerId = ballerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.birthday = birthday;
        this.playerAccount = playerAccount;
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

    @Override
    public String toString() {
        return "Player{" +
                "ballerId=" + ballerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
