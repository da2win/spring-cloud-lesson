package com.da2win.springcloudlesson2;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.*;

import java.util.HashMap;
import java.util.Map;

/**
 *  自定义 {@link PropertySourceLocator} 实现
 * @Author Darwin
 * @Date 2018/11/30 14:24
 */
public class MyPropertySourceLocater implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {

        if (environment instanceof ConfigurableEnvironment) {

            ConfigurableEnvironment configurableEnvironment = ConfigurableEnvironment.class.cast(environment);

            MutablePropertySources propertySources = configurableEnvironment.getPropertySources();

            propertySources.addFirst(createPropertySource());

        }
        return null;
    }

    private PropertySource createPropertySource() {

        Map<String, Object> source = new HashMap<>();

        source.put("spring.application.name", "da2win's spring-cloud demo");

        PropertySource propertySource = new MapPropertySource("override-bootstrap-property-source", source);

        return propertySource;
    }
}
