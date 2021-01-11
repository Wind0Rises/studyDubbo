package com.liu.study.dubbo.service;

import com.liu.study.dubbo.DubboAnnotationService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 10:53
 */
@Service
public class DubboReferenceService {

    /**
     * @Reference:
     *      check：Dubbo默认会在启动时检查依赖的服务是否可用，不可用时会抛出异常。
     */
    @Reference(
            check = true,
            cluster = "failover",
            loadbalance = "random",
            // 直连：这个服务不需要注册到dubbo。
            url = "dubbo://localhost:20880"
    )
    private DubboAnnotationService dubboAnnotationService;

    public String testDubboAnnocation() {
        System.out.println("###########################################################################################################");
        System.out.println(dubboAnnotationService.getClass());
        System.out.println("###########################################################################################################");
        return dubboAnnotationService.queryUserName("liuweian1");
    }
}