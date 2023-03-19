package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件-属性概率表(RsdfEventProbabilityProperty)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventProbabilityPropertyQuery extends BaseParam {
    private static final long serialVersionUID = -16295815462016627L;
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
     * 最小值
     */
    private Integer minValue;
    private Integer minValueNotEq;
    private boolean minValueIsNull;
    private boolean minValueIsNotNull;
    private List<Integer> minValueList;
    private List<Integer> minValueNotInList;
    private Integer minValueStart;
    private Integer minValueEnd;
    private Integer minValueLessThan;
    private Integer minValueLessThanOrEqualTo;
    private Integer minValueGreaterThan;
    private Integer minValueGreaterThanOrEqualTo;
        /**
     * 最大值
     */
    private Integer maxValue;
    private Integer maxValueNotEq;
    private boolean maxValueIsNull;
    private boolean maxValueIsNotNull;
    private List<Integer> maxValueList;
    private List<Integer> maxValueNotInList;
    private Integer maxValueStart;
    private Integer maxValueEnd;
    private Integer maxValueLessThan;
    private Integer maxValueLessThanOrEqualTo;
    private Integer maxValueGreaterThan;
    private Integer maxValueGreaterThanOrEqualTo;
        /**
     * 系数
     */
    private Integer ratio;
    private Integer ratioNotEq;
    private boolean ratioIsNull;
    private boolean ratioIsNotNull;
    private List<Integer> ratioList;
    private List<Integer> ratioNotInList;
    private Integer ratioStart;
    private Integer ratioEnd;
    private Integer ratioLessThan;
    private Integer ratioLessThanOrEqualTo;
    private Integer ratioGreaterThan;
    private Integer ratioGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}