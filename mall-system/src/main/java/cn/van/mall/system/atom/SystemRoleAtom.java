package cn.van.mall.system.atom;

import cn.van.mall.system.convert.SysRoleConvert;
import cn.van.mall.system.entity.SysRoleDO;
import cn.van.mall.system.mapper.SysRoleMapper;
import cn.van.mall.system.model.SysRoleDTO;
import cn.van.mall.system.param.SysRoleParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   Van
 * Date:     2022/1/9 8:38 下午
 * Description:
 * Version： V1.0
 */
@Component
public class SystemRoleAtom {

    @Resource
    private SysRoleMapper roleMapper;
    @Resource
    private SysRoleConvert roleConvert;

    /**
     * 根据条件分页查询角色数据
     *
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    public List<SysRoleDTO> selectRoleList(SysRoleParam param) {
        return roleConvert.doSToDtoS(roleMapper.selectRoleList(param));
    }


    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    public List<SysRoleDTO> selectRoleByUserId(Long userId){
        SysRoleParam roleParam = new SysRoleParam();
        roleParam.setUserId(userId);
        return roleConvert.doSToDtoS(roleMapper.selectRoleByUserId(roleParam));
    }

    /**
     * 根据用户名查询角色
     * @param userName
     * @return
     */
    public List<SysRoleDTO> selectRoleByUserName(String userName){
        SysRoleParam roleParam = new SysRoleParam();
        roleParam.setUserName(userName);
        return roleConvert.doSToDtoS(roleMapper.selectRoleByUserId(roleParam));
    }

    /**
     * 查询所有角色(包含逻辑删除的)
     * @return
     */
    public List<SysRoleDTO> selectAll() {
        return roleConvert.doSToDtoS(roleMapper.selectList(null));
    }

    /**
     * 根据用户ID获取角色id
     * @param userId
     * @return
     */
    public List<Long> selectRoleIdByUserId(Long userId) {
        List<SysRoleDTO> roles = this.selectRoleByUserId(userId);
        return roles.stream().map(SysRoleDTO::getRoleId).collect(Collectors.toList());
    }

    /**
     * 通过ID查询角色
     * @param roleId
     * @return
     */
    public SysRoleDTO selectById(Long roleId) {
        return roleConvert.doToDTO(roleMapper.selectById(roleId));
    }

    /**
     * 校验角色名称是否唯一
     *
     * @param roleName 角色名称
     * @return 角色信息
     */
    public int checkRoleNameUnique(String roleName){
        QueryWrapper<SysRoleDO> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(SysRoleDO::getRoleName, roleName);
        return selectCount(queryWrapper);
    }

    /**
     * 校验角色权限是否唯一
     * @param roleKey
     * @return
     */
    public int checkRoleKeyUnique(String roleKey){
        QueryWrapper<SysRoleDO> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(SysRoleDO::getRoleKey, roleKey);
        return selectCount(queryWrapper);
    }

    /**
     * 根据角色id修改角色信息
     * @param role
     * @return
     */
    public int updateRole(SysRoleDO role){
        return roleMapper.updateById(role);
    }

    /**
     * 新增角色信息
     * @param role
     * @return
     */
    public int insertRole(SysRoleDO role){
        return roleMapper.insert(role);
    }


    /**
     * 通过角色ID删除角色
     *
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteRoleById(Long roleId){
        SysRoleDO roleDO = new SysRoleDO();
        roleDO.setRoleId(roleId);
        roleDO.setDelFlag("2");
        return roleMapper.updateById(roleDO);
    }


    /**
     * 批量删除角色信息
     * @param roleIds 需要删除的角色ID
     * @return 结果
     */
    public int deleteRoleByIds(List<Long> roleIds){
        SysRoleDO roleDO = new SysRoleDO();
        roleDO.setDelFlag("2");
        return roleMapper.update(roleDO, new QueryWrapper<SysRoleDO>().lambda().in(SysRoleDO::getRoleId, roleIds));
    }

    private int selectCount(QueryWrapper<SysRoleDO> wrapper) {
        return roleMapper.selectCount(wrapper).intValue();
    }
}