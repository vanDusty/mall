package cn.van.mall.system.mapper;

import cn.van.mall.system.entity.SysUserPostDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Copyright (C), 2017-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2021/12/29 09:51 下午
 * Description: 用户与岗位关联表 Mapper 接口
 * Version： V1.0
 */

@Mapper
public interface SysUserPostMapper extends BaseMapper<SysUserPostDO> {

}