package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysMenuDO;
import cn.van.mall.database.mapper.system.SysMenuMapper;
import cn.van.mall.database.atom.system.SysMenuAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysMenuAtomImpl extends ServiceImpl<SysMenuMapper, SysMenuDO> implements SysMenuAtom {

}
