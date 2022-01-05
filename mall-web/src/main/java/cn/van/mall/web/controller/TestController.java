package cn.van.mall.web.controller;

import cn.van.mall.support.http.HttpResult;
import cn.van.mall.system.entity.SysRoleMenuDO;
import cn.van.mall.system.mapper.SysRoleMenuMapper;
import cn.van.mall.system.mapper.SysUserMapper;
import cn.van.mall.web.param.PageParam;
import cn.van.mall.web.util.PageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


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
public class TestController extends BaseController{

    @Resource
    private SysUserMapper userMapper;

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    @ApiOperation(value = "sayHello")
    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return "Hello word";
    }


    @ApiOperation(value = "getUser")
    @GetMapping(value = "/getUser")
    public HttpResult getUser() {
        return HttpResult.success(userMapper.selectList(null));
    }

    @ApiOperation(value = "getPage")
    @GetMapping(value = "/getPage")
    public HttpResult getPage(PageParam pageParam) {
        startPage(pageParam);
        List<SysRoleMenuDO> list = sysRoleMenuMapper.selectList(null);
        return HttpResult.success(list);
    }
}