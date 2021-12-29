package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysUserDO;
import cn.van.mall.database.mapper.system.SysUserMapper;
import cn.van.mall.database.atom.system.SysUserAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysUserAtomImpl extends ServiceImpl<SysUserMapper, SysUserDO> implements SysUserAtom {

}
