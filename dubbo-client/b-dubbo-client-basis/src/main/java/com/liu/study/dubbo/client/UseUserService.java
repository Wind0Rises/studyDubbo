package com.liu.study.dubbo.client;

import com.liu.study.dubbo.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @desc
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/4 23:32
 */
@Service
public class UseUserService {

    @Autowired
    private IUserService userService;

    public void test() {
        System.out.println(" ###########################  " + userService.getClass());
        String result = userService.queryUserMessage();
        System.out.println("调用远程服务返回结果为：" + result);
    }

}
