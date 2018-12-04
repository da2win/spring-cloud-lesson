package com.da2win.springcloudlesson4eurekaclient.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 状态 控制器
 * @Author Darwin
 * @Date 2018/12/3 17:24
 */
@RestController
public class StatusController {

    @GetMapping("/status")
    public String status() {
        return "OK";
    }

}
