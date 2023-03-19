package com.lmy.rsck.view.dto;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏发生的事件表(RsdfGameEvent)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGameEventDto implements Serializable {
    private static final long serialVersionUID = -66494187913775056L;
    
        private Long id;

        /**
     * 游戏id
     */
    private Long gameId;

        /**
     * 开始时间
     */
    private Date eventId;

}