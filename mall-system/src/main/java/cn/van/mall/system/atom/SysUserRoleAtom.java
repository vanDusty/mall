package cn.van.mall.system.atom;

import cn.van.mall.system.entity.SysUserRoleDO;
import cn.van.mall.system.mapper.SysUserRoleMapper;
import cn.van.mall.system.param.SysUserRoleParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   Van
 * Date:     2022/1/16 2:43 下午
 * Description: 系统用户角色关联
 * Version： V1.0
 */
@Component
public class SysUserRoleAtom {

    @Resource
    private SysUserRoleMapper userRoleMapper;


    /**
     * 批量新增用户角色信息
     * @param userRoleList
     * @return
     */
    public int insertBatch(List<SysUserRoleParam> userRoleList){
        return userRoleMapper.insertBatch(userRoleList);
    }

    /**
     * 通过角色ID查询角色使用数量
     * @param roleId
     * @return
     */
    public int countUserRoleByRoleId(Long roleId){
        QueryWrapper<SysUserRoleDO> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(SysUserRoleDO::getRoleId, roleId);
        return userRoleMapper.selectCount(queryWrapper).intValue();
    }

    /**
     * 通过用户ID删除用户和角色关联
     * @param userId
     * @return
     */
    public int deleteUserRoleByUserId(Long userId){
        return userRoleMapper.deleteUserRoleData(new SysUserRoleParam(userId));
    }

    /**
     * 批量删除用户和角色关联
     * @param userIds
     * @return
     */
    public int deleteUserRoleByUserIds(Long[] userIds){
        return userRoleMapper.deleteUserRoleData(new SysUserRoleParam(userIds));
    }

    /**
     * 删除用户和角色关联信息
     * @param userId
     * @param roleId
     * @return
     */
    public int deleteUserRoleByUserIdAndRoleId(Long userId,Long roleId){
        return userRoleMapper.deleteUserRoleData(new SysUserRoleParam(userId, roleId));
    }

    /**
     * 批量取消授权用户角色
     * @param roleId
     * @param userIds
     * @return
     */
    public int deleteUserRoleInfos(Long roleId,Long[] userIds){
        return userRoleMapper.deleteUserRoleData(new SysUserRoleParam(roleId, userIds));
    }
}