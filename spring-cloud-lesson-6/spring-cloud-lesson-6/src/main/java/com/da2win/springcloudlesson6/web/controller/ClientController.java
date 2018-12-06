package com.da2win.springcloudlesson6.web.controller;

import com.da2win.springcloudlesson6.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Client {@link RestController}
 *
 * @Author Darwin
 * @Date 2018/12/5 15:35
 */
@RestController
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-provider.host}")
    private String serviceProviderHost;

    @Value("${service-provider.port}")
    private Integer serviceProviderPort;

    @Value("${service-provider.name}")
    private String serviceProviderName;

    @GetMapping("/index")
    public String index() {
        User user = new User();
        user.setId(1L);
        user.setName("米夏埃尔");
        //return restTemplate.postForObject("http://" + serviceProviderHost + ":" + serviceProviderPort //
        //         + "/greeting", user, String.class);
        return restTemplate.postForObject("http://" + serviceProviderName //
                 + "/greeting", user, String.class);
    }
}
