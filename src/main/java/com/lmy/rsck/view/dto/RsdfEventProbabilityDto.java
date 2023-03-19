package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件概率表(RsdfEventProbability)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventProbabilityDto implements Serializable {
    private static final long serialVersionUID = 979563002551151344L;
    
        private Long id;

        /**
     * 事件id
     */
    private Long eventId;

        /**
     * 概率
     */
    private Integer probability;

}