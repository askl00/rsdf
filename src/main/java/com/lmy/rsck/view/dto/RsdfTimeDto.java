package com.lmy.rsck.view.dto;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 时间(RsdfTime)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfTimeDto implements Serializable {
    private static final long serialVersionUID = 716952988199401572L;
    
        private Long id;

        /**
     * 开始时间
     */
    private Date timeStart;

        /**
     * 结束时间，为空时为时间点
     */
    private Date timeEnd;

}