package cn.van.mall.database.atom.system.impl;

import cn.van.mall.database.entity.system.SysDeptDO;
import cn.van.mall.database.mapper.system.SysDeptMapper;
import cn.van.mall.database.atom.system.SysDeptAtom;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Service
public class SysDeptAtomImpl extends ServiceImpl<SysDeptMapper, SysDeptDO> implements SysDeptAtom {

}
