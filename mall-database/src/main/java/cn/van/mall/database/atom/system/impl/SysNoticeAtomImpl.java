package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysNoticeDO;
import cn.van.mall.database.mapper.system.SysNoticeMapper;
import cn.van.mall.database.atom.system.SysNoticeAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知公告表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysNoticeAtomImpl extends ServiceImpl<SysNoticeMapper, SysNoticeDO> implements SysNoticeAtom {

}
