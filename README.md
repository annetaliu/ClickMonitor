ClickMonitor
============

短网址点击监控, 从ClickGate实时取到点击信息，根据不同的检查规则，分析是否出现异常的点击。当发现由异常的点击，产生告警。让人工介入审核。

这只是一个简单的实时消息分析工具。

基本结构
========
*  Spout -- 借用Storm的概念，数据输入源。可以是一个文件，HTTP链接，pipline等
*  Bolt  -- 也是Storm里面的概念，处理从Spout 读到的数据。
*  Redies -- 数据存储层。


本地编译和运行
===========

```

#mvn assembly:assembly  -- 编译一个完整的Jar包
```