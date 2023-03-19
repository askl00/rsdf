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
 * 词条属性表(RsdfEntryProperty)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_entry_property")
public class RsdfEntryProperty implements Serializable {
    private static final long serialVersionUID = -37603451046351486L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 词条id
     */
    @TableField(value = "entry_id")
    private Long entryId;
    
        /**
     * 属性id
     */
    @TableField(value = "property_id")
    private Long propertyId;
    
        /**
     * 概率
     */
    @TableField(value = "property")
    private Integer property;
    
}