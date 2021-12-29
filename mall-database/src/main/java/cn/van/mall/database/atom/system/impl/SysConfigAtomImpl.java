package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysConfigDO;
import cn.van.mall.database.mapper.system.SysConfigMapper;
import cn.van.mall.database.atom.system.SysConfigAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 参数配置表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysConfigAtomImpl extends ServiceImpl<SysConfigMapper, SysConfigDO> implements SysConfigAtom {

}
