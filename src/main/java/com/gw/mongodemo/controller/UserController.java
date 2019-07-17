package com.gw.mongodemo.controller;

import com.gw.mongodemo.dao.UserDao;
import com.gw.mongodemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping()
    public List<User> showAll() {
        return userDao.findAll();
    }
}
