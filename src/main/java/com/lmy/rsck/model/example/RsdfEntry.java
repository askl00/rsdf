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
 * 词条表(RsdfEntry)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:02
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_entry")
public class RsdfEntry implements Serializable {
    private static final long serialVersionUID = -15257084354250540L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 名称
     */
    @TableField(value = "name")
    private String name;
    
}