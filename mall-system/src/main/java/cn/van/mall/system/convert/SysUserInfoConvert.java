package cn.van.mall.system.convert;

import cn.van.mall.system.entity.SysUserDO;
import cn.van.mall.system.model.SysUserInfoDTO;
import org.mapstruct.Mapper;
import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2022/1/9 6:35 下午
 * Description: 系统用户模型映射(注入到Spring容器)
 * Version： V1.0
 */
@Mapper(componentModel = "spring")
public interface SysUserInfoConvert {

    /**
     * 一对一映射
     * @param userDO
     * @return
     */
    SysUserInfoDTO doToDTO(SysUserDO userDO);

    /**
     * 集合映射
     * @param userInfoDOS
     * @return
     */
    List<SysUserInfoDTO> doSToDtoS(List<SysUserDO> userInfoDOS);
}