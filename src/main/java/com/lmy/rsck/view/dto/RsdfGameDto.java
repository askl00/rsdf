package com.lmy.rsck.view.dto;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏（记录）表(RsdfGame)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGameDto implements Serializable {
    private static final long serialVersionUID = 653651271518708245L;
    
        private Long id;

        /**
     * 用户id
     */
    private Long userId;

        /**
     * 游戏唯一标识
     */
    private String distinctId;

        /**
     * 开始时间
     */
    private Object gameDate;

        /**
     * 开始时间
     */
    private Date timeStart;

        /**
     * 结束时间
     */
    private Date timeEnd;

}