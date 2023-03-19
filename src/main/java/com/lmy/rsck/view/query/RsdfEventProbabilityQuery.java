package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件概率表(RsdfEventProbability)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventProbabilityQuery extends BaseParam {
    private static final long serialVersionUID = 402115461932338676L;
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
     * 事件id
     */
    private Long eventId;
    private Long eventIdNotEq;
    private boolean eventIdIsNull;
    private boolean eventIdIsNotNull;
    private List<Long> eventIdList;
    private List<Long> eventIdNotInList;
    private Long eventIdStart;
    private Long eventIdEnd;
    private Long eventIdLessThan;
    private Long eventIdLessThanOrEqualTo;
    private Long eventIdGreaterThan;
    private Long eventIdGreaterThanOrEqualTo;
        /**
     * 概率
     */
    private Integer probability;
    private Integer probabilityNotEq;
    private boolean probabilityIsNull;
    private boolean probabilityIsNotNull;
    private List<Integer> probabilityList;
    private List<Integer> probabilityNotInList;
    private Integer probabilityStart;
    private Integer probabilityEnd;
    private Integer probabilityLessThan;
    private Integer probabilityLessThanOrEqualTo;
    private Integer probabilityGreaterThan;
    private Integer probabilityGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}