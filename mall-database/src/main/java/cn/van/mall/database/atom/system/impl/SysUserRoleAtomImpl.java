package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysUserRoleDO;
import cn.van.mall.database.mapper.system.SysUserRoleMapper;
import cn.van.mall.database.atom.system.SysUserRoleAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysUserRoleAtomImpl extends ServiceImpl<SysUserRoleMapper, SysUserRoleDO> implements SysUserRoleAtom {

}
