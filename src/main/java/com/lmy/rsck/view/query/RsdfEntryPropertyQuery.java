package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 词条属性表(RsdfEntryProperty)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEntryPropertyQuery extends BaseParam {
    private static final long serialVersionUID = 254199026517906612L;
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
     * 词条id
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
     * 属性id
     */
    private Long propertyId;
    private Long propertyIdNotEq;
    private boolean propertyIdIsNull;
    private boolean propertyIdIsNotNull;
    private List<Long> propertyIdList;
    private List<Long> propertyIdNotInList;
    private Long propertyIdStart;
    private Long propertyIdEnd;
    private Long propertyIdLessThan;
    private Long propertyIdLessThanOrEqualTo;
    private Long propertyIdGreaterThan;
    private Long propertyIdGreaterThanOrEqualTo;
        /**
     * 概率
     */
    private Integer property;
    private Integer propertyNotEq;
    private boolean propertyIsNull;
    private boolean propertyIsNotNull;
    private List<Integer> propertyList;
    private List<Integer> propertyNotInList;
    private Integer propertyStart;
    private Integer propertyEnd;
    private Integer propertyLessThan;
    private Integer propertyLessThanOrEqualTo;
    private Integer propertyGreaterThan;
    private Integer propertyGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}