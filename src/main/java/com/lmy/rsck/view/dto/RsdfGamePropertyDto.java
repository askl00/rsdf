package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏人物属性表(RsdfGameProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGamePropertyDto implements Serializable {
    private static final long serialVersionUID = 685737245746710936L;
    
        private Long id;

        /**
     * 游戏id
     */
    private Long gameId;

        /**
     * 游戏id
     */
    private Long propertyId;

        /**
     * 属性值
     */
    private Integer value;

}