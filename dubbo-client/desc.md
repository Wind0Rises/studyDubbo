# 主要内容。
## 一、dubbo的@SPI注解的作用。
扩展点约定：扩展点必须是Interface类型，必须被@SPI注解，满足这两点才是一个扩展点。
@SPI注解作用在接口上，标记该接口是Dubbo的扩展点；@SPI的value表示这个扩展点的默认实现，
被@SPI注解修饰的才能像java的SPI一样的作用，java的SPI是不用做任何标识的。<br>
请看：**ClientSpiApplication类**。

## 二、
