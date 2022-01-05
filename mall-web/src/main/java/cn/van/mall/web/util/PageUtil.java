package cn.van.mall.web.util;

import cn.van.mall.support.util.StrUtil;
import cn.van.mall.web.param.PageParam;
import com.github.pagehelper.PageHelper;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   Van
 * Date:     2022/1/5 10:44 下午
 * Description: 分页工具类
 * Version： V1.0
 */
public class PageUtil extends PageHelper {


    /**
     * 设置请求分页数据
     */
    public static void startPage(PageParam pageParam)
    {
        // todo 后续是否改造成从 HttpServletRequest 直接获取这几个参数，则该方法即可转换成无参数的
//        PageParam pageParam = null;
        Integer pageNum = pageParam.getPageNum();
        Integer pageSize = pageParam.getPageSize();
        if (StrUtil.isNotNull(pageNum) && StrUtil.isNotNull(pageSize)) {
            // todo 检查字符，防止注入
            PageHelper.startPage(pageNum, pageSize, pageParam.getOrderBy());
        }
    }
}