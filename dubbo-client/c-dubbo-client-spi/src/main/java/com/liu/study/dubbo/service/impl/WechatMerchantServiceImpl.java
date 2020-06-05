package com.liu.study.dubbo.service.impl;

import com.liu.study.dubbo.service.IMerchantService;

/**
 * @author Liuweian
 * @version 1.0.0
 * @desc
 * @createTime 2020/6/5 11:02
 */
public class WechatMerchantServiceImpl implements IMerchantService {

    @Override
    public void queryMerchantInfo() {
        System.out.println("This is Wechat Merchant");
    }

}
