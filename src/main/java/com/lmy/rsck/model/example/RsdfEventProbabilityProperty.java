package com.lmy.rsck.model.example;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 事件-属性概率表(RsdfEventProbabilityProperty)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_event_probability_property")
public class RsdfEventProbabilityProperty implements Serializable {
    private static final long serialVersionUID = -81921106007735420L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 事件id
     */
    @TableField(value = "event_id")
    private Long eventId;
    
        /**
     * 属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;
    
        /**
     * 最小值
     */
    @TableField(value = "min_value")
    private Integer minValue;
    
        /**
     * 最大值
     */
    @TableField(value = "max_value")
    private Integer maxValue;
    
        /**
     * 系数
     */
    @TableField(value = "ratio")
    private Integer ratio;
    
}