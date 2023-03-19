package com.lmy.rsck.view.query;

import java.util.Date;
import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 属性变动记录表(RsdfGamePropertyRecord)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGamePropertyRecordQuery extends BaseParam {
    private static final long serialVersionUID = 891789022936688716L;
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
     * 游戏属性id
     */
    private Long gamePropertyId;
    private Long gamePropertyIdNotEq;
    private boolean gamePropertyIdIsNull;
    private boolean gamePropertyIdIsNotNull;
    private List<Long> gamePropertyIdList;
    private List<Long> gamePropertyIdNotInList;
    private Long gamePropertyIdStart;
    private Long gamePropertyIdEnd;
    private Long gamePropertyIdLessThan;
    private Long gamePropertyIdLessThanOrEqualTo;
    private Long gamePropertyIdGreaterThan;
    private Long gamePropertyIdGreaterThanOrEqualTo;
        /**
     * 时间id
     */
    private Long timeId;
    private Long timeIdNotEq;
    private boolean timeIdIsNull;
    private boolean timeIdIsNotNull;
    private List<Long> timeIdList;
    private List<Long> timeIdNotInList;
    private Long timeIdStart;
    private Long timeIdEnd;
    private Long timeIdLessThan;
    private Long timeIdLessThanOrEqualTo;
    private Long timeIdGreaterThan;
    private Long timeIdGreaterThanOrEqualTo;
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
     * 来源
     */
    private Integer source;
    private Integer sourceNotEq;
    private boolean sourceIsNull;
    private boolean sourceIsNotNull;
    private List<Integer> sourceList;
    private List<Integer> sourceNotInList;
    private Integer sourceStart;
    private Integer sourceEnd;
    private Integer sourceLessThan;
    private Integer sourceLessThanOrEqualTo;
    private Integer sourceGreaterThan;
    private Integer sourceGreaterThanOrEqualTo;
        /**
     * 来源id
     */
    private Long sourceId;
    private Long sourceIdNotEq;
    private boolean sourceIdIsNull;
    private boolean sourceIdIsNotNull;
    private List<Long> sourceIdList;
    private List<Long> sourceIdNotInList;
    private Long sourceIdStart;
    private Long sourceIdEnd;
    private Long sourceIdLessThan;
    private Long sourceIdLessThanOrEqualTo;
    private Long sourceIdGreaterThan;
    private Long sourceIdGreaterThanOrEqualTo;
        /**
     * 发生时间
     */
    private Date createdTime;
    private Date createdTimeNotEq;
    private boolean createdTimeIsNull;
    private boolean createdTimeIsNotNull;
    private List<Date> createdTimeList;
    private List<Date> createdTimeNotInList;
    private Date createdTimeStart;
    private Date createdTimeEnd;
    private Date createdTimeLessThan;
    private Date createdTimeLessThanOrEqualTo;
    private Date createdTimeGreaterThan;
    private Date createdTimeGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}