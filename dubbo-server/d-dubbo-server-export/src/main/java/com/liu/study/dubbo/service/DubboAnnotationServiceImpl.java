package com.liu.study.dubbo.service;

import com.liu.study.dubbo.DubboAnnotationService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 注意使用的是【org.apache.dubbo.config.annotation.Service】
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 10:47
 */
@Service
public class DubboAnnotationServiceImpl implements DubboAnnotationService {

    @Override
    public String queryUserName(String username) {
        System.out.println("###############################" + username);
        return "success";
    }
}