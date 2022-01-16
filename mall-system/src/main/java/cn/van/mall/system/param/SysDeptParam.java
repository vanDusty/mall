package cn.van.mall.system.param;
import lombok.Data;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 *
 * @Author: VanFan
 * Date:     2022/1/16 4:09 下午
 * Description:
 * Version： V1.0
 */
@Data
public class SysDeptParam extends BaseParam {
    private Long deptId;
    private Long parentId;
    private String ancestors;
    private String deptName;
    private Integer orderNum;
    private String leader;
    private String phone;
    private String status;
    private String email;
    private String createBy;
    private String updateBy;
    /**
     * 部门树选择项是否关联显示
     */
    private Boolean deptCheckStrictly;

    private Long roleId;
    /**
     * 特殊id
     */
    private Long specialDeptId;

    private int delFlag;


    public SysDeptParam() {

    }

    public SysDeptParam(Long specialDeptId) {
        this.specialDeptId = specialDeptId;
    }
}