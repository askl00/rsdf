package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 属性表(RsdfProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfPropertyDto implements Serializable {
    private static final long serialVersionUID = -77771861897462541L;
    
        private Long id;

        /**
     * 名称
     */
    private String name;

}