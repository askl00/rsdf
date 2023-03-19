package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏目标表(RsdfGameTarget)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfGameTargetQuery extends BaseParam {
    private static final long serialVersionUID = -63299094228143266L;
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
     * 目标id
     */
    private Long targetId;
    private Long targetIdNotEq;
    private boolean targetIdIsNull;
    private boolean targetIdIsNotNull;
    private List<Long> targetIdList;
    private List<Long> targetIdNotInList;
    private Long targetIdStart;
    private Long targetIdEnd;
    private Long targetIdLessThan;
    private Long targetIdLessThanOrEqualTo;
    private Long targetIdGreaterThan;
    private Long targetIdGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}