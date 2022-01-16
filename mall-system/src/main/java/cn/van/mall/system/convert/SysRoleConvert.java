package cn.van.mall.system.convert;

import cn.van.mall.system.entity.SysRoleDO;
import cn.van.mall.system.model.SysRoleDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2022/1/9 20:35 下午
 * Description: 系统角色模型映射(注入到Spring容器)
 * Version： V1.0
 */
@Mapper(componentModel = "spring")
public interface SysRoleConvert {

    /**
     * 一对一映射
     * @param userDO
     * @return
     */
    SysRoleDTO doToDTO(SysRoleDO userDO);

    /**
     * 集合映射
     * @param userInfoDOS
     * @return
     */
    List<SysRoleDTO> doSToDtoS(List<SysRoleDO> userInfoDOS);
}