package com.liu.study.dubbo.config;

import org.apache.dubbo.config.ConfigCenterConfig;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/4 11:13
 */
@Configurable
public class DubboConfig {

    public ConfigCenterConfig configCenterConfig() {
        ConfigCenterConfig configCenterConfig = new ConfigCenterConfig();
        return configCenterConfig;
    }

}