package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 词条表(RsdfEntry)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:00
 */
@Data
@Accessors(chain = true)
public class RsdfEntryDto implements Serializable {
    private static final long serialVersionUID = -98662166864907598L;
    
        private Long id;

        /**
     * 名称
     */
    private String name;

}