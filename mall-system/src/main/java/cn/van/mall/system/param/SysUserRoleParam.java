package cn.van.mall.system.param;

import lombok.Data;
/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2022/1/16 2:46 下午
 * Description: 系统用户角色关联查询参数
 * Version： V1.0
 */
@Data
public class SysUserRoleParam extends BaseParam {

    private Long userId;

    private Long roleId;

    private Long[] userIds;

    public SysUserRoleParam() {

    }

    public SysUserRoleParam(Long userId) {
        this.userId = userId;
    }

    public SysUserRoleParam(Long[] userIds) {
        this.userIds = userIds;
    }

    public SysUserRoleParam(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public SysUserRoleParam(Long roleId, Long[] userIds) {
        this.userIds = userIds;
        this.roleId = roleId;
    }
}