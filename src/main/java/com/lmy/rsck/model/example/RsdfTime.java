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
 * 时间(RsdfTime)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_time")
public class RsdfTime implements Serializable {
    private static final long serialVersionUID = 666582682594378114L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 开始时间
     */
    @TableField(value = "time_start")
    private Date timeStart;
    
        /**
     * 结束时间，为空时为时间点
     */
    @TableField(value = "time_end")
    private Date timeEnd;
    
}