package cn.van.mall.system.atom;

import cn.van.mall.system.convert.SysDeptConvert;
import cn.van.mall.system.entity.SysDeptDO;
import cn.van.mall.system.entity.SysUserDO;
import cn.van.mall.system.mapper.SysDeptMapper;
import cn.van.mall.system.mapper.SysUserMapper;
import cn.van.mall.system.model.SysDeptDTO;
import cn.van.mall.system.param.SysDeptParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 *
 * @Author: VanFan
 * Date:     2022/1/16 4:07 下午
 * Description: 系统部门
 * Version： V1.0
 */
@Component
public class SysDeptAtom {

    @Resource
    private SysDeptMapper deptMapper;
    @Resource
    private SysUserMapper userMapper;
    @Resource
    private SysDeptConvert deptConvert;

    /**
     * @param deptParam
     * @return
     */
    public List<SysDeptDTO> selectDeptList(SysDeptParam deptParam){
        return deptConvert.doToDtoS(deptMapper.selectListByParam(deptParam));
    }

    /**
     * 根据角色ID查询部门树信息
     * @param roleId
     * @param deptCheckStrictly
     * @return
     */
    public List<Long> selectDeptListByRoleId(Long roleId, boolean deptCheckStrictly){
        SysDeptParam deptParam = new SysDeptParam();
        deptParam.setRoleId(roleId);
        deptParam.setDeptCheckStrictly(deptCheckStrictly);
        return deptMapper.selectDeptListByRoleId(deptParam);
    }

    /**
     * 根据部门ID查询信息
     * @param deptId
     * @return
     */
    public SysDeptDTO selectDeptById(Long deptId){
        SysDeptDO deptDO = deptMapper.selectOne(new QueryWrapper<SysDeptDO>().lambda().eq(SysDeptDO::getDeptId, deptId));
        return deptConvert.doToDto(deptDO);
    }

    /**
     * 根据ID查询所有子部门
     * @param deptId
     * @return
     */
    public List<SysDeptDTO> selectChildrenDeptById(Long deptId){
        SysDeptParam deptParam = new SysDeptParam(deptId);
        return deptConvert.doToDtoS(deptMapper.selectListByParam(deptParam));
    }

    /**
     * 根据ID查询所有子部门（正常状态）
     * @param deptId
     * @return
     */
    public int selectNormalChildrenDeptById(Long deptId){
        SysDeptParam deptParam = new SysDeptParam(deptId);
        deptParam.setStatus("0");
        deptParam.setDelFlag(0);
        return deptMapper.selectCount(deptParam);
    }

    /**
     * 是否存在子节点
     * @param deptId
     * @return
     */
    public int hasChildByDeptId(Long deptId){
        SysDeptParam deptParam = new SysDeptParam();
        deptParam.setParentId(deptId);
        deptParam.setDelFlag(0);
        return deptMapper.selectCount(deptParam);
    }

    /**
     * 查询部门是否存在用户
     * @param deptId
     * @return
     */
    public int checkDeptExistUser(Long deptId){
        return userMapper.selectCount(new QueryWrapper<SysUserDO>().lambda()
                .eq(SysUserDO::getDeptId, deptId)
                .eq(SysUserDO::getDelFlag, "0")
        ).intValue();
    }

    /**
     * 校验部门名称是否唯一
     * @param deptName
     * @param parentId
     * @return
     */
    public int checkDeptNameUnique(String deptName, Long parentId){
        SysDeptParam deptParam = new SysDeptParam();
        deptParam.setDeptName(deptName);
        deptParam.setParentId(parentId);
        return deptMapper.selectCount(deptParam);
    }

    /**
     * 新增部门信息
     * @param deptParam
     * @return
     */
    public int insertDept(SysDeptParam deptParam){
        SysDeptDO deptDO = new SysDeptDO(deptParam.getParentId(), deptParam.getAncestors(), deptParam.getDeptName(), deptParam.getOrderNum(), deptParam.getLeader(), deptParam.getPhone(), deptParam.getStatus(), deptParam.getEmail(), deptParam.getCreateBy(), deptParam.getUpdateBy());
        return deptMapper.insert(deptDO);
    }

    /**
     * 修改部门信息
     * @param deptParam
     * @return
     */
    public int updateDept(SysDeptParam deptParam){
        SysDeptDO deptDO = new SysDeptDO(deptParam.getParentId(), deptParam.getAncestors(), deptParam.getDeptName(), deptParam.getOrderNum(), deptParam.getLeader(), deptParam.getPhone(), deptParam.getStatus(), deptParam.getEmail(), deptParam.getCreateBy(), deptParam.getUpdateBy());
        deptDO.setDeptId(deptParam.getDeptId());
        return deptMapper.updateById(deptDO);
    }

    /**
     * 修改所在部门正常状态
     * @param deptIds
     */
    public void updateDeptStatusNormal(Long[] deptIds){
        SysDeptDO deptDO = new SysDeptDO();
        deptDO.setStatus("0");
        deptMapper.update(deptDO, new UpdateWrapper<SysDeptDO>().lambda().in(SysDeptDO::getDeptId, deptIds));
    }

    /**
     * 修改子元素关系
     * @param depts
     * @return
     */
    public int updateDeptChildren(List<SysDeptDO> depts){
        return deptMapper.updateDeptChildren(depts);
    }

    /**
     * 删除部门管理信息
     * @param deptId
     * @return
     */
    public int deleteDeptById(Long deptId){
        SysDeptDO deptDO = new SysDeptDO();
        deptDO.setDeptId(deptId);
        deptDO.setDelFlag("2");
        return deptMapper.updateById(deptDO);
    }

}