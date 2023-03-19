package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfEventProbabilityQuery;
/**
 * 事件概率表(RsdfEventProbability)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfEventProbabilityExample {
    public static Wrapper<RsdfEventProbability> getWrapper(RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
        QueryWrapper<RsdfEventProbability> wrapper = new QueryWrapper();
                if(rsdfEventProbabilityQuery.getId()!=null){
            wrapper.lambda().eq(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getId());
        }
        if(rsdfEventProbabilityQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdNotEq());
        }
        if(rsdfEventProbabilityQuery.getIdStart()!=null&&rsdfEventProbabilityQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdStart(),rsdfEventProbabilityQuery.getIdEnd());
        }
        if(rsdfEventProbabilityQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdLessThan());
        }
        if(rsdfEventProbabilityQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfEventProbabilityQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdGreaterThan());
        }
        if(rsdfEventProbabilityQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfEventProbabilityQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfEventProbability::getId);
        }
        if(rsdfEventProbabilityQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventProbability::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventProbabilityQuery.getIdList())){
            wrapper.lambda().in(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventProbabilityQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfEventProbability::getId,rsdfEventProbabilityQuery.getIdNotInList());
        }
            /**
         * 事件id
         */
            if(rsdfEventProbabilityQuery.getEventId()!=null){
            wrapper.lambda().eq(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventId());
        }
        if(rsdfEventProbabilityQuery.getEventIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdNotEq());
        }
        if(rsdfEventProbabilityQuery.getEventIdStart()!=null&&rsdfEventProbabilityQuery.getEventIdEnd()!=null){
            wrapper.lambda().between(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdStart(),rsdfEventProbabilityQuery.getEventIdEnd());
        }
        if(rsdfEventProbabilityQuery.getEventIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdLessThan());
        }
        if(rsdfEventProbabilityQuery.getEventIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdLessThanOrEqualTo());
        }
        if(rsdfEventProbabilityQuery.getEventIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdGreaterThan());
        }
        if(rsdfEventProbabilityQuery.getEventIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdGreaterThanOrEqualTo());
        }
        if(rsdfEventProbabilityQuery.isEventIdIsNull()){
            wrapper.lambda().isNull(RsdfEventProbability::getEventId);
        }
        if(rsdfEventProbabilityQuery.isEventIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventProbability::getEventId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventProbabilityQuery.getEventIdList())){
            wrapper.lambda().in(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventProbabilityQuery.getEventIdNotInList())){
            wrapper.lambda().notIn(RsdfEventProbability::getEventId,rsdfEventProbabilityQuery.getEventIdNotInList());
        }
            /**
         * 概率
         */
            if(rsdfEventProbabilityQuery.getProbability()!=null){
            wrapper.lambda().eq(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbability());
        }
        if(rsdfEventProbabilityQuery.getProbabilityNotEq()!=null){
            wrapper.lambda().ne(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityNotEq());
        }
        if(rsdfEventProbabilityQuery.getProbabilityStart()!=null&&rsdfEventProbabilityQuery.getProbabilityEnd()!=null){
            wrapper.lambda().between(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityStart(),rsdfEventProbabilityQuery.getProbabilityEnd());
        }
        if(rsdfEventProbabilityQuery.getProbabilityLessThan()!=null){
            wrapper.lambda().lt(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityLessThan());
        }
        if(rsdfEventProbabilityQuery.getProbabilityLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityLessThanOrEqualTo());
        }
        if(rsdfEventProbabilityQuery.getProbabilityGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityGreaterThan());
        }
        if(rsdfEventProbabilityQuery.getProbabilityGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityGreaterThanOrEqualTo());
        }
        if(rsdfEventProbabilityQuery.isProbabilityIsNull()){
            wrapper.lambda().isNull(RsdfEventProbability::getProbability);
        }
        if(rsdfEventProbabilityQuery.isProbabilityIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventProbability::getProbability);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventProbabilityQuery.getProbabilityList())){
            wrapper.lambda().in(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventProbabilityQuery.getProbabilityNotInList())){
            wrapper.lambda().notIn(RsdfEventProbability::getProbability,rsdfEventProbabilityQuery.getProbabilityNotInList());
        }
        if(StringUtils.isNotBlank(rsdfEventProbabilityQuery.getOrderByColumn())){
            if(rsdfEventProbabilityQuery.isAes()){
                wrapper.orderByAsc(rsdfEventProbabilityQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfEventProbabilityQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}