package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfPropertyQuery;
/**
 * 属性表(RsdfProperty)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public class RsdfPropertyExample {
    public static Wrapper<RsdfProperty> getWrapper(RsdfPropertyQuery rsdfPropertyQuery){
        QueryWrapper<RsdfProperty> wrapper = new QueryWrapper();
                if(rsdfPropertyQuery.getId()!=null){
            wrapper.lambda().eq(RsdfProperty::getId,rsdfPropertyQuery.getId());
        }
        if(rsdfPropertyQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfProperty::getId,rsdfPropertyQuery.getIdNotEq());
        }
        if(rsdfPropertyQuery.getIdStart()!=null&&rsdfPropertyQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfProperty::getId,rsdfPropertyQuery.getIdStart(),rsdfPropertyQuery.getIdEnd());
        }
        if(rsdfPropertyQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfProperty::getId,rsdfPropertyQuery.getIdLessThan());
        }
        if(rsdfPropertyQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfProperty::getId,rsdfPropertyQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfPropertyQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfProperty::getId,rsdfPropertyQuery.getIdGreaterThan());
        }
        if(rsdfPropertyQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfProperty::getId,rsdfPropertyQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfPropertyQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfProperty::getId);
        }
        if(rsdfPropertyQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfProperty::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfPropertyQuery.getIdList())){
            wrapper.lambda().in(RsdfProperty::getId,rsdfPropertyQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfPropertyQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfProperty::getId,rsdfPropertyQuery.getIdNotInList());
        }
            /**
         * 名称
         */
            if(StringUtils.isNotBlank(rsdfPropertyQuery.getName())){
            wrapper.lambda().eq(RsdfProperty::getName,rsdfPropertyQuery.getName());
        }
        if(StringUtils.isNotBlank(rsdfPropertyQuery.getNameNotEq())){
            wrapper.lambda().ne(RsdfProperty::getName,rsdfPropertyQuery.getNameNotEq());
        }
        if(StringUtils.isNotBlank(rsdfPropertyQuery.getNameLike())){
            wrapper.lambda().like(RsdfProperty::getName,"%"+rsdfPropertyQuery.getNameLike()+"%");
        }
        if(StringUtils.isNotBlank(rsdfPropertyQuery.getNameLikeLeft())){
            wrapper.lambda().likeLeft(RsdfProperty::getName,"%"+rsdfPropertyQuery.getNameLikeLeft());
        }
        if(StringUtils.isNotBlank(rsdfPropertyQuery.getNameLikeRight())){
            wrapper.lambda().likeRight(RsdfProperty::getName,rsdfPropertyQuery.getNameLikeRight()+"%");
        }
        if(rsdfPropertyQuery.isNameIsNull()){
            wrapper.lambda().isNull(RsdfProperty::getName);
        }
        if(rsdfPropertyQuery.isNameIsNotNull()){
            wrapper.lambda().isNotNull(RsdfProperty::getName);
        }
        if(CollectionUtils.isNotEmpty(rsdfPropertyQuery.getNameList())){
            wrapper.lambda().in(RsdfProperty::getName,rsdfPropertyQuery.getNameList());
        }
        if(CollectionUtils.isNotEmpty(rsdfPropertyQuery.getNameNotInList())){
            wrapper.lambda().notIn(RsdfProperty::getName,rsdfPropertyQuery.getNameNotInList());
        }
        if(StringUtils.isNotBlank(rsdfPropertyQuery.getOrderByColumn())){
            if(rsdfPropertyQuery.isAes()){
                wrapper.orderByAsc(rsdfPropertyQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfPropertyQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}