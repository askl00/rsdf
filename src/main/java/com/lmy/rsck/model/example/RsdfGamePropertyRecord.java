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
 * 属性变动记录表(RsdfGamePropertyRecord)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_game_property_record")
public class RsdfGamePropertyRecord implements Serializable {
    private static final long serialVersionUID = 290337747702888857L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 游戏属性id
     */
    @TableField(value = "game_property_id")
    private Long gamePropertyId;
    
        /**
     * 时间id
     */
    @TableField(value = "time_id")
    private Long timeId;
    
        /**
     * 属性值
     */
    @TableField(value = "value")
    private Integer value;
    
        /**
     * 来源
     */
    @TableField(value = "source")
    private Integer source;
    
        /**
     * 来源id
     */
    @TableField(value = "source_id")
    private Long sourceId;
    
        /**
     * 发生时间
     */
    @TableField(value = "created_time")
    private Date createdTime;
    
}