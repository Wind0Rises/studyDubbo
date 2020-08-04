package com.liu.study.dubbo;

import com.liu.study.dubbo.service.DubboReferenceService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 10:32
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.liu.study.dubbo.service")
@ComponentScan(basePackages = "com.liu.study.dubbo.service")
@PropertySource("classpath:/dubbo-consumer.properties")
public class DubboAnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DubboAnnotationApplication.class);
        configApplicationContext.start();

        DubboReferenceService dubboReferenceService = configApplicationContext.getBean(DubboReferenceService.class);
        System.out.println(dubboReferenceService.getClass());
        String result = dubboReferenceService.testDubboAnnocation();
        System.out.println(result);
    }

}