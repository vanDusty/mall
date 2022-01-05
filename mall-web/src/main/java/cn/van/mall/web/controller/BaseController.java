package cn.van.mall.web.controller;

import cn.van.mall.web.param.PageParam;
import cn.van.mall.web.util.PageUtil;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   Van
 * Date:     2022/1/5 12:10 上午
 * Description: web层通用数据处理
 * Version： V1.0
 */
public class BaseController {


    /**
     * 设置请求分页数据
     */
    protected void startPage(PageParam pageParam)
    {
        PageUtil.startPage(pageParam);
    }
}