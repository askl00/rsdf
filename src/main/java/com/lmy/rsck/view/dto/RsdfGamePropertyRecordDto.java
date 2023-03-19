package com.lmy.rsck.view.dto;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 属性变动记录表(RsdfGamePropertyRecord)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGamePropertyRecordDto implements Serializable {
    private static final long serialVersionUID = 582066043531472873L;
    
        private Long id;

        /**
     * 游戏属性id
     */
    private Long gamePropertyId;

        /**
     * 时间id
     */
    private Long timeId;

        /**
     * 属性值
     */
    private Integer value;

        /**
     * 来源
     */
    private Integer source;

        /**
     * 来源id
     */
    private Long sourceId;

        /**
     * 发生时间
     */
    private Date createdTime;

}