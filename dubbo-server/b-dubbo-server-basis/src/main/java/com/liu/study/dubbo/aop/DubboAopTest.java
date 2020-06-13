package com.liu.study.dubbo.aop;

import com.liu.study.dubbo.aop.service.DubboAopService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/13 15:20
 * @version 1.0.0
 */
public class DubboAopTest {

    public static void main(String[] args) {
        ExtensionLoader<DubboAopService> extensionLoader = ExtensionLoader.getExtensionLoader(DubboAopService.class);
        DubboAopService specifyDubboAopService = extensionLoader.getExtension("specifyDubbo");

        Map<String, String> map = new HashMap<>();
        map.put("dubboAop", "secondDubbo");
        URL url = new URL("", "", 1, map);

        /**
         * specifyDubboAopService（SpecifyDubboAopServiceImpl）实例中的DubboAopService对象是什么时候
         * 赋值的？又是怎么赋值的？
         *
         */
        specifyDubboAopService.dubboAopTestMethod(url);
    }

}
