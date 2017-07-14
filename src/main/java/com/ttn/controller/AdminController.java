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
public class AdminController {


    @RequestMapping(value = "/api/admin/getallusers", method = RequestMethod.POST)
    @ResponseBody
    public String getAllUsers(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }

    @RequestMapping(value = "/api/admin/deactivateuser", method = RequestMethod.POST)
    @ResponseBody
    public String deactivateUser(@RequestBody String json) {

        System.out.println(json);
        return "{ \"error\" : \"Internal error occured\" }";

    }







}
