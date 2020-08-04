package com.liu.study.dubbo.service.impl;

import com.liu.study.dubbo.service.IDubboSpiService;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 15:28
 */
public class DubboSpiSecondServiceImpl implements IDubboSpiService {

    @Override
    public void dubboSpiTestMethod() {
        System.out.println(" This is Dubbo SPI first");
    }

}