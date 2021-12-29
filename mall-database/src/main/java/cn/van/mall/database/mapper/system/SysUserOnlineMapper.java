package cn.van.mall.database.mapper.system;

import cn.van.mall.database.entity.system.SysUserOnlineDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 在线用户记录 Mapper 接口
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Mapper
public interface SysUserOnlineMapper extends BaseMapper<SysUserOnlineDO> {

}