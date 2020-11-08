package com.liu.study.dubbo.di.impl;

import com.liu.study.dubbo.di.DiTestService;
import com.liu.study.dubbo.di.DuuboImportService;

import org.apache.dubbo.common.URL;


/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/11/2 13:09
 */
public class DuuboImportServiceImpl implements DuuboImportService {

    /**
     * 这个也会被dubbo注入。
     * 请看{@link org.apache.dubbo.common.extension.ExtensionLoader#injectExtension(Object)}
     * Object object = objectFactory.getExtension(pt, property);
     */
    private DiTestService diTestService;

    public void setDiTestService(DiTestService diTestService) {
        this.diTestService = diTestService;
    }

    @Override
    public void importMethod(URL url) {
        System.out.println("----------    如果调用了DiTestService实现类的方法，说明inject就起作用了。 -----------");
        /**
         * 如果把{@link DiTestService}的@SPI去除调，这里就会空指针报错。
         */
        diTestService.diTestMethod(url);
    }
}