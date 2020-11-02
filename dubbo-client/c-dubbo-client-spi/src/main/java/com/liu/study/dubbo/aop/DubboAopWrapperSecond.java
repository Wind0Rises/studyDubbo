package com.liu.study.dubbo.aop;

/**
 * 
 * @author Liuweian
 * @createTime 2020/11/1 13:40
 * @version 1.0.0
 */
public class DubboAopWrapperSecond implements DubboAopInterface {

    private DubboAopInterface target;

    public DubboAopWrapperSecond(DubboAopInterface target) {
        this.target = target;
    }

    @Override
    public void getCarColor() {
        System.out.println("AOP  ---  Before2");
        this.target.getCarColor();
        System.out.println("AOP  ---  Before2");
    }
}
