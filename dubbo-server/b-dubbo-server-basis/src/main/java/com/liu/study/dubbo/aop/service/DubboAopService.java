package com.liu.study.dubbo.aop.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/13 15:18
 * @version 1.0.0
 */
@SPI
public interface DubboAopService {

    /**
     * 测试
     *
     */
    @Adaptive("dubboAop")
    public void dubboAopTestMethod(URL url);

}

