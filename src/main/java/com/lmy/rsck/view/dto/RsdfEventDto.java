package com.lmy.rsck.view.dto;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件(RsdfEvent)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventDto implements Serializable {
    private static final long serialVersionUID = -10738345393271874L;
    
        private Long id;

        /**
     * 时间id
     */
    private Date timeId;

        /**
     * 名称
     */
    private String name;

        /**
     * 父级事件
     */
    private Long parentId;

}