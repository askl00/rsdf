package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfEventTargetProbabilityQuery;
/**
 * 事件-目标概率表(RsdfEventTargetProbability)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfEventTargetProbabilityExample {
    public static Wrapper<RsdfEventTargetProbability> getWrapper(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
        QueryWrapper<RsdfEventTargetProbability> wrapper = new QueryWrapper();
                if(rsdfEventTargetProbabilityQuery.getId()!=null){
            wrapper.lambda().eq(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getId());
        }
        if(rsdfEventTargetProbabilityQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdNotEq());
        }
        if(rsdfEventTargetProbabilityQuery.getIdStart()!=null&&rsdfEventTargetProbabilityQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdStart(),rsdfEventTargetProbabilityQuery.getIdEnd());
        }
        if(rsdfEventTargetProbabilityQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdLessThan());
        }
        if(rsdfEventTargetProbabilityQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdGreaterThan());
        }
        if(rsdfEventTargetProbabilityQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfEventTargetProbability::getId);
        }
        if(rsdfEventTargetProbabilityQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventTargetProbability::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getIdList())){
            wrapper.lambda().in(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfEventTargetProbability::getId,rsdfEventTargetProbabilityQuery.getIdNotInList());
        }
            /**
         * 事件id
         */
            if(rsdfEventTargetProbabilityQuery.getEventId()!=null){
            wrapper.lambda().eq(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventId());
        }
        if(rsdfEventTargetProbabilityQuery.getEventIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdNotEq());
        }
        if(rsdfEventTargetProbabilityQuery.getEventIdStart()!=null&&rsdfEventTargetProbabilityQuery.getEventIdEnd()!=null){
            wrapper.lambda().between(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdStart(),rsdfEventTargetProbabilityQuery.getEventIdEnd());
        }
        if(rsdfEventTargetProbabilityQuery.getEventIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdLessThan());
        }
        if(rsdfEventTargetProbabilityQuery.getEventIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdLessThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.getEventIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdGreaterThan());
        }
        if(rsdfEventTargetProbabilityQuery.getEventIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdGreaterThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.isEventIdIsNull()){
            wrapper.lambda().isNull(RsdfEventTargetProbability::getEventId);
        }
        if(rsdfEventTargetProbabilityQuery.isEventIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventTargetProbability::getEventId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getEventIdList())){
            wrapper.lambda().in(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getEventIdNotInList())){
            wrapper.lambda().notIn(RsdfEventTargetProbability::getEventId,rsdfEventTargetProbabilityQuery.getEventIdNotInList());
        }
            /**
         * 目标id
         */
            if(rsdfEventTargetProbabilityQuery.getTargetId()!=null){
            wrapper.lambda().eq(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetId());
        }
        if(rsdfEventTargetProbabilityQuery.getTargetIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdNotEq());
        }
        if(rsdfEventTargetProbabilityQuery.getTargetIdStart()!=null&&rsdfEventTargetProbabilityQuery.getTargetIdEnd()!=null){
            wrapper.lambda().between(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdStart(),rsdfEventTargetProbabilityQuery.getTargetIdEnd());
        }
        if(rsdfEventTargetProbabilityQuery.getTargetIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdLessThan());
        }
        if(rsdfEventTargetProbabilityQuery.getTargetIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdLessThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.getTargetIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdGreaterThan());
        }
        if(rsdfEventTargetProbabilityQuery.getTargetIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdGreaterThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.isTargetIdIsNull()){
            wrapper.lambda().isNull(RsdfEventTargetProbability::getTargetId);
        }
        if(rsdfEventTargetProbabilityQuery.isTargetIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventTargetProbability::getTargetId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getTargetIdList())){
            wrapper.lambda().in(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getTargetIdNotInList())){
            wrapper.lambda().notIn(RsdfEventTargetProbability::getTargetId,rsdfEventTargetProbabilityQuery.getTargetIdNotInList());
        }
            /**
         * 概率
         */
            if(rsdfEventTargetProbabilityQuery.getProbability()!=null){
            wrapper.lambda().eq(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbability());
        }
        if(rsdfEventTargetProbabilityQuery.getProbabilityNotEq()!=null){
            wrapper.lambda().ne(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityNotEq());
        }
        if(rsdfEventTargetProbabilityQuery.getProbabilityStart()!=null&&rsdfEventTargetProbabilityQuery.getProbabilityEnd()!=null){
            wrapper.lambda().between(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityStart(),rsdfEventTargetProbabilityQuery.getProbabilityEnd());
        }
        if(rsdfEventTargetProbabilityQuery.getProbabilityLessThan()!=null){
            wrapper.lambda().lt(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityLessThan());
        }
        if(rsdfEventTargetProbabilityQuery.getProbabilityLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityLessThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.getProbabilityGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityGreaterThan());
        }
        if(rsdfEventTargetProbabilityQuery.getProbabilityGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityGreaterThanOrEqualTo());
        }
        if(rsdfEventTargetProbabilityQuery.isProbabilityIsNull()){
            wrapper.lambda().isNull(RsdfEventTargetProbability::getProbability);
        }
        if(rsdfEventTargetProbabilityQuery.isProbabilityIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventTargetProbability::getProbability);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getProbabilityList())){
            wrapper.lambda().in(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventTargetProbabilityQuery.getProbabilityNotInList())){
            wrapper.lambda().notIn(RsdfEventTargetProbability::getProbability,rsdfEventTargetProbabilityQuery.getProbabilityNotInList());
        }
        if(StringUtils.isNotBlank(rsdfEventTargetProbabilityQuery.getOrderByColumn())){
            if(rsdfEventTargetProbabilityQuery.isAes()){
                wrapper.orderByAsc(rsdfEventTargetProbabilityQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfEventTargetProbabilityQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}