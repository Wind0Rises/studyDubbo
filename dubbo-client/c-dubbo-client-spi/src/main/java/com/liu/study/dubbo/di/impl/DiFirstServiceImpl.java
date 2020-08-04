package com.liu.study.dubbo.di.impl;

import com.liu.study.dubbo.di.DiTestService;
import org.apache.dubbo.common.extension.SPI;

/**
 * 依赖注入第二个测试类。
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 15:07
 */
@SPI
public class DiFirstServiceImpl implements DiTestService {

    @Override
    public void diTestMethod() {
        System.out.println("==========   First  ==========");
    }

}