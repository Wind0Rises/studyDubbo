package com.liu.study.dubbo.service.impl;

import com.liu.study.dubbo.service.IMerchantService;

/**
 * @author Liuweian
 * @version 1.0.0
 * @desc
 * @createTime 2020/6/5 11:02
 */
public class AlibabaMerchantServiceImpl implements IMerchantService {

    @Override
    public void queryMerchantInfo() {
        System.out.println("This is Alibaba Merchant");
    }
}
