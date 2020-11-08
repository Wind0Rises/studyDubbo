package com.liu.study.dubbo.di.impl;

import com.liu.study.dubbo.di.DiTestService;
import com.liu.study.dubbo.di.DuuboImportService;
import org.apache.dubbo.common.URL;


/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/11/2 13:09
 */
public class DuuboImportServiceSecondImpl implements DuuboImportService {

    @Override
    public void importMethod(URL url) {
        System.out.println("----------------------  这个没有注入对应的参数  ----------------------");
    }
}