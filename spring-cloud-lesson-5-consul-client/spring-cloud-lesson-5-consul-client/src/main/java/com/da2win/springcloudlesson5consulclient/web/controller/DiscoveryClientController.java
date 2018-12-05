package com.da2win.springcloudlesson5consulclient.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * {@link DiscoveryClient}
 * @Author Darwin
 * @Date 2018/12/4 17:22
 * @since 1.0.0
 */
@RestController
public class DiscoveryClientController {

    private final DiscoveryClient discoveryClient;

    private final String currentApplicationName;

    @Autowired
    public DiscoveryClientController(DiscoveryClient discoveryClient, @Value("${spring.application.name}")String applicationName) {
        this.discoveryClient = discoveryClient;
        this.currentApplicationName = applicationName;
    }

    /**
     * 获取当前的应用下次吧西
     * @return
     */
    @GetMapping()
    public ServiceInstance getCurrentServiceInstance() {
        return discoveryClient.getInstances(currentApplicationName).get(0);
    }

    /**
     * 获取所有服务名称
     * @return
     */
    @GetMapping("/list/service")
    public List<String> listServices() {
        return discoveryClient.getServices();
    }

    /**
     * 获取所有服务实例
     * @return
     */
    @GetMapping("/list/service-instances")
    public List<ServiceInstance> listServiceInstances() {
        List<String> listServices = listServices();
        List<ServiceInstance> serviceInstances = new LinkedList<>();

        listServices.forEach(serviceName -> {
            serviceInstances.addAll(discoveryClient.getInstances(serviceName));
        });

        return serviceInstances;
    }

}
