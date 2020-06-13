package com.liu.study.dubbo.spi.wrapper;

import com.liu.study.dubbo.spi.service.SpiTestService;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/13 15:13
 * @version 1.0.0
 */
public class FirstSpiWrapper implements SpiTestService {

    private SpiTestService spiTestService;

    public FirstSpiWrapper(SpiTestService spiTestService) {
        this.spiTestService = spiTestService;
    }

    @Override
    public void spiTest() {
        System.out.println("First Wrapper ---------- before -----------");
        spiTestService.spiTest();
        System.out.println("First Wrapper ---------- after  -----------");
    }
}
