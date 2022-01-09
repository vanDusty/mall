package cn.van.mall.system.param;

import lombok.Data;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   VanFan
 * Date:     2022/1/9 3:58 下午
 * Description: 系统用户查询参数
 * Version： V1.0
 */
@Data
public class SysUserParam extends BaseParam{

    /**
     * 用户id
     */
    private Long userId;
    /**
     * 部门id
     */
    private Long deptId;
    /**
     * 用户账号
     */
    private String userName;
    /**
     * 角色id
     */
    private Long roleId;
    /**
     * 状态
     */
    private String status;
    /**
     * 手机号
     */
    private String phoneNum;

}