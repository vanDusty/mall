package cn.van.mall.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2015-2021, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2021/12/26 9:51 下午
 * Description: 启动类
 * Version： V1.0
 */
@SpringBootApplication(scanBasePackages = "cn.van.mall")
@MapperScan("cn.van.mall.database.mapper")
public class MallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }
}