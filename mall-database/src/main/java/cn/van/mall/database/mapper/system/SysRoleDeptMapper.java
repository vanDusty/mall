package cn.van.mall.database.mapper.system;

import cn.van.mall.database.entity.system.SysRoleDeptDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色和部门关联表 Mapper 接口
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Mapper
public interface SysRoleDeptMapper extends BaseMapper<SysRoleDeptDO> {

}
