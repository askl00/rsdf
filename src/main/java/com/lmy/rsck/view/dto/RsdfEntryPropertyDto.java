package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 词条属性表(RsdfEntryProperty)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEntryPropertyDto implements Serializable {
    private static final long serialVersionUID = -44535269200290054L;
    
        private Long id;

        /**
     * 词条id
     */
    private Long entryId;

        /**
     * 属性id
     */
    private Long propertyId;

        /**
     * 概率
     */
    private Integer property;

}