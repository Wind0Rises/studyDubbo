package com.liu.study.dubbo.spi.service.impl;

import com.liu.study.dubbo.spi.service.SpiTestService;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/13 14:18
 * @version 1.0.0
 */
public class FirstSpiServiceImpl implements SpiTestService {

    @Override
    public void spiTest() {
        System.out.println("DUBBO SPI 测试 =====》  First");
    }

}
