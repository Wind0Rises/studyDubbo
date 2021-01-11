package com.liu.study.dubbo.di;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/11/2 13:07
 */
public class TestSecondAdaptive {

    public static void main(String[] args) {
        /**
         * getExtensionLoader()方法传入的必须是一个接口，这个接口也必须要被@SPI注解修饰。
         */
        ExtensionLoader<DuuboImportService> extensionLoader = ExtensionLoader.getExtensionLoader(DuuboImportService.class);

        /**
         * getExtension()：参数不能为空，如果传入一个true，获取到对应接口默认的实现，这个默认的的实现是在接口的@SPI注解指定的。
         * <note>获取默认的实现</note>
         */
        DuuboImportService di = extensionLoader.getExtension("true");


        Map<String, String> map = new HashMap<>(8);
        map.put("num", "second");
        URL url = new URL("", "", 1, map);
        di.importMethod(url);
    }

}