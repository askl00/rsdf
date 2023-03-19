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
 * 游戏词条表(RsdfGameEntry)Entity
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
@TableName("rsdf_game_entry")
public class RsdfGameEntry implements Serializable {
    private static final long serialVersionUID = 869327407878609065L;
    
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
    @TableField(value = "entry_id")
    private Long entryId;
    
}