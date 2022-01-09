package cn.van.mall.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright (C), 2015-2021, 风尘博客
 * 公众号 : 风尘博客
 * Author:   Van
 * Date:     2021/12/26 9:55 下午
 * Description:
 * Version： V1.0
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class BaseTest {

    @Test
    public void demo() {
        System.out.println(1);
        log.info("ssss");
    }
}