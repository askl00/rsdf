package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件选项(RsdfEventOption)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventOptionDto implements Serializable {
    private static final long serialVersionUID = -12337032249865824L;
    
        private Long id;

        /**
     * 选项id
     */
    private Long eventId;

        /**
     * 名称
     */
    private String name;

}