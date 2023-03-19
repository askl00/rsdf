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
 * 事件选项(RsdfEventOption)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_event_option")
public class RsdfEventOption implements Serializable {
    private static final long serialVersionUID = -31672400161367433L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 选项id
     */
    @TableField(value = "event_id")
    private Long eventId;
    
        /**
     * 名称
     */
    @TableField(value = "name")
    private String name;
    
}