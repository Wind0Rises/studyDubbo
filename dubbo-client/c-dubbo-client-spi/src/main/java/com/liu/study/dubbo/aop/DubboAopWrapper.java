package com.liu.study.dubbo.aop;

/**
 * 
 * @author Liuweian
 * @createTime 2020/11/1 13:40
 * @version 1.0.0
 */
public class DubboAopWrapper implements DubboAopInterface {

    private DubboAopInterface target;

    public DubboAopWrapper(DubboAopInterface target) {
        this.target = target;
    }

    @Override
    public void getCarColor() {
        System.out.println("AOP  ---  Before");
        this.target.getCarColor();
        System.out.println("AOP  ---  Before");
    }
}
