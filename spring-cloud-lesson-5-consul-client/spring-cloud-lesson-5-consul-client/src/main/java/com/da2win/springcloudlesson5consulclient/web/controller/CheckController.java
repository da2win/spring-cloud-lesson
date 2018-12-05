package com.da2win.springcloudlesson5consulclient.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Darwin
 * @Date 2018/12/5 11:28
 */
@RestController
public class CheckController {

    @GetMapping
    public String check() {
        return "OK";
    }
}
