package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysRoleDO;
import cn.van.mall.database.mapper.system.SysRoleMapper;
import cn.van.mall.database.atom.system.SysRoleAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysRoleAtomImpl extends ServiceImpl<SysRoleMapper, SysRoleDO> implements SysRoleAtom {

}
