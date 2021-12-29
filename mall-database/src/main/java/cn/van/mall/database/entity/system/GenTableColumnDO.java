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
 * 代码生成业务表字段
 * </p>
 *
 * @author VanFan
 * @since 2021-12-29
 */
@Getter
@Setter
@TableName("gen_table_column")
public class GenTableColumnDO extends Model<GenTableColumnDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "column_id", type = IdType.AUTO)
    private Long columnId;

    /**
     * 归属表编号
     */
    @TableField("table_id")
    private String tableId;

    /**
     * 列名称
     */
    @TableField("`column_name`")
    private String columnName;

    /**
     * 列描述
     */
    @TableField("column_comment")
    private String columnComment;

    /**
     * 列类型
     */
    @TableField("column_type")
    private String columnType;

    /**
     * JAVA类型
     */
    @TableField("java_type")
    private String javaType;

    /**
     * JAVA字段名
     */
    @TableField("java_field")
    private String javaField;

    /**
     * 是否主键（1是）
     */
    @TableField("is_pk")
    private String isPk;

    /**
     * 是否自增（1是）
     */
    @TableField("is_increment")
    private String isIncrement;

    /**
     * 是否必填（1是）
     */
    @TableField("is_required")
    private String isRequired;

    /**
     * 是否为插入字段（1是）
     */
    @TableField("is_insert")
    private String isInsert;

    /**
     * 是否编辑字段（1是）
     */
    @TableField("is_edit")
    private String isEdit;

    /**
     * 是否列表字段（1是）
     */
    @TableField("is_list")
    private String isList;

    /**
     * 是否查询字段（1是）
     */
    @TableField("is_query")
    private String isQuery;

    /**
     * 查询方式（等于、不等于、大于、小于、范围）
     */
    @TableField("query_type")
    private String queryType;

    /**
     * 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）
     */
    @TableField("html_type")
    private String htmlType;

    /**
     * 字典类型
     */
    @TableField("dict_type")
    private String dictType;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


    @Override
    public Serializable pkVal() {
        return this.columnId;
    }

}
