package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 目标表(RsdfTarget)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfTargetDto implements Serializable {
    private static final long serialVersionUID = 665719966440732190L;
    
        private Long id;

        /**
     * 名称
     */
    private String name;

}