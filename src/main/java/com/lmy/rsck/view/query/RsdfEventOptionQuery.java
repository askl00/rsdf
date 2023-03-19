package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件选项(RsdfEventOption)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventOptionQuery extends BaseParam {
    private static final long serialVersionUID = -46604482573378181L;
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
     * 选项id
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
     * 名称
     */
    private String name;
    private String nameNotEq;
    private boolean nameIsNull;
    private boolean nameIsNotNull;
    private List<String> nameList;
    private List<String> nameNotInList;
    private String nameLike;
    private String nameLikeLeft;
    private String nameLikeRight;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}