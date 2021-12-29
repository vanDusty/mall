package cn.van.mall.database.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 在线用户记录
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Getter
@Setter
@TableName("sys_user_online")
public class SysUserOnlineDO extends Model<SysUserOnlineDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户会话id
     */
    @TableId(value = "sessionId", type = IdType.AUTO)
    private String sessionId;

    /**
     * 登录账号
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 部门名称
     */
    @TableField("dept_name")
    private String deptName;

    /**
     * 登录IP地址
     */
    @TableField("ipaddr")
    private String ipaddr;

    /**
     * 登录地点
     */
    @TableField("login_location")
    private String loginLocation;

    /**
     * 浏览器类型
     */
    @TableField("browser")
    private String browser;

    /**
     * 操作系统
     */
    @TableField("os")
    private String os;

    /**
     * 在线状态on_line在线off_line离线
     */
    @TableField("`status`")
    private String status;

    /**
     * session创建时间
     */
    @TableField("start_timestamp")
    private LocalDateTime startTimestamp;

    /**
     * session最后访问时间
     */
    @TableField("last_access_time")
    private LocalDateTime lastAccessTime;

    /**
     * 超时时间，单位为分钟
     */
    @TableField("expire_time")
    private Integer expireTime;


    @Override
    public Serializable pkVal() {
        return this.sessionId;
    }

}
