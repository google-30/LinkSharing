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
public class UserController {


    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        String message = "HELLO SPRING MVC HOW R U";
        return new ModelAndView("hello", "message", message);
    }

    @RequestMapping(value = "/api/user/login", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    @RequestMapping(value = "/api/user/logout", method = RequestMethod.POST)
    @ResponseBody
    public String doLogout(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    @RequestMapping(value = "/api/user/register", method = RequestMethod.POST)
    @ResponseBody
    public String doRegister(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    @RequestMapping(value = "/api/user/forgotpassword", method = RequestMethod.POST)
    @ResponseBody
    public String forgotPassword(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    @RequestMapping(value = "/api/user/editprofile", method = RequestMethod.POST)
    @ResponseBody
    public String editProfile(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    @RequestMapping(value = "/api/user/changepassword", method = RequestMethod.POST)
    @ResponseBody
    public String changePassword(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    // first all subscribed topics would be send
    // then user will choose from that list and ( send email + topic name in request )
    // response should be only success message
    @RequestMapping(value = "/api/user/sendinvitation" , method = RequestMethod.POST)
    @ResponseBody
    public String sendInvitation(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    // GET ALL TOPICS CREATED BY USER
    // NO LOGIN NEEDED . ANY ONE CAN VIEW USER
    // ajax call on user profile page load ( no data in req as such )
    // response will contain
    @RequestMapping(value = "/api/user/getalltopics" , method = RequestMethod.POST)
    @ResponseBody
    public String getAllUserTopics(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }



    // request can come from user profile page
    // GET ALL POSTS CREATED BY USER
    // NO LOGIN NEEDED . ANY ONE CAN VIEW USER
    @RequestMapping(value = "/api/user/getallposts" , method = RequestMethod.POST)
    @ResponseBody
    public String getAllUserPosts(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    // GET ALL SUBSCRIBED TOPICS FOR  USER
    // NO LOGIN NEEDED . ANY ONE CAN VIEW USER
    @RequestMapping(value = "/api/user/getallsubscribedtopics" , method = RequestMethod.POST)
    @ResponseBody
    public String getAllUserSubscribedTopics(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }





}
