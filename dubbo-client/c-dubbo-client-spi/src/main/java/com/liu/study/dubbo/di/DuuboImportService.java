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
     * 没有被{@link org.apache.dubbo.common.extension.Adaptive}修饰。
     */
    void importMethod(URL url);

}