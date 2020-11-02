package com.liu.study.dubbo.di;

import org.apache.dubbo.common.URL;

/**
 * 
 * @author Liuweian
 * @createTime 2020/11/1 13:52
 * @version 1.0.0
 */
public class DiHappenClass implements DiTestService {

    private DiTestService diTestService;

    public void setDiTestService(DiTestService diTestService) {
        this.diTestService = diTestService;
    }

    @Override
    public void diTestMethod(URL url) {
        System.out.println("---------------------------");
        this.diTestService.diTestMethod(url);
    }
}
