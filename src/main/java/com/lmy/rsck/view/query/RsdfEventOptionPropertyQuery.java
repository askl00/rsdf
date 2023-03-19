package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件-属性变动表(RsdfEventOptionProperty)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventOptionPropertyQuery extends BaseParam {
    private static final long serialVersionUID = 989571259287129058L;
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
    private Long optionId;
    private Long optionIdNotEq;
    private boolean optionIdIsNull;
    private boolean optionIdIsNotNull;
    private List<Long> optionIdList;
    private List<Long> optionIdNotInList;
    private Long optionIdStart;
    private Long optionIdEnd;
    private Long optionIdLessThan;
    private Long optionIdLessThanOrEqualTo;
    private Long optionIdGreaterThan;
    private Long optionIdGreaterThanOrEqualTo;
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
     * 变动最小值
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
     * 变动最大值
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
     * 0=加减 1=百分比
     */
    private Integer changeType;
    private Integer changeTypeNotEq;
    private boolean changeTypeIsNull;
    private boolean changeTypeIsNotNull;
    private List<Integer> changeTypeList;
    private List<Integer> changeTypeNotInList;
    private Integer changeTypeStart;
    private Integer changeTypeEnd;
    private Integer changeTypeLessThan;
    private Integer changeTypeLessThanOrEqualTo;
    private Integer changeTypeGreaterThan;
    private Integer changeTypeGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}