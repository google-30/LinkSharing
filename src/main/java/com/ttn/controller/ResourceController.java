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
public class ResourceController {

    @RequestMapping(value = "/api/resource/sharelink" , method = RequestMethod.POST)
    @ResponseBody
    public String shareLink(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    @RequestMapping(value = "/api/resource/sharedocument" , method = RequestMethod.POST)
    @ResponseBody
    public String shareDocument(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    //GET COMPLETE POST DETAILS ON CLICKING .
    @RequestMapping(value = "/api/resource/viewpost" , method = RequestMethod.POST)
    @ResponseBody
    public String viewPost(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }



    //ONLY ADMIN AND CREATOR OF POST CAN DO THIS .
    @RequestMapping(value = "/api/resource/editpost" , method = RequestMethod.POST)
    @ResponseBody
    public String editPost(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    //ONLY ADMIN AND CREATOR OF POST CAN DO THIS .
    @RequestMapping(value = "/api/resource/deletepost" , method = RequestMethod.POST)
    @ResponseBody
    public String deletePost(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    //ONLY LOGGEDIN USERS CAN RATE POSTS
    @RequestMapping(value = "/api/resource/ratepost" , method = RequestMethod.POST)
    @ResponseBody
    public String ratePost(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }


    //
    @RequestMapping(value = "/api/resource/downloadpost" , method = RequestMethod.POST)
    @ResponseBody
    public String downloadPost(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }








}
