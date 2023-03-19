package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 词条表(RsdfEntry)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:01
 */
@Data
@Accessors(chain = true)
public class RsdfEntryQuery extends BaseParam {
    private static final long serialVersionUID = 491116924655676503L;
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