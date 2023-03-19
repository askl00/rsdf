package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 目标-所需属性表(RsdfTargetProperty)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfTargetPropertyQuery extends BaseParam {
    private static final long serialVersionUID = -88424258366554506L;
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
     * 属性值
     */
    private Integer propertyValue;
    private Integer propertyValueNotEq;
    private boolean propertyValueIsNull;
    private boolean propertyValueIsNotNull;
    private List<Integer> propertyValueList;
    private List<Integer> propertyValueNotInList;
    private Integer propertyValueStart;
    private Integer propertyValueEnd;
    private Integer propertyValueLessThan;
    private Integer propertyValueLessThanOrEqualTo;
    private Integer propertyValueGreaterThan;
    private Integer propertyValueGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}