package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 人物属性表(RsdfUserProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfUserPropertyDto implements Serializable {
    private static final long serialVersionUID = 530894032794047411L;
    
        private Long id;

        /**
     * 用户id
     */
    private Long userId;

        /**
     * 属性id
     */
    private Long propertyId;

        /**
     * 属性值
     */
    private Integer value;

}