package cn.van.mall.database.mapper.system;

import cn.van.mall.database.entity.system.SysJobDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 定时任务调度表 Mapper 接口
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Mapper
public interface SysJobMapper extends BaseMapper<SysJobDO> {

}
