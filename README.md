<h1 style="text-align: center">Mall</h1>

一个学习技术的小商城项目。

## 背景

> 想做一个类似的项目好久了，其实也启动过好多次，毫无意外，都夭折了。

这次受了一篇文章刺激，加上现在工作正好是做电商相关，感觉是时候逼逼自己了，也算是对自己知识的一个总结吧。

> 不确定该项目是否也会夭折，我会尽力，也希望大家监督。

我一直觉得总是比别人慢半拍，甚至慢好几拍，但是：**只要我开始做了，总比空想好！**

## 时间节点记录

> 鉴于之前项目多次夭折，本次记录各个时间节点，便于督促自己。

### 重新起航

- 2021年12月26日，圣诞节后一天。

## 模块设计

### 子模块

- mall-generator - 逆向工程
- mall-system - 系统层 - 监控系统 + 权限设计
- mall-core - 业务层 - 商品相关业务
- mall-support - 服务层 - 公用组件封装
- mall-web - web端 - 统一接口管理（后续删除该模块）
- mall-front - 运营前端（准备把【若依】搬过来用）

## 技术框架

### 基础

- spring-boot-starter-parent 2.1.12.RELEASE
- mysql-connector-java 8.0.17
- mybatis-plus-boot-starter 3.4.3.4


### 组件

- springfox-swagger2 2.9.2
- lombok 1.8.4
- mybatis-plus-generator 3.5.1

## 参照项目

- [RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue) 搬用前端代码 