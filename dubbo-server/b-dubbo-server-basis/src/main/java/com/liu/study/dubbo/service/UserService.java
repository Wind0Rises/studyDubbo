package com.liu.study.dubbo.service;

import com.liu.study.dubbo.IUserService;
import org.apache.dubbo.common.extension.SPI;
import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.TimeUnit;

/**
 * @author Liuweian
 * @version 1.0.0
 * @desc
 * @createTime 2020/6/4 23:05
 */
@SPI
public class UserService implements IUserService {

    @Override
    public String queryUserMessage() {
        System.out.println("【Server】UserService服务   ===>    queryUserMessage被调用");
        return "SUCCESS";
    }

}
