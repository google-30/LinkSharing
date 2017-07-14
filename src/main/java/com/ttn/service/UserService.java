package com.ttn.service;

import com.ttn.model.Subscription;
import com.ttn.model.Topic;

import java.util.List;

public interface UserService {


    //method declaration for getting all topics created by user
    public List<Topic> listCreatedTopics(Long userid);

    //public List<Subscription> listSubscribedTopics(Long userid);

    //public void sendInvitation(Long userid);






}
