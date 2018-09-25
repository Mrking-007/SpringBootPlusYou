# 一、Spring Boot 入门	

## 1、Spring Boot简介

> 简化Spring 应用开发的一个框架；
>
> 整个Spring技术栈的一个大整合；
>
> J2EE开发的一站式解决方案；

# 2、 微服务

2014，Martin fowler

微服务：架构风格

一个应用应该是一组小型服务；可以通过Http方式进行互通；

每一个功能元素最终都是一个可独立替换和独立升级的软件单元；

[详细参照微服务文档](https://martinfowler.com/articles/microservices.html )

环境约束

-jdk1.8：Spring Boot 要求 1.7及以上； 

> java- version

-maven3.x：maven3.3以上版本；

>C:\Program Files (x86)\apache-maven-3.5.0\bin
>
>mvn -v
>
>Apache Maven 3.5.0

-IntelliJ IDEA2017；

-Spring Boot 1.5.9RELEASE;

MAVEN 设置

给maven的setting.xml配置文件的profiles标签添加（\安装目录\conf\settings.xml）

```xml




```

![](E:\GridSum\DevelopmentSix\OpenLearn\SpringBootPlusYou\Spring Boot 笔记\images\maven配置.png)

视频是User settings file 使用的是安装目录的配置setting，公司实际开发没有改这个。





