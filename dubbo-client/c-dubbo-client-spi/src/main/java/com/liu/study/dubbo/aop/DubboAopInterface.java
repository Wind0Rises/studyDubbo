package com.liu.study.dubbo.aop;

import org.apache.dubbo.common.extension.SPI;

/**
 * 
 * @author Liuweian
 * @createTime 2020/11/1 13:34
 * @version 1.0.0
 */
@SPI
public interface DubboAopInterface {

    /**
     * 获取汽车的颜色。
     */
    void getCarColor();

}
