package com.da2win.springcloudlesson3configclient.web.controller;

import com.da2win.springcloudlesson3configclient.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * @Author Darwin
 * @Date 2018/12/3 10:02
 * @since 1.0.0
 */
@RestController
@EnableConfigurationProperties(User.class)
public class UserController {

    // 通过构造器注入
    private final User user;

    @Autowired
    public UserController(User user) {
        this.user = user;
    }

    @GetMapping("/user")
    public User user() {
        return user;
    }
}
