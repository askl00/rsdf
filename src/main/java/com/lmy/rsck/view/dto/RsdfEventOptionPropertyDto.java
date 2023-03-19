package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件-属性变动表(RsdfEventOptionProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventOptionPropertyDto implements Serializable {
    private static final long serialVersionUID = 828870282388437450L;
    
        private Long id;

        /**
     * 目标id
     */
    private Long optionId;

        /**
     * 属性id
     */
    private Long propertyId;

        /**
     * 变动最小值
     */
    private Integer minValue;

        /**
     * 变动最大值
     */
    private Integer maxValue;

        /**
     * 0=加减 1=百分比
     */
    private Integer changeType;

}