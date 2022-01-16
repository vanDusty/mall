package cn.van.mall.system.convert;

import cn.van.mall.system.entity.SysDeptDO;
import cn.van.mall.system.entity.SysUserDO;
import cn.van.mall.system.model.SysDeptDTO;
import cn.van.mall.system.model.SysUserInfoDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2022/1/9 6:35 下午
 * Description: 系统部门模型映射(注入到Spring容器)
 * Version： V1.0
 */
@Mapper(componentModel = "spring")
public interface SysDeptConvert {

    /**
     * 一对一映射
     * @param deptDO
     * @return
     */
    SysDeptDTO doToDto(SysDeptDO deptDO);

    /**
     * 集合映射
     * @param deptDOS
     * @return
     */
    List<SysDeptDTO> doToDtoS(List<SysDeptDO> deptDOS);
}