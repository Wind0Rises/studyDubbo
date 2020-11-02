package com.liu.study.dubbo.aop.impl;

import com.liu.study.dubbo.aop.DubboAopInterface;

/**
 * 
 * @author Liuweian
 * @createTime 2020/11/1 13:35
 * @version 1.0.0
 */
public class DubboAopRedCarImpl implements DubboAopInterface {
    @Override
    public void getCarColor() {
        System.out.println("this is red black");
    }
}
