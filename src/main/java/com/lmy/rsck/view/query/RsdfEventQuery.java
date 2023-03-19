package com.lmy.rsck.view.query;

import java.util.Date;
import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 事件(RsdfEvent)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfEventQuery extends BaseParam {
    private static final long serialVersionUID = 287030687752995106L;
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
     * 时间id
     */
    private Date timeId;
    private Date timeIdNotEq;
    private boolean timeIdIsNull;
    private boolean timeIdIsNotNull;
    private List<Date> timeIdList;
    private List<Date> timeIdNotInList;
    private Date timeIdStart;
    private Date timeIdEnd;
    private Date timeIdLessThan;
    private Date timeIdLessThanOrEqualTo;
    private Date timeIdGreaterThan;
    private Date timeIdGreaterThanOrEqualTo;
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
     * 父级事件
     */
    private Long parentId;
    private Long parentIdNotEq;
    private boolean parentIdIsNull;
    private boolean parentIdIsNotNull;
    private List<Long> parentIdList;
    private List<Long> parentIdNotInList;
    private Long parentIdStart;
    private Long parentIdEnd;
    private Long parentIdLessThan;
    private Long parentIdLessThanOrEqualTo;
    private Long parentIdGreaterThan;
    private Long parentIdGreaterThanOrEqualTo;
    /**
     * aes 是否正序
     * orderByColumn 排序列名
     */
    private boolean aes;
    private String orderByColumn;
}