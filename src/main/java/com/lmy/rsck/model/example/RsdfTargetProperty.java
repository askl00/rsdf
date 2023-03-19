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
 * 目标-所需属性表(RsdfTargetProperty)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_target_property")
public class RsdfTargetProperty implements Serializable {
    private static final long serialVersionUID = 881484961723425990L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 目标id
     */
    @TableField(value = "target_id")
    private Long targetId;
    
        /**
     * 属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;
    
        /**
     * 属性值
     */
    @TableField(value = "property_value")
    private Integer propertyValue;
    
}