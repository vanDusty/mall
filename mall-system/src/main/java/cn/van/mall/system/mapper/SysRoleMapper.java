package cn.van.mall.system.mapper;

import cn.van.mall.system.entity.SysRoleDO;
import cn.van.mall.system.param.SysRoleParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2021/12/29 09:51 下午
 * Description: 角色信息表 Mapper 接口
 * Version： V1.0
 */

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRoleDO> {

    /**
     * 根据条件查询角色数据
     * @param param
     * @return
     */
    List<SysRoleDO> selectRoleList(SysRoleParam param);

    /**
     * 根据用户ID查询角色
     * @param param
     * @return
     */
    List<SysRoleDO> selectRoleByUserId(SysRoleParam param);

}