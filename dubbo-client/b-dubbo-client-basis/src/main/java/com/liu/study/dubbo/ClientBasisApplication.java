package com.liu.study.dubbo;

import com.liu.study.dubbo.client.UseUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @desc
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/4 21:21
 */
public class ClientBasisApplication {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        UseUserService useUserService = context.getBean(UseUserService.class);
        useUserService.test();
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }

}
