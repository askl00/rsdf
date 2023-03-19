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
 * 事件概率表(RsdfEventProbability)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_event_probability")
public class RsdfEventProbability implements Serializable {
    private static final long serialVersionUID = 883553252067653103L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 事件id
     */
    @TableField(value = "event_id")
    private Long eventId;
    
        /**
     * 概率
     */
    @TableField(value = "probability")
    private Integer probability;
    
}