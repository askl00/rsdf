package com.lmy.rsck.model.example;

import java.util.Date;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 事件(RsdfEvent)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_event")
public class RsdfEvent implements Serializable {
    private static final long serialVersionUID = 801763562178421009L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 时间id
     */
    @TableField(value = "time_id")
    private Date timeId;
    
        /**
     * 名称
     */
    @TableField(value = "name")
    private String name;
    
        /**
     * 父级事件
     */
    @TableField(value = "parent_id")
    private Long parentId;
    
}