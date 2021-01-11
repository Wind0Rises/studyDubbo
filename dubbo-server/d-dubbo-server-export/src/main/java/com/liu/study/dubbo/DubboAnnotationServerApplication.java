package com.liu.study.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.liu.study.dubbo.service")
public class DubboAnnotationServerApplication {
    public static void main( String[] args ) {

        ConfigurableApplicationContext context = SpringApplication.run(DubboAnnotationServerApplication.class);

    }
}
