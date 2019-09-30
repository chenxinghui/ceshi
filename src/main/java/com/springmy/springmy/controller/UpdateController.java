package com.springmy.springmy.controller;

import com.springmy.springmy.pojo.User;
import com.springmy.springmy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/updateUser")
public class UpdateController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser" ,method = RequestMethod.POST)
    @ResponseBody
    public User getUser(String id, HttpServletRequest request){

        return userService.selectUserid(id);
    }
}
