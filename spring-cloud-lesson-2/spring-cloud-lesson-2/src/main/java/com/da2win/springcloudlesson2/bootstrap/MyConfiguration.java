package com.da2win.springcloudlesson2.bootstrap;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * Bootstrap 配置 Bean
 * @Author Darwin
 * @Date 2018/11/30 14:10
 */
@Configuration
public class MyConfiguration implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        // 获取PropertySources
        MutablePropertySources propertySources = environment.getPropertySources();
        // 定义一个新的 PropertySource
        propertySources.addFirst(createPropertySource());
    }

    private PropertySource createPropertySource() {

        Map<String, Object> source = new HashMap<>();

        source.put("name", "da2win");

        PropertySource propertySource = new MapPropertySource("my-property-source", source);

        return propertySource;
    }
}
