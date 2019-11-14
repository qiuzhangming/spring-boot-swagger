package com.zzdz.springbootswagger.controller;

import com.zzdz.springbootswagger.model.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * http://192.168.1.237:8080/swagger-ui.html
 */@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello:" + new Date();
    }

    @PostMapping("/user")
    public User addUser(User user) {
        System.out.println(user);
        user.setUsername("添加的");
        return user;
    }

    @GetMapping("/user")
    public User getUser(User user) {
        System.out.println(user);
        user.setUsername("查询的");
        return user;
    }
}
