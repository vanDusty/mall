package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysJobLogDO;
import cn.van.mall.database.mapper.system.SysJobLogMapper;
import cn.van.mall.database.atom.system.SysJobLogAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度日志表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysJobLogAtomImpl extends ServiceImpl<SysJobLogMapper, SysJobLogDO> implements SysJobLogAtom {

}
