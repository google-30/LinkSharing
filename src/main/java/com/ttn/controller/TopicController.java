package com.ttn.controller;

import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.portlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.google.gson.Gson;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopicController {


    // LOGIN NOT NEEDED
    @RequestMapping(value = "/api/topic/getusers", method = RequestMethod.POST)
    @ResponseBody
    public String getUsers(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";


    }


    // LOGIN NOT NEEDED
    // return the complete list of RESOURCE objects which has complete details of that topic
    @RequestMapping(value = "/api/topic/getallposts", method = RequestMethod.POST)
    @ResponseBody
    public String getAllPosts(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";



    }

    // LOGIN NOT NEEDED
    @RequestMapping(value = "/api/topic/gettopposts", method = RequestMethod.POST)
    @ResponseBody
    public String getTopPosts(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    // LOGIN NOT NEEDED
    // return the total no of subscription for that topic
    @RequestMapping(value = "/api/topic/countsubscriptions", method = RequestMethod.POST)
    @ResponseBody
    public String countSubscriptions(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }



    // LOGIN NOT NEEDED
    // return the total no of posts or resources added for that topic
    @RequestMapping(value = "/api/topic/countposts", method = RequestMethod.POST)
    @ResponseBody
    public String countPosts(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }



    // LOGIN  NEEDED
    @RequestMapping(value = "/api/topic/trendingtopics", method = RequestMethod.POST)
    @ResponseBody
    public String getTrendingTopics(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }



    // LOGIN NEEDED
    @RequestMapping(value = "/api/topic/createtopic" , method = RequestMethod.POST)
    @ResponseBody
    public String createTopic(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    // edit will only be done by topic creator and admin
    //  LOGIN NEEDED + ABOVE REQ.
    @RequestMapping(value = "/api/topic/edittopic", method = RequestMethod.POST)
    @ResponseBody
    public String editTopic(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    // delete will only be done by topic creator and admin
    //  LOGIN NEEDED + ABOVE REQ.
    @RequestMapping(value = "/api/topic/deletetopic", method = RequestMethod.POST)
    @ResponseBody
    public String deleteTopic(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    // LOGIN NEEDED
    @RequestMapping(value = "/api/topic/subscribetopic" , method = RequestMethod.POST)
    @ResponseBody
    public String subscribeTopic(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    // LOGIN NEEDED
    @RequestMapping(value = "/api/topic/unsubscribetopic" , method = RequestMethod.POST)
    @ResponseBody
    public String unsubscribeTopic(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }



}
