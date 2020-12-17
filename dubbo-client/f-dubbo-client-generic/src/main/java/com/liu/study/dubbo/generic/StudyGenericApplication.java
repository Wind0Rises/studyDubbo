package com.liu.study.dubbo.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/17 15:42
 */
public class StudyGenericApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // applicationContext.getBean(GenericInvokeService)
    }

}
