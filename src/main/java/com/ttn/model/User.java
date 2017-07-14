package com.ttn.model;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "User")
public class User {


    private String email;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userid;

    private String username;

    private String password;
    private String firstname;
    private String lastname;
    private Boolean isAdmin;
    private Boolean isActive;
    private Date dateCreated;
    private Date lastUpdated;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "createdBy" , fetch = FetchType.LAZY)
    private List<Topic> topics = new ArrayList<Topic>();

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Subscription> subscriptions = new ArrayList<Subscription>();





    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isAdmin=" + isAdmin +
                ", isActive=" + isActive +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                ", topics=" + topics +
                ", subscriptions=" + subscriptions +
                '}';
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
