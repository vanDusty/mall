package cn.van.mall.system.mapper;

import cn.van.mall.system.entity.SysUserRoleDO;
import cn.van.mall.system.param.SysUserRoleParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2021/12/29 09:51 下午
 * Description: 用户和角色关联表 Mapper 接口
 * Version： V1.0
 */

@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleDO> {

    /**
     *  desc
     * @param param
     * @return
     */
    int deleteUserRoleData(SysUserRoleParam param);

    /**
     * desc
     * @param params
     * @return
     */
    int insertBatch(List<SysUserRoleParam> params);
}