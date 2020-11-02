package com.liu.study.dubbo.aop;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 *
 * @author Liuweian
 * @version 1.0.0
 * @createTime 2020/6/5 10:56
 */
public class DubboAopTest {

    /**
     * 包装类也实现了DubboAopInterface接口
     *
     * 把包装类也放到MATE-INF的文件夹中。
     *
     * 越上面的越先执行。
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        ExtensionLoader<DubboAopInterface> extensionLoader = ExtensionLoader.getExtensionLoader(DubboAopInterface.class);
        DubboAopInterface red = extensionLoader.getExtension("red");
        red.getCarColor();
    }

}
