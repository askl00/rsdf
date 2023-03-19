package com.lmy.rsck.view.query;

import java.util.Date;
import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 时间(RsdfTime)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Data
@Accessors(chain = true)
public class RsdfTimeQuery extends BaseParam {
    private static final long serialVersionUID = 406357088939470798L;
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
     * 开始时间
     */
    private Date timeStart;
    private Date timeStartNotEq;
    private boolean timeStartIsNull;
    private boolean timeStartIsNotNull;
    private List<Date> timeStartList;
    private List<Date> timeStartNotInList;
    private Date timeStartStart;
    private Date timeStartEnd;
    private Date timeStartLessThan;
    private Date timeStartLessThanOrEqualTo;
    private Date timeStartGreaterThan;
    private Date timeStartGreaterThanOrEqualTo;
        /**
     * 结束时间，为空时为时间点
     */
    private Date timeEnd;
    private Date timeEndNotEq;
    private boolean timeEndIsNull;
    private boolean timeEndIsNotNull;
    private List<Date> timeEndList;
    private List<Date> timeEndNotInList;
    private Date timeEndStart;
    private Date timeEndEnd;
    private Date timeEndLessThan;
    private Date timeEndLessThanOrEqualTo;
    private Date timeEndGreaterThan;
    private Date timeEndGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}