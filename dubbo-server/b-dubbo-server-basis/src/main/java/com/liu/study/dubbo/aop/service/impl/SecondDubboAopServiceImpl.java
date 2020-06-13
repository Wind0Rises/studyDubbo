package com.liu.study.dubbo.aop.service.impl;

import com.liu.study.dubbo.aop.service.DubboAopService;
import org.apache.dubbo.common.URL;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/13 15:18
 * @version 1.0.0
 */
public class SecondDubboAopServiceImpl implements DubboAopService {

    @Override
    public void dubboAopTestMethod(URL url) {
        System.out.println("【Second】 Dubbo Aop  =======");
    }

}
