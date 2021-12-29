package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysOperLogDO;
import cn.van.mall.database.mapper.system.SysOperLogMapper;
import cn.van.mall.database.atom.system.SysOperLogAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysOperLogAtomImpl extends ServiceImpl<SysOperLogMapper, SysOperLogDO> implements SysOperLogAtom {

}
