package cn.van.mall.system.mapper;

import cn.van.mall.system.entity.SysUserDO;
import cn.van.mall.system.param.SysUserParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2017-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2021/12/29 09:51 下午
 * Description: 用户信息表 Mapper 接口
 * Version： V1.0
 */

@Mapper
public interface SysUserMapper extends BaseMapper<SysUserDO> {

    /**
     * 根据条件查询用户列表（分页也可调用该方法）
     *
     * @param model 用户信息
     * @return 用户信息集合信息
     */
    List<SysUserDO> selectUserList(SysUserParam model);


    /**
     * 根据条件查询已分配某一角色的用户列表
     *
     * @param model 用户信息 + roleId(必填项)
     * @return 用户信息集合信息
     */
    List<SysUserDO> selectAllocatedUserList(SysUserParam model);

    /**
     * 未分配该角色的其他用户列表
     *
     * @param model 用户信息 + roleId(非填项)
     * @return 用户信息集合信息
     */
    List<SysUserDO> selectUnassignedUserList(SysUserParam model);

    /**
     * 根据id和名称查询用户
     * @param map(userId/userName)
     * @return
     */
    SysUserDO selectUserByParam(Map map);

}