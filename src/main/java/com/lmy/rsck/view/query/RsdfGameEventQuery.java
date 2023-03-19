package com.lmy.rsck.view.query;

import java.util.Date;
import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏发生的事件表(RsdfGameEvent)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGameEventQuery extends BaseParam {
    private static final long serialVersionUID = 955650813955602351L;
        private Long id;
    private Long idNotEq;
    private boolean idIsNull;
    private boolean idIsNotNull;
    private List<Long> idList;
    private List<Long> idNotInList;
    private Long idStart;
    private Long idEnd;
    private Long idLessThan;
    private Long idLessThanOrEqualTo;
    private Long idGreaterThan;
    private Long idGreaterThanOrEqualTo;
        /**
     * 游戏id
     */
    private Long gameId;
    private Long gameIdNotEq;
    private boolean gameIdIsNull;
    private boolean gameIdIsNotNull;
    private List<Long> gameIdList;
    private List<Long> gameIdNotInList;
    private Long gameIdStart;
    private Long gameIdEnd;
    private Long gameIdLessThan;
    private Long gameIdLessThanOrEqualTo;
    private Long gameIdGreaterThan;
    private Long gameIdGreaterThanOrEqualTo;
        /**
     * 开始时间
     */
    private Date eventId;
    private Date eventIdNotEq;
    private boolean eventIdIsNull;
    private boolean eventIdIsNotNull;
    private List<Date> eventIdList;
    private List<Date> eventIdNotInList;
    private Date eventIdStart;
    private Date eventIdEnd;
    private Date eventIdLessThan;
    private Date eventIdLessThanOrEqualTo;
    private Date eventIdGreaterThan;
    private Date eventIdGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}