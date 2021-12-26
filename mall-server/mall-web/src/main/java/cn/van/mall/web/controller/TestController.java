package cn.van.mall.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * Copyright (C), 2015-2021, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   Van
 * Date:     2021/12/26 10:07 下午
 * Description: 测试
 * Version： V1.0
 */
@RestController
@Api(tags = "测试")
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "sayHello")
    @GetMapping(value = "/sayHello")
    public String sayHello(MultipartFile excel) {
        return "Hello word";
    }

}