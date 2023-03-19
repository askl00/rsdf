package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfGameTargetQuery;
/**
 * 游戏目标表(RsdfGameTarget)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public class RsdfGameTargetExample {
    public static Wrapper<RsdfGameTarget> getWrapper(RsdfGameTargetQuery rsdfGameTargetQuery){
        QueryWrapper<RsdfGameTarget> wrapper = new QueryWrapper();
                if(rsdfGameTargetQuery.getId()!=null){
            wrapper.lambda().eq(RsdfGameTarget::getId,rsdfGameTargetQuery.getId());
        }
        if(rsdfGameTargetQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdNotEq());
        }
        if(rsdfGameTargetQuery.getIdStart()!=null&&rsdfGameTargetQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdStart(),rsdfGameTargetQuery.getIdEnd());
        }
        if(rsdfGameTargetQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdLessThan());
        }
        if(rsdfGameTargetQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfGameTargetQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdGreaterThan());
        }
        if(rsdfGameTargetQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfGameTargetQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfGameTarget::getId);
        }
        if(rsdfGameTargetQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameTarget::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameTargetQuery.getIdList())){
            wrapper.lambda().in(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameTargetQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfGameTarget::getId,rsdfGameTargetQuery.getIdNotInList());
        }
            /**
         * 游戏id
         */
            if(rsdfGameTargetQuery.getGameId()!=null){
            wrapper.lambda().eq(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameId());
        }
        if(rsdfGameTargetQuery.getGameIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdNotEq());
        }
        if(rsdfGameTargetQuery.getGameIdStart()!=null&&rsdfGameTargetQuery.getGameIdEnd()!=null){
            wrapper.lambda().between(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdStart(),rsdfGameTargetQuery.getGameIdEnd());
        }
        if(rsdfGameTargetQuery.getGameIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdLessThan());
        }
        if(rsdfGameTargetQuery.getGameIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdLessThanOrEqualTo());
        }
        if(rsdfGameTargetQuery.getGameIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdGreaterThan());
        }
        if(rsdfGameTargetQuery.getGameIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdGreaterThanOrEqualTo());
        }
        if(rsdfGameTargetQuery.isGameIdIsNull()){
            wrapper.lambda().isNull(RsdfGameTarget::getGameId);
        }
        if(rsdfGameTargetQuery.isGameIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameTarget::getGameId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameTargetQuery.getGameIdList())){
            wrapper.lambda().in(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameTargetQuery.getGameIdNotInList())){
            wrapper.lambda().notIn(RsdfGameTarget::getGameId,rsdfGameTargetQuery.getGameIdNotInList());
        }
            /**
         * 目标id
         */
            if(rsdfGameTargetQuery.getTargetId()!=null){
            wrapper.lambda().eq(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetId());
        }
        if(rsdfGameTargetQuery.getTargetIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdNotEq());
        }
        if(rsdfGameTargetQuery.getTargetIdStart()!=null&&rsdfGameTargetQuery.getTargetIdEnd()!=null){
            wrapper.lambda().between(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdStart(),rsdfGameTargetQuery.getTargetIdEnd());
        }
        if(rsdfGameTargetQuery.getTargetIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdLessThan());
        }
        if(rsdfGameTargetQuery.getTargetIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdLessThanOrEqualTo());
        }
        if(rsdfGameTargetQuery.getTargetIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdGreaterThan());
        }
        if(rsdfGameTargetQuery.getTargetIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdGreaterThanOrEqualTo());
        }
        if(rsdfGameTargetQuery.isTargetIdIsNull()){
            wrapper.lambda().isNull(RsdfGameTarget::getTargetId);
        }
        if(rsdfGameTargetQuery.isTargetIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameTarget::getTargetId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameTargetQuery.getTargetIdList())){
            wrapper.lambda().in(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameTargetQuery.getTargetIdNotInList())){
            wrapper.lambda().notIn(RsdfGameTarget::getTargetId,rsdfGameTargetQuery.getTargetIdNotInList());
        }
        if(StringUtils.isNotBlank(rsdfGameTargetQuery.getOrderByColumn())){
            if(rsdfGameTargetQuery.isAes()){
                wrapper.orderByAsc(rsdfGameTargetQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfGameTargetQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}