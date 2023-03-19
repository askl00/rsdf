package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件-属性概率表(RsdfEventProbabilityProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventProbabilityPropertyDto implements Serializable {
    private static final long serialVersionUID = 640454734838244943L;
    
        private Long id;

        /**
     * 事件id
     */
    private Long eventId;

        /**
     * 属性id
     */
    private Long propertyId;

        /**
     * 最小值
     */
    private Integer minValue;

        /**
     * 最大值
     */
    private Integer maxValue;

        /**
     * 系数
     */
    private Integer ratio;

}