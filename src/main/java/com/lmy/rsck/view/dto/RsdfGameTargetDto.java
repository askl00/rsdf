package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏目标表(RsdfGameTarget)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfGameTargetDto implements Serializable {
    private static final long serialVersionUID = -70554053553585596L;
    
        private Long id;

        /**
     * 游戏id
     */
    private Long gameId;

        /**
     * 目标id
     */
    private Long targetId;

}