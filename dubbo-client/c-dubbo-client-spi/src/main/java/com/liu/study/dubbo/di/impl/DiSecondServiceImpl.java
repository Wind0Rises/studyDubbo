package com.liu.study.dubbo.di.impl;

import com.liu.study.dubbo.di.DiTestService;

/**
 * 依赖注入第一个测试类。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 15:08
 */
public class DiSecondServiceImpl implements DiTestService {

    @Override
    public void diTestMethod() {
        System.out.println("==========   Second  ==========");
    }
}