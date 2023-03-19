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
 * 人物属性表(RsdfUserProperty)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_user_property")
public class RsdfUserProperty implements Serializable {
    private static final long serialVersionUID = 225498789544158326L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;
    
        /**
     * 属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;
    
        /**
     * 属性值
     */
    @TableField(value = "value")
    private Integer value;
    
}