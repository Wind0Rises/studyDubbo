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

    private DiTestService diTestService;

    public void setDiTestService(DiTestService diTestService) {
        this.diTestService = diTestService;
    }

    @Override
    public void importMethod(URL url) {
        System.out.println("----------    如果调用了DiTestService实现类的方法，说明inject就起作用了。 -----------");
        diTestService.diTestMethod(url);
    }
}