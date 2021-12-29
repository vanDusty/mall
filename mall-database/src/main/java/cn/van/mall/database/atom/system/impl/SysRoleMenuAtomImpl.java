package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysRoleMenuDO;
import cn.van.mall.database.mapper.system.SysRoleMenuMapper;
import cn.van.mall.database.atom.system.SysRoleMenuAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysRoleMenuAtomImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenuDO> implements SysRoleMenuAtom {

}
