package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysUserOnlineDO;
import cn.van.mall.database.mapper.system.SysUserOnlineMapper;
import cn.van.mall.database.atom.system.SysUserOnlineAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 在线用户记录 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysUserOnlineAtomImpl extends ServiceImpl<SysUserOnlineMapper, SysUserOnlineDO> implements SysUserOnlineAtom {

}
