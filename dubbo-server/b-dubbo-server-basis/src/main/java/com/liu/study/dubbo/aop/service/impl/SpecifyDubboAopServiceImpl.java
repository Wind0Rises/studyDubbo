package com.liu.study.dubbo.aop.service.impl;

import com.liu.study.dubbo.aop.service.DubboAopService;
import org.apache.dubbo.common.URL;

/**
 * @desc
 * @author Liuweian
 * @createTime 2020/6/13 15:35
 * @version 1.0.0
 */
public class SpecifyDubboAopServiceImpl implements DubboAopService {

    private DubboAopService dubboAopService;

    public void setDubboAopService(DubboAopService dubboAopService) {
        this.dubboAopService = dubboAopService;
    }

    @Override
    public void dubboAopTestMethod(URL url) {
        System.out.println("Specify Dubbo Aop Service  ============  开始 =========== ");
        dubboAopService.dubboAopTestMethod(url);
        System.out.println("Specify Dubbo Aop Service  ============  结束 =========== ");
    }
}
