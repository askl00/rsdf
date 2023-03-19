package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfUserPropertyQuery;
/**
 * 人物属性表(RsdfUserProperty)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public class RsdfUserPropertyExample {
    public static Wrapper<RsdfUserProperty> getWrapper(RsdfUserPropertyQuery rsdfUserPropertyQuery){
        QueryWrapper<RsdfUserProperty> wrapper = new QueryWrapper();
                if(rsdfUserPropertyQuery.getId()!=null){
            wrapper.lambda().eq(RsdfUserProperty::getId,rsdfUserPropertyQuery.getId());
        }
        if(rsdfUserPropertyQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdNotEq());
        }
        if(rsdfUserPropertyQuery.getIdStart()!=null&&rsdfUserPropertyQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdStart(),rsdfUserPropertyQuery.getIdEnd());
        }
        if(rsdfUserPropertyQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdLessThan());
        }
        if(rsdfUserPropertyQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdGreaterThan());
        }
        if(rsdfUserPropertyQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfUserProperty::getId);
        }
        if(rsdfUserPropertyQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfUserProperty::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getIdList())){
            wrapper.lambda().in(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfUserProperty::getId,rsdfUserPropertyQuery.getIdNotInList());
        }
            /**
         * 用户id
         */
            if(rsdfUserPropertyQuery.getUserId()!=null){
            wrapper.lambda().eq(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserId());
        }
        if(rsdfUserPropertyQuery.getUserIdNotEq()!=null){
            wrapper.lambda().ne(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdNotEq());
        }
        if(rsdfUserPropertyQuery.getUserIdStart()!=null&&rsdfUserPropertyQuery.getUserIdEnd()!=null){
            wrapper.lambda().between(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdStart(),rsdfUserPropertyQuery.getUserIdEnd());
        }
        if(rsdfUserPropertyQuery.getUserIdLessThan()!=null){
            wrapper.lambda().lt(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdLessThan());
        }
        if(rsdfUserPropertyQuery.getUserIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdLessThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.getUserIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdGreaterThan());
        }
        if(rsdfUserPropertyQuery.getUserIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdGreaterThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.isUserIdIsNull()){
            wrapper.lambda().isNull(RsdfUserProperty::getUserId);
        }
        if(rsdfUserPropertyQuery.isUserIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfUserProperty::getUserId);
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getUserIdList())){
            wrapper.lambda().in(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getUserIdNotInList())){
            wrapper.lambda().notIn(RsdfUserProperty::getUserId,rsdfUserPropertyQuery.getUserIdNotInList());
        }
            /**
         * 属性id
         */
            if(rsdfUserPropertyQuery.getPropertyId()!=null){
            wrapper.lambda().eq(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyId());
        }
        if(rsdfUserPropertyQuery.getPropertyIdNotEq()!=null){
            wrapper.lambda().ne(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdNotEq());
        }
        if(rsdfUserPropertyQuery.getPropertyIdStart()!=null&&rsdfUserPropertyQuery.getPropertyIdEnd()!=null){
            wrapper.lambda().between(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdStart(),rsdfUserPropertyQuery.getPropertyIdEnd());
        }
        if(rsdfUserPropertyQuery.getPropertyIdLessThan()!=null){
            wrapper.lambda().lt(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdLessThan());
        }
        if(rsdfUserPropertyQuery.getPropertyIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdLessThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.getPropertyIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdGreaterThan());
        }
        if(rsdfUserPropertyQuery.getPropertyIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdGreaterThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.isPropertyIdIsNull()){
            wrapper.lambda().isNull(RsdfUserProperty::getPropertyId);
        }
        if(rsdfUserPropertyQuery.isPropertyIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfUserProperty::getPropertyId);
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getPropertyIdList())){
            wrapper.lambda().in(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getPropertyIdNotInList())){
            wrapper.lambda().notIn(RsdfUserProperty::getPropertyId,rsdfUserPropertyQuery.getPropertyIdNotInList());
        }
            /**
         * 属性值
         */
            if(rsdfUserPropertyQuery.getValue()!=null){
            wrapper.lambda().eq(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValue());
        }
        if(rsdfUserPropertyQuery.getValueNotEq()!=null){
            wrapper.lambda().ne(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueNotEq());
        }
        if(rsdfUserPropertyQuery.getValueStart()!=null&&rsdfUserPropertyQuery.getValueEnd()!=null){
            wrapper.lambda().between(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueStart(),rsdfUserPropertyQuery.getValueEnd());
        }
        if(rsdfUserPropertyQuery.getValueLessThan()!=null){
            wrapper.lambda().lt(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueLessThan());
        }
        if(rsdfUserPropertyQuery.getValueLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueLessThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.getValueGreaterThan()!=null){
            wrapper.lambda().gt(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueGreaterThan());
        }
        if(rsdfUserPropertyQuery.getValueGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueGreaterThanOrEqualTo());
        }
        if(rsdfUserPropertyQuery.isValueIsNull()){
            wrapper.lambda().isNull(RsdfUserProperty::getValue);
        }
        if(rsdfUserPropertyQuery.isValueIsNotNull()){
            wrapper.lambda().isNotNull(RsdfUserProperty::getValue);
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getValueList())){
            wrapper.lambda().in(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueList());
        }
        if(CollectionUtils.isNotEmpty(rsdfUserPropertyQuery.getValueNotInList())){
            wrapper.lambda().notIn(RsdfUserProperty::getValue,rsdfUserPropertyQuery.getValueNotInList());
        }
        if(StringUtils.isNotBlank(rsdfUserPropertyQuery.getOrderByColumn())){
            if(rsdfUserPropertyQuery.isAes()){
                wrapper.orderByAsc(rsdfUserPropertyQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfUserPropertyQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}