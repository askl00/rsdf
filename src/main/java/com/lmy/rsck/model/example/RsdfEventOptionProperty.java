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
 * 事件-属性变动表(RsdfEventOptionProperty)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_event_option_property")
public class RsdfEventOptionProperty implements Serializable {
    private static final long serialVersionUID = 587729909978259258L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 目标id
     */
    @TableField(value = "option_id")
    private Long optionId;
    
        /**
     * 属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;
    
        /**
     * 变动最小值
     */
    @TableField(value = "min_value")
    private Integer minValue;
    
        /**
     * 变动最大值
     */
    @TableField(value = "max_value")
    private Integer maxValue;
    
        /**
     * 0=加减 1=百分比
     */
    @TableField(value = "change_type")
    private Integer changeType;
    
}