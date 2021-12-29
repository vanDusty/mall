package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysRoleDeptDO;
import cn.van.mall.database.mapper.system.SysRoleDeptMapper;
import cn.van.mall.database.atom.system.SysRoleDeptAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和部门关联表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysRoleDeptAtomImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDeptDO> implements SysRoleDeptAtom {

}
