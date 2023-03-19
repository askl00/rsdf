package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfTargetPropertyQuery;
/**
 * 目标-所需属性表(RsdfTargetProperty)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public class RsdfTargetPropertyExample {
    public static Wrapper<RsdfTargetProperty> getWrapper(RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
        QueryWrapper<RsdfTargetProperty> wrapper = new QueryWrapper();
                if(rsdfTargetPropertyQuery.getId()!=null){
            wrapper.lambda().eq(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getId());
        }
        if(rsdfTargetPropertyQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdNotEq());
        }
        if(rsdfTargetPropertyQuery.getIdStart()!=null&&rsdfTargetPropertyQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdStart(),rsdfTargetPropertyQuery.getIdEnd());
        }
        if(rsdfTargetPropertyQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdLessThan());
        }
        if(rsdfTargetPropertyQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdGreaterThan());
        }
        if(rsdfTargetPropertyQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfTargetProperty::getId);
        }
        if(rsdfTargetPropertyQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTargetProperty::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getIdList())){
            wrapper.lambda().in(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfTargetProperty::getId,rsdfTargetPropertyQuery.getIdNotInList());
        }
            /**
         * 目标id
         */
            if(rsdfTargetPropertyQuery.getTargetId()!=null){
            wrapper.lambda().eq(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetId());
        }
        if(rsdfTargetPropertyQuery.getTargetIdNotEq()!=null){
            wrapper.lambda().ne(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdNotEq());
        }
        if(rsdfTargetPropertyQuery.getTargetIdStart()!=null&&rsdfTargetPropertyQuery.getTargetIdEnd()!=null){
            wrapper.lambda().between(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdStart(),rsdfTargetPropertyQuery.getTargetIdEnd());
        }
        if(rsdfTargetPropertyQuery.getTargetIdLessThan()!=null){
            wrapper.lambda().lt(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdLessThan());
        }
        if(rsdfTargetPropertyQuery.getTargetIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdLessThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.getTargetIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdGreaterThan());
        }
        if(rsdfTargetPropertyQuery.getTargetIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdGreaterThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.isTargetIdIsNull()){
            wrapper.lambda().isNull(RsdfTargetProperty::getTargetId);
        }
        if(rsdfTargetPropertyQuery.isTargetIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTargetProperty::getTargetId);
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getTargetIdList())){
            wrapper.lambda().in(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getTargetIdNotInList())){
            wrapper.lambda().notIn(RsdfTargetProperty::getTargetId,rsdfTargetPropertyQuery.getTargetIdNotInList());
        }
            /**
         * 属性id
         */
            if(rsdfTargetPropertyQuery.getPropertyId()!=null){
            wrapper.lambda().eq(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyId());
        }
        if(rsdfTargetPropertyQuery.getPropertyIdNotEq()!=null){
            wrapper.lambda().ne(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdNotEq());
        }
        if(rsdfTargetPropertyQuery.getPropertyIdStart()!=null&&rsdfTargetPropertyQuery.getPropertyIdEnd()!=null){
            wrapper.lambda().between(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdStart(),rsdfTargetPropertyQuery.getPropertyIdEnd());
        }
        if(rsdfTargetPropertyQuery.getPropertyIdLessThan()!=null){
            wrapper.lambda().lt(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdLessThan());
        }
        if(rsdfTargetPropertyQuery.getPropertyIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdLessThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.getPropertyIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdGreaterThan());
        }
        if(rsdfTargetPropertyQuery.getPropertyIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdGreaterThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.isPropertyIdIsNull()){
            wrapper.lambda().isNull(RsdfTargetProperty::getPropertyId);
        }
        if(rsdfTargetPropertyQuery.isPropertyIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTargetProperty::getPropertyId);
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getPropertyIdList())){
            wrapper.lambda().in(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getPropertyIdNotInList())){
            wrapper.lambda().notIn(RsdfTargetProperty::getPropertyId,rsdfTargetPropertyQuery.getPropertyIdNotInList());
        }
            /**
         * 属性值
         */
            if(rsdfTargetPropertyQuery.getPropertyValue()!=null){
            wrapper.lambda().eq(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValue());
        }
        if(rsdfTargetPropertyQuery.getPropertyValueNotEq()!=null){
            wrapper.lambda().ne(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueNotEq());
        }
        if(rsdfTargetPropertyQuery.getPropertyValueStart()!=null&&rsdfTargetPropertyQuery.getPropertyValueEnd()!=null){
            wrapper.lambda().between(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueStart(),rsdfTargetPropertyQuery.getPropertyValueEnd());
        }
        if(rsdfTargetPropertyQuery.getPropertyValueLessThan()!=null){
            wrapper.lambda().lt(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueLessThan());
        }
        if(rsdfTargetPropertyQuery.getPropertyValueLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueLessThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.getPropertyValueGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueGreaterThan());
        }
        if(rsdfTargetPropertyQuery.getPropertyValueGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueGreaterThanOrEqualTo());
        }
        if(rsdfTargetPropertyQuery.isPropertyValueIsNull()){
            wrapper.lambda().isNull(RsdfTargetProperty::getPropertyValue);
        }
        if(rsdfTargetPropertyQuery.isPropertyValueIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTargetProperty::getPropertyValue);
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getPropertyValueList())){
            wrapper.lambda().in(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetPropertyQuery.getPropertyValueNotInList())){
            wrapper.lambda().notIn(RsdfTargetProperty::getPropertyValue,rsdfTargetPropertyQuery.getPropertyValueNotInList());
        }
        if(StringUtils.isNotBlank(rsdfTargetPropertyQuery.getOrderByColumn())){
            if(rsdfTargetPropertyQuery.isAes()){
                wrapper.orderByAsc(rsdfTargetPropertyQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfTargetPropertyQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}