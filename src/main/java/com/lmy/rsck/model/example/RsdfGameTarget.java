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
 * 游戏目标表(RsdfGameTarget)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_game_target")
public class RsdfGameTarget implements Serializable {
    private static final long serialVersionUID = 943262619912830932L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 游戏id
     */
    @TableField(value = "game_id")
    private Long gameId;
    
        /**
     * 目标id
     */
    @TableField(value = "target_id")
    private Long targetId;
    
}