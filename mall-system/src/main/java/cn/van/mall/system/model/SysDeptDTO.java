package cn.van.mall.system.model;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 *
 * @Author: VanFan
 * Date:     2022/1/16 4:08 下午
 * Description:
 * Version： V1.0
 */
@Data
public class SysDeptDTO implements Serializable {
    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 父部门id
     */
    private Long parentId;

    /**
     * 祖级列表
     */
    private String ancestors;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 显示顺序
     */
    private Integer orderNum;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 部门状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}