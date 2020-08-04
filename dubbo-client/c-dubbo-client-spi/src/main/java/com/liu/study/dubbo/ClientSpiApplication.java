package com.liu.study.dubbo;

import com.liu.study.dubbo.service.IDubboSpiService;
import com.liu.study.dubbo.service.IMerchantService;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.ServiceLoader;


/**
 *
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/5 10:56
 */
public class ClientSpiApplication {

    public static void main(String[] args) {
        /**
         * java的SPI测试。
         */
        System.out.println("###########################  JAVA SPI  ##################################");
        ServiceLoader<IMerchantService> services = ServiceLoader.load(IMerchantService.class);
        services.forEach(IMerchantService::queryMerchantInfo);
        System.out.println("###########################  JAVA SPI  ##################################\n\t\n\t");

        /**
         * dubbo的SPI测试。
         */
        System.out.println("###########################  Dubbo SPI  ##################################");
        ExtensionLoader<IDubboSpiService> extensionLoader = ExtensionLoader.getExtensionLoader(IDubboSpiService.class);
        IDubboSpiService dubboSpiFirstServiceImpl = extensionLoader.getExtension("dubboSpiFirstServiceImpl");
        dubboSpiFirstServiceImpl.dubboSpiTestMethod();
        IDubboSpiService dubboSpiSecondServiceImpl = extensionLoader.getExtension("dubboSpiSecondServiceImpl");
        dubboSpiSecondServiceImpl.dubboSpiTestMethod();
        System.out.println("###########################  Dubbo SPI  ##################################\n\t\n\t");


        /**
         * dubbo的依赖注入
         */
        System.out.println("###########################  DI  ##################################");

        System.out.println("###########################  DI  ##################################");
    }

}
