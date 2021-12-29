package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysUserPostDO;
import cn.van.mall.database.mapper.system.SysUserPostMapper;
import cn.van.mall.database.atom.system.SysUserPostAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与岗位关联表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysUserPostAtomImpl extends ServiceImpl<SysUserPostMapper, SysUserPostDO> implements SysUserPostAtom {

}
