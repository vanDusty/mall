package cn.van.mall.system.param;

import lombok.Data;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2022/1/9 3:58 下午
 * Description: 系统角色查询参数
 * Version： V1.0
 */
@Data
public class SysRoleParam extends BaseParam{

    private Long userId;

    private Long roleId;

    private String roleName;

    private String userName;

    private String status;

    private String roleKey;

}