package com.lmy.rsck.view.query;

import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 人物属性表(RsdfUserProperty)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfUserPropertyQuery extends BaseParam {
    private static final long serialVersionUID = 175006808890215968L;
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
     * 用户id
     */
    private Long userId;
    private Long userIdNotEq;
    private boolean userIdIsNull;
    private boolean userIdIsNotNull;
    private List<Long> userIdList;
    private List<Long> userIdNotInList;
    private Long userIdStart;
    private Long userIdEnd;
    private Long userIdLessThan;
    private Long userIdLessThanOrEqualTo;
    private Long userIdGreaterThan;
    private Long userIdGreaterThanOrEqualTo;
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
    private Integer value;
    private Integer valueNotEq;
    private boolean valueIsNull;
    private boolean valueIsNotNull;
    private List<Integer> valueList;
    private List<Integer> valueNotInList;
    private Integer valueStart;
    private Integer valueEnd;
    private Integer valueLessThan;
    private Integer valueLessThanOrEqualTo;
    private Integer valueGreaterThan;
    private Integer valueGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}