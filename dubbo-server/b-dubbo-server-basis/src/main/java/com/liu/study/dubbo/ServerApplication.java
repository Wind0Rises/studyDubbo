package com.liu.study.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @desc
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/4 23:12
 */
public class ServerApplication {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }
}
