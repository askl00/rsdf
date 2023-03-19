package com.lmy.rsck.view.query;

import java.util.Date;
import java.util.List;
import java.io.Serializable;
import com.cheers.micro.datasource.module.BaseParam;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏（记录）表(RsdfGame)Query
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGameQuery extends BaseParam {
    private static final long serialVersionUID = 907942850278577528L;
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
     * 游戏唯一标识
     */
    private String distinctId;
    private String distinctIdNotEq;
    private boolean distinctIdIsNull;
    private boolean distinctIdIsNotNull;
    private List<String> distinctIdList;
    private List<String> distinctIdNotInList;
    private String distinctIdLike;
    private String distinctIdLikeLeft;
    private String distinctIdLikeRight;
        /**
     * 开始时间
     */
    private Object gameDate;
    private Object gameDateNotEq;
    private boolean gameDateIsNull;
    private boolean gameDateIsNotNull;
    private List<Object> gameDateList;
    private List<Object> gameDateNotInList;
    private Object gameDateStart;
    private Object gameDateEnd;
    private Object gameDateLessThan;
    private Object gameDateLessThanOrEqualTo;
    private Object gameDateGreaterThan;
    private Object gameDateGreaterThanOrEqualTo;
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
     * 结束时间
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