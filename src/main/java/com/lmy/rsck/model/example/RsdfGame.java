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
 * 游戏（记录）表(RsdfGame)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_game")
public class RsdfGame implements Serializable {
    private static final long serialVersionUID = -33253536612756210L;
    
        @TableId(type= IdType.AUTO)
    @TableField(value = "id")
    private Long id;
    
        /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;
    
        /**
     * 游戏唯一标识
     */
    @TableField(value = "distinct_id")
    private String distinctId;
    
        /**
     * 开始时间
     */
    @TableField(value = "game_date")
    private Object gameDate;
    
        /**
     * 开始时间
     */
    @TableField(value = "time_start")
    private Date timeStart;
    
        /**
     * 结束时间
     */
    @TableField(value = "time_end")
    private Date timeEnd;
    
}