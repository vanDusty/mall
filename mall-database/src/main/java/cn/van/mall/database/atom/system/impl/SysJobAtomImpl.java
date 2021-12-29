package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysJobDO;
import cn.van.mall.database.mapper.system.SysJobMapper;
import cn.van.mall.database.atom.system.SysJobAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysJobAtomImpl extends ServiceImpl<SysJobMapper, SysJobDO> implements SysJobAtom {

}
