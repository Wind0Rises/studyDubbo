package com.liu.study.dubbo.spi;

import com.liu.study.dubbo.spi.service.SpiTestService;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/13 14:22
 * @version 1.0.0
 */
public class SpiTest {

    public static void main(String[] args) {
        /**
         * 需要在接口中添加SPI
         */
        ExtensionLoader<SpiTestService> loader = ExtensionLoader.getExtensionLoader(SpiTestService.class);
        SpiTestService first = loader.getExtension("first");
        SpiTestService second = loader.getExtension("second");

        first.spiTest();
        System.out.println("\n\n");
        second.spiTest();
    }

}
