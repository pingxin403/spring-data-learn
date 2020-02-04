# Spring Data 学习项目

**什么是SpringData**

SpringData是一个用来简化dao层开发的框架。它在保证了各个底层存储特性的同时,提供了一套统一的数据访问API。它可以很好的支持常用的关系型数据库和非关系型数据库。

使用SpringData作为dao层开发技术,将大大简化代码量,而且其API比各个技术的原生API更加简单易用。

**SpringData的主要模块**

SpringData支持的持久层技术非常多,我们只介绍几个常见的:

- Spring Data common :SpringData 的核心模块,定义了SpringData的核心功能
- Spring Data JDBC: 对JDBC的Spring Data存储库支持
- Spring Data JPA: 对JPA的Spring Data存储库支持
- Spring Data MongoDB: 对MongoDB的基于Spring对象文档的存储库支持
- Spring Data Redis: 封装Jedis技术,对redis实现访问操作
- Spring Data Elasticsearch: 对Elasticsearch实现访问操作

