package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏词条表(RsdfGameEntry)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGameEntryQuery extends BaseParam {
    private static final long serialVersionUID = -18228928707045338L;
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
    private Long entryId;
    private Long entryIdNotEq;
    private boolean entryIdIsNull;
    private boolean entryIdIsNotNull;
    private List<Long> entryIdList;
    private List<Long> entryIdNotInList;
    private Long entryIdStart;
    private Long entryIdEnd;
    private Long entryIdLessThan;
    private Long entryIdLessThanOrEqualTo;
    private Long entryIdGreaterThan;
    private Long entryIdGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}