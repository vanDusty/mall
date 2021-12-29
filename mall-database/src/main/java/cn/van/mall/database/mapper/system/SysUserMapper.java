package cn.van.mall.database.mapper.system;

import cn.van.mall.database.entity.system.SysUserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserDO> {

}
