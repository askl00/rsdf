package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfEntryPropertyQuery;
/**
 * 词条属性表(RsdfEntryProperty)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfEntryPropertyExample {
    public static Wrapper<RsdfEntryProperty> getWrapper(RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
        QueryWrapper<RsdfEntryProperty> wrapper = new QueryWrapper();
                if(rsdfEntryPropertyQuery.getId()!=null){
            wrapper.lambda().eq(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getId());
        }
        if(rsdfEntryPropertyQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdNotEq());
        }
        if(rsdfEntryPropertyQuery.getIdStart()!=null&&rsdfEntryPropertyQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdStart(),rsdfEntryPropertyQuery.getIdEnd());
        }
        if(rsdfEntryPropertyQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdLessThan());
        }
        if(rsdfEntryPropertyQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdGreaterThan());
        }
        if(rsdfEntryPropertyQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfEntryProperty::getId);
        }
        if(rsdfEntryPropertyQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEntryProperty::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getIdList())){
            wrapper.lambda().in(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfEntryProperty::getId,rsdfEntryPropertyQuery.getIdNotInList());
        }
            /**
         * 词条id
         */
            if(rsdfEntryPropertyQuery.getEntryId()!=null){
            wrapper.lambda().eq(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryId());
        }
        if(rsdfEntryPropertyQuery.getEntryIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdNotEq());
        }
        if(rsdfEntryPropertyQuery.getEntryIdStart()!=null&&rsdfEntryPropertyQuery.getEntryIdEnd()!=null){
            wrapper.lambda().between(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdStart(),rsdfEntryPropertyQuery.getEntryIdEnd());
        }
        if(rsdfEntryPropertyQuery.getEntryIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdLessThan());
        }
        if(rsdfEntryPropertyQuery.getEntryIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdLessThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.getEntryIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdGreaterThan());
        }
        if(rsdfEntryPropertyQuery.getEntryIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdGreaterThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.isEntryIdIsNull()){
            wrapper.lambda().isNull(RsdfEntryProperty::getEntryId);
        }
        if(rsdfEntryPropertyQuery.isEntryIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEntryProperty::getEntryId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getEntryIdList())){
            wrapper.lambda().in(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getEntryIdNotInList())){
            wrapper.lambda().notIn(RsdfEntryProperty::getEntryId,rsdfEntryPropertyQuery.getEntryIdNotInList());
        }
            /**
         * 属性id
         */
            if(rsdfEntryPropertyQuery.getPropertyId()!=null){
            wrapper.lambda().eq(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyId());
        }
        if(rsdfEntryPropertyQuery.getPropertyIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdNotEq());
        }
        if(rsdfEntryPropertyQuery.getPropertyIdStart()!=null&&rsdfEntryPropertyQuery.getPropertyIdEnd()!=null){
            wrapper.lambda().between(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdStart(),rsdfEntryPropertyQuery.getPropertyIdEnd());
        }
        if(rsdfEntryPropertyQuery.getPropertyIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdLessThan());
        }
        if(rsdfEntryPropertyQuery.getPropertyIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdLessThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.getPropertyIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdGreaterThan());
        }
        if(rsdfEntryPropertyQuery.getPropertyIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdGreaterThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.isPropertyIdIsNull()){
            wrapper.lambda().isNull(RsdfEntryProperty::getPropertyId);
        }
        if(rsdfEntryPropertyQuery.isPropertyIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEntryProperty::getPropertyId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getPropertyIdList())){
            wrapper.lambda().in(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getPropertyIdNotInList())){
            wrapper.lambda().notIn(RsdfEntryProperty::getPropertyId,rsdfEntryPropertyQuery.getPropertyIdNotInList());
        }
            /**
         * 概率
         */
            if(rsdfEntryPropertyQuery.getProperty()!=null){
            wrapper.lambda().eq(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getProperty());
        }
        if(rsdfEntryPropertyQuery.getPropertyNotEq()!=null){
            wrapper.lambda().ne(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyNotEq());
        }
        if(rsdfEntryPropertyQuery.getPropertyStart()!=null&&rsdfEntryPropertyQuery.getPropertyEnd()!=null){
            wrapper.lambda().between(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyStart(),rsdfEntryPropertyQuery.getPropertyEnd());
        }
        if(rsdfEntryPropertyQuery.getPropertyLessThan()!=null){
            wrapper.lambda().lt(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyLessThan());
        }
        if(rsdfEntryPropertyQuery.getPropertyLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyLessThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.getPropertyGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyGreaterThan());
        }
        if(rsdfEntryPropertyQuery.getPropertyGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyGreaterThanOrEqualTo());
        }
        if(rsdfEntryPropertyQuery.isPropertyIsNull()){
            wrapper.lambda().isNull(RsdfEntryProperty::getProperty);
        }
        if(rsdfEntryPropertyQuery.isPropertyIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEntryProperty::getProperty);
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getPropertyList())){
            wrapper.lambda().in(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryPropertyQuery.getPropertyNotInList())){
            wrapper.lambda().notIn(RsdfEntryProperty::getProperty,rsdfEntryPropertyQuery.getPropertyNotInList());
        }
        if(StringUtils.isNotBlank(rsdfEntryPropertyQuery.getOrderByColumn())){
            if(rsdfEntryPropertyQuery.isAes()){
                wrapper.orderByAsc(rsdfEntryPropertyQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfEntryPropertyQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}