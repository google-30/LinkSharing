package com.ttn.classes;

import com.ttn.model.Topic;
import com.ttn.model.User;

import java.util.Date;

public class Subscription {

    private Topic topic;
    private User user;
    private Date dateCreated;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "topic=" + topic +
                ", user=" + user +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
