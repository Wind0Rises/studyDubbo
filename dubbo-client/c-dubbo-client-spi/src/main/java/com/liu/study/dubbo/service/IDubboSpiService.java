package com.liu.study.dubbo.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 15:27
 */
@SPI
public interface IDubboSpiService {

    /**
     *
     */
    void dubboSpiTestMethod();

}