package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 目标-所需属性表(RsdfTargetProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfTargetPropertyDto implements Serializable {
    private static final long serialVersionUID = 892055956174389680L;
    
        private Long id;

        /**
     * 目标id
     */
    private Long targetId;

        /**
     * 属性id
     */
    private Long propertyId;

        /**
     * 属性值
     */
    private Integer propertyValue;

}