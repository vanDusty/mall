package cn.van.mall.database.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色和部门关联表
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Getter
@Setter
@TableName("sys_role_dept")
public class SysRoleDeptDO extends Model<SysRoleDeptDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 部门ID
     */
    @TableField(value = "dept_id")
    private Long deptId;


    @Override
    public Serializable pkVal() {
        return this.deptId;
    }

}