package cn.van.mall.system.mapper;

import cn.van.mall.system.param.SysDeptParam;
import cn.van.mall.system.entity.SysDeptDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2021/12/29 09:51 下午
 * Description: 部门表 Mapper 接口
 * Version： V1.0
 */

@Mapper
public interface SysDeptMapper extends BaseMapper<SysDeptDO> {

    /**
     * todo FIND_IN_SET 使用
     * @param param
     * @return
     */
    List<SysDeptDO> selectListByParam(SysDeptParam param);

    List<Long> selectDeptListByRoleId(SysDeptParam param);

    int selectCount(SysDeptParam param);

    /**
     * todo 后续铁定修改
     * @param depts
     * @return
     */
    int updateDeptChildren(List<SysDeptDO> depts);

}