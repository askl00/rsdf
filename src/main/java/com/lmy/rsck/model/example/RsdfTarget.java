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
 * 目标表(RsdfTarget)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_target")
public class RsdfTarget implements Serializable {
    private static final long serialVersionUID = 545705094761956028L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 名称
     */
    @TableField(value = "name")
    private String name;
    
}