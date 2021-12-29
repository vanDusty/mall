package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysPostDO;
import cn.van.mall.database.mapper.system.SysPostMapper;
import cn.van.mall.database.atom.system.SysPostAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 岗位信息表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysPostAtomImpl extends ServiceImpl<SysPostMapper, SysPostDO> implements SysPostAtom {

}
