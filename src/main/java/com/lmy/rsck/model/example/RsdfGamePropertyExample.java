package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfGamePropertyQuery;
/**
 * 游戏人物属性表(RsdfGameProperty)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfGamePropertyExample {
    public static Wrapper<RsdfGameProperty> getWrapper(RsdfGamePropertyQuery rsdfGamePropertyQuery){
        QueryWrapper<RsdfGameProperty> wrapper = new QueryWrapper();
                if(rsdfGamePropertyQuery.getId()!=null){
            wrapper.lambda().eq(RsdfGameProperty::getId,rsdfGamePropertyQuery.getId());
        }
        if(rsdfGamePropertyQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdNotEq());
        }
        if(rsdfGamePropertyQuery.getIdStart()!=null&&rsdfGamePropertyQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdStart(),rsdfGamePropertyQuery.getIdEnd());
        }
        if(rsdfGamePropertyQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdLessThan());
        }
        if(rsdfGamePropertyQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdGreaterThan());
        }
        if(rsdfGamePropertyQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfGameProperty::getId);
        }
        if(rsdfGamePropertyQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameProperty::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getIdList())){
            wrapper.lambda().in(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfGameProperty::getId,rsdfGamePropertyQuery.getIdNotInList());
        }
            /**
         * 游戏id
         */
            if(rsdfGamePropertyQuery.getGameId()!=null){
            wrapper.lambda().eq(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameId());
        }
        if(rsdfGamePropertyQuery.getGameIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdNotEq());
        }
        if(rsdfGamePropertyQuery.getGameIdStart()!=null&&rsdfGamePropertyQuery.getGameIdEnd()!=null){
            wrapper.lambda().between(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdStart(),rsdfGamePropertyQuery.getGameIdEnd());
        }
        if(rsdfGamePropertyQuery.getGameIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdLessThan());
        }
        if(rsdfGamePropertyQuery.getGameIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdLessThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.getGameIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdGreaterThan());
        }
        if(rsdfGamePropertyQuery.getGameIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdGreaterThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.isGameIdIsNull()){
            wrapper.lambda().isNull(RsdfGameProperty::getGameId);
        }
        if(rsdfGamePropertyQuery.isGameIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameProperty::getGameId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getGameIdList())){
            wrapper.lambda().in(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getGameIdNotInList())){
            wrapper.lambda().notIn(RsdfGameProperty::getGameId,rsdfGamePropertyQuery.getGameIdNotInList());
        }
            /**
         * 游戏id
         */
            if(rsdfGamePropertyQuery.getPropertyId()!=null){
            wrapper.lambda().eq(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyId());
        }
        if(rsdfGamePropertyQuery.getPropertyIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdNotEq());
        }
        if(rsdfGamePropertyQuery.getPropertyIdStart()!=null&&rsdfGamePropertyQuery.getPropertyIdEnd()!=null){
            wrapper.lambda().between(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdStart(),rsdfGamePropertyQuery.getPropertyIdEnd());
        }
        if(rsdfGamePropertyQuery.getPropertyIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdLessThan());
        }
        if(rsdfGamePropertyQuery.getPropertyIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdLessThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.getPropertyIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdGreaterThan());
        }
        if(rsdfGamePropertyQuery.getPropertyIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdGreaterThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.isPropertyIdIsNull()){
            wrapper.lambda().isNull(RsdfGameProperty::getPropertyId);
        }
        if(rsdfGamePropertyQuery.isPropertyIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameProperty::getPropertyId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getPropertyIdList())){
            wrapper.lambda().in(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getPropertyIdNotInList())){
            wrapper.lambda().notIn(RsdfGameProperty::getPropertyId,rsdfGamePropertyQuery.getPropertyIdNotInList());
        }
            /**
         * 属性值
         */
            if(rsdfGamePropertyQuery.getValue()!=null){
            wrapper.lambda().eq(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValue());
        }
        if(rsdfGamePropertyQuery.getValueNotEq()!=null){
            wrapper.lambda().ne(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueNotEq());
        }
        if(rsdfGamePropertyQuery.getValueStart()!=null&&rsdfGamePropertyQuery.getValueEnd()!=null){
            wrapper.lambda().between(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueStart(),rsdfGamePropertyQuery.getValueEnd());
        }
        if(rsdfGamePropertyQuery.getValueLessThan()!=null){
            wrapper.lambda().lt(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueLessThan());
        }
        if(rsdfGamePropertyQuery.getValueLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueLessThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.getValueGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueGreaterThan());
        }
        if(rsdfGamePropertyQuery.getValueGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueGreaterThanOrEqualTo());
        }
        if(rsdfGamePropertyQuery.isValueIsNull()){
            wrapper.lambda().isNull(RsdfGameProperty::getValue);
        }
        if(rsdfGamePropertyQuery.isValueIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameProperty::getValue);
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getValueList())){
            wrapper.lambda().in(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGamePropertyQuery.getValueNotInList())){
            wrapper.lambda().notIn(RsdfGameProperty::getValue,rsdfGamePropertyQuery.getValueNotInList());
        }
        if(StringUtils.isNotBlank(rsdfGamePropertyQuery.getOrderByColumn())){
            if(rsdfGamePropertyQuery.isAes()){
                wrapper.orderByAsc(rsdfGamePropertyQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfGamePropertyQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}