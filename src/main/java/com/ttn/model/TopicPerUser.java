package com.ttn.model;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class TopicPerUser implements Serializable {

    private String name;

    @OneToOne
    private User createdBy;

    public String getName() {

        return name;

    }


    public void setName(String name) {
        this.name = name;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }


}
