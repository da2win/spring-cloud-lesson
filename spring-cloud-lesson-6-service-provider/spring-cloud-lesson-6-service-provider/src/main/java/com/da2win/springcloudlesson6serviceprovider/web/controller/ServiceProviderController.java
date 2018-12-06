package com.da2win.springcloudlesson6serviceprovider.web.controller;

import com.da2win.springcloudlesson6serviceprovider.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 服务提供方 {@link RestController}
 * @Author Darwin
 * @Date 2018/12/5 15:08
 */
@RestController
public class ServiceProviderController {

    @Value("${server.port}")
    private Integer port;

    @PostMapping("/greeting")
    public String greeting(@RequestBody User user) {
        return "Greeting, " + user.toString() + " on port : " + port;
    }
}
