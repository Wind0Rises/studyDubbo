package com.liu.study.dubbo.di;

import org.apache.dubbo.common.extension.SPI;

import org.apache.dubbo.common.URL;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/11/2 13:07
 */
@SPI("first")
public interface DuuboImportService {

    /**
     * asd
     */
    void importMethod(URL url);

}