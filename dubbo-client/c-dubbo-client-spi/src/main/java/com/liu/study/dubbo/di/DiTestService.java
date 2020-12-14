package com.liu.study.dubbo.di;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 15:06
 */
@SPI
public interface DiTestService {

    /**
     * 依赖注册测试。
     * @Adaptive 为{@link ExtensionLoader}提供有用的信息以注入依赖项扩展实例。
     */
    @Adaptive("num")
    void diTestMethod(URL url);

}