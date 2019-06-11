package com.bosch.nfc.controller;

import com.bosch.nfc.pojo.User;
import com.bosch.nfc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    @ResponseBody
    public List<User> test() {
        return userService.getAlluser();
    }

    @GetMapping("/testdate")
    @ResponseBody
    public List<User> testdate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return userService.testDateService(simpleDateFormat.format(date.getTime()));
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/node")
    public String node() {
        return "node";
    }
}
