# DUBBO服务导出。
## 一服务导出
### 1.1 初始化过程
    服务导出的入口：ServiceBean这个类，这个类实现了
        DubboBootstrapApplicationListener是属于Dubbo的监听器。这个监听器在spring启动后，
    在ApplicationContext的refresh()方法的finishRefresh()方法触发的。
        从而触发DubboBoostrap的start()方法，在start()方法的initialize()正式开始；最终到
    ApplicationConfig的refresh()方法开始。
        AbstractConfig类的refresh()方法的env.getConfiguration(getPrefix(), getId())
    操作是配置的优先级处理。

### 1.2 服务导出流程
    1.从DubboBootstrap类的start()方法的exportServices()操作时整个服务导出的流程开始。