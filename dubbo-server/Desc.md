# Dubbo问题解释
## 一、SPI
### 1.1 包装类与代理类（@SPI、@Adaptive）
#### 1.1.1 @SPI是什么，有什么作用

#### 1.1.2 @Adaptive是什么，有什么作用。

## 二、服务导入导出
### 2.1 配置可以定义在哪里？
#### 是否是配置优先。
   消费者的配置会覆盖生产者的配置，所以消费者的配置的优先级大于生产者。
   
### 2.2 服务导出
#### 2.2.1 初始化过程
    服务导出的入口：ServiceBean这个类，这个类实现了
        DubboBootstrapApplicationListener是属于Dubbo的监听器。这个监听器在spring启动后，
    在ApplicationContext的refresh()方法的finishRefresh()方法触发的。
        从而触发DubboBoostrap的start()方法，在start()方法的initialize()正式开始；最终到
    ApplicationConfig的refresh()方法开始。
        AbstractConfig类的refresh()方法的env.getConfiguration(getPrefix(), getId())
    操作是配置的优先级处理。

#### 2.2.2 服务导出流程
    1.从DubboBootstrap类的start()方法的exportServices()操作时整个服务导出的流程开始。
    
    

