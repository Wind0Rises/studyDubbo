# 主要内容。
## 一、dubbo的@SPI注解的作用。
扩展点约定：扩展点必须是Interface类型，必须被@SPI注解，满足这两点才是一个扩展点。
@SPI注解作用在接口上，标记该接口是Dubbo的扩展点；@SPI的value表示这个扩展点的默认实现，
被@SPI注解修饰的才能像java的SPI一样的作用，java的SPI是不用做任何标识的。<br>
请看：**ClientSpiApplication类**，**com.liu.study.dubbo.service**这个包主要是java的SPI
和Dubbo的SPI。

## 二、@Adaptive注解的作用。
请看：TestFirstAdaptive、TestSecondAdaptive两个类。
被@Adaptive修饰的方法会生成代理。

## 三、服务导出。
