package com.example.fanproject.controller;

import com.example.fanproject.model.Fan;
import com.example.fanproject.model.User;
import com.example.fanproject.service.FanService;
import com.example.fanproject.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class FanController {
    @Autowired
    private FanService fanService;

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @RequestMapping(value="/getFans", method = RequestMethod.GET)
    public List<Fan> getAllFans(){
        return fanService.getAllFans();
    }

    @RequestMapping(value="/getFansByM", method = RequestMethod.GET)
    public List<Fan> getFansByM(){
        return fanService.getFansByManufacturerName("spring");
    }

    @RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userDetailsService.getAllUsers();
    }
}
