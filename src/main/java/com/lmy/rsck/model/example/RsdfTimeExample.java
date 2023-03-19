package com.lmy.rsck.model.example;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfTimeQuery;
/**
 * 时间(RsdfTime)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public class RsdfTimeExample {
    public static Wrapper<RsdfTime> getWrapper(RsdfTimeQuery rsdfTimeQuery){
        QueryWrapper<RsdfTime> wrapper = new QueryWrapper();
                if(rsdfTimeQuery.getId()!=null){
            wrapper.lambda().eq(RsdfTime::getId,rsdfTimeQuery.getId());
        }
        if(rsdfTimeQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfTime::getId,rsdfTimeQuery.getIdNotEq());
        }
        if(rsdfTimeQuery.getIdStart()!=null&&rsdfTimeQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfTime::getId,rsdfTimeQuery.getIdStart(),rsdfTimeQuery.getIdEnd());
        }
        if(rsdfTimeQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfTime::getId,rsdfTimeQuery.getIdLessThan());
        }
        if(rsdfTimeQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTime::getId,rsdfTimeQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfTimeQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTime::getId,rsdfTimeQuery.getIdGreaterThan());
        }
        if(rsdfTimeQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTime::getId,rsdfTimeQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfTimeQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfTime::getId);
        }
        if(rsdfTimeQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTime::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfTimeQuery.getIdList())){
            wrapper.lambda().in(RsdfTime::getId,rsdfTimeQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTimeQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfTime::getId,rsdfTimeQuery.getIdNotInList());
        }
            /**
         * 开始时间
         */
            if(rsdfTimeQuery.getTimeStart()!=null){
            wrapper.lambda().eq(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStart());
        }
        if(rsdfTimeQuery.getTimeStartNotEq()!=null){
            wrapper.lambda().ne(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartNotEq());
        }
        if(rsdfTimeQuery.getTimeStartStart()!=null&&rsdfTimeQuery.getTimeStartEnd()!=null){
            wrapper.lambda().between(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartStart(),rsdfTimeQuery.getTimeStartEnd());
        }
        if(rsdfTimeQuery.getTimeStartLessThan()!=null){
            wrapper.lambda().lt(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartLessThan());
        }
        if(rsdfTimeQuery.getTimeStartLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartLessThanOrEqualTo());
        }
        if(rsdfTimeQuery.getTimeStartGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartGreaterThan());
        }
        if(rsdfTimeQuery.getTimeStartGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartGreaterThanOrEqualTo());
        }
        if(rsdfTimeQuery.isTimeStartIsNull()){
            wrapper.lambda().isNull(RsdfTime::getTimeStart);
        }
        if(rsdfTimeQuery.isTimeStartIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTime::getTimeStart);
        }
        if(CollectionUtils.isNotEmpty(rsdfTimeQuery.getTimeStartList())){
            wrapper.lambda().in(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTimeQuery.getTimeStartNotInList())){
            wrapper.lambda().notIn(RsdfTime::getTimeStart,rsdfTimeQuery.getTimeStartNotInList());
        }
            /**
         * 结束时间，为空时为时间点
         */
            if(rsdfTimeQuery.getTimeEnd()!=null){
            wrapper.lambda().eq(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEnd());
        }
        if(rsdfTimeQuery.getTimeEndNotEq()!=null){
            wrapper.lambda().ne(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndNotEq());
        }
        if(rsdfTimeQuery.getTimeEndStart()!=null&&rsdfTimeQuery.getTimeEndEnd()!=null){
            wrapper.lambda().between(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndStart(),rsdfTimeQuery.getTimeEndEnd());
        }
        if(rsdfTimeQuery.getTimeEndLessThan()!=null){
            wrapper.lambda().lt(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndLessThan());
        }
        if(rsdfTimeQuery.getTimeEndLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndLessThanOrEqualTo());
        }
        if(rsdfTimeQuery.getTimeEndGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndGreaterThan());
        }
        if(rsdfTimeQuery.getTimeEndGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndGreaterThanOrEqualTo());
        }
        if(rsdfTimeQuery.isTimeEndIsNull()){
            wrapper.lambda().isNull(RsdfTime::getTimeEnd);
        }
        if(rsdfTimeQuery.isTimeEndIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTime::getTimeEnd);
        }
        if(CollectionUtils.isNotEmpty(rsdfTimeQuery.getTimeEndList())){
            wrapper.lambda().in(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTimeQuery.getTimeEndNotInList())){
            wrapper.lambda().notIn(RsdfTime::getTimeEnd,rsdfTimeQuery.getTimeEndNotInList());
        }
        if(StringUtils.isNotBlank(rsdfTimeQuery.getOrderByColumn())){
            if(rsdfTimeQuery.isAes()){
                wrapper.orderByAsc(rsdfTimeQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfTimeQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}