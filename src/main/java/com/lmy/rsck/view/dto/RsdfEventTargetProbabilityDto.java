package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件-目标概率表(RsdfEventTargetProbability)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventTargetProbabilityDto implements Serializable {
    private static final long serialVersionUID = -63281588264736759L;
    
        private Long id;

        /**
     * 事件id
     */
    private Long eventId;

        /**
     * 目标id
     */
    private Long targetId;

        /**
     * 概率
     */
    private Integer probability;

}