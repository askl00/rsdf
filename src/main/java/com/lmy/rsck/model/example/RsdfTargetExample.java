package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfTargetQuery;
/**
 * 目标表(RsdfTarget)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public class RsdfTargetExample {
    public static Wrapper<RsdfTarget> getWrapper(RsdfTargetQuery rsdfTargetQuery){
        QueryWrapper<RsdfTarget> wrapper = new QueryWrapper();
                if(rsdfTargetQuery.getId()!=null){
            wrapper.lambda().eq(RsdfTarget::getId,rsdfTargetQuery.getId());
        }
        if(rsdfTargetQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfTarget::getId,rsdfTargetQuery.getIdNotEq());
        }
        if(rsdfTargetQuery.getIdStart()!=null&&rsdfTargetQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfTarget::getId,rsdfTargetQuery.getIdStart(),rsdfTargetQuery.getIdEnd());
        }
        if(rsdfTargetQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfTarget::getId,rsdfTargetQuery.getIdLessThan());
        }
        if(rsdfTargetQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfTarget::getId,rsdfTargetQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfTargetQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfTarget::getId,rsdfTargetQuery.getIdGreaterThan());
        }
        if(rsdfTargetQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfTarget::getId,rsdfTargetQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfTargetQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfTarget::getId);
        }
        if(rsdfTargetQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTarget::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetQuery.getIdList())){
            wrapper.lambda().in(RsdfTarget::getId,rsdfTargetQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfTarget::getId,rsdfTargetQuery.getIdNotInList());
        }
            /**
         * 名称
         */
            if(StringUtils.isNotBlank(rsdfTargetQuery.getName())){
            wrapper.lambda().eq(RsdfTarget::getName,rsdfTargetQuery.getName());
        }
        if(StringUtils.isNotBlank(rsdfTargetQuery.getNameNotEq())){
            wrapper.lambda().ne(RsdfTarget::getName,rsdfTargetQuery.getNameNotEq());
        }
        if(StringUtils.isNotBlank(rsdfTargetQuery.getNameLike())){
            wrapper.lambda().like(RsdfTarget::getName,"%"+rsdfTargetQuery.getNameLike()+"%");
        }
        if(StringUtils.isNotBlank(rsdfTargetQuery.getNameLikeLeft())){
            wrapper.lambda().likeLeft(RsdfTarget::getName,"%"+rsdfTargetQuery.getNameLikeLeft());
        }
        if(StringUtils.isNotBlank(rsdfTargetQuery.getNameLikeRight())){
            wrapper.lambda().likeRight(RsdfTarget::getName,rsdfTargetQuery.getNameLikeRight()+"%");
        }
        if(rsdfTargetQuery.isNameIsNull()){
            wrapper.lambda().isNull(RsdfTarget::getName);
        }
        if(rsdfTargetQuery.isNameIsNotNull()){
            wrapper.lambda().isNotNull(RsdfTarget::getName);
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetQuery.getNameList())){
            wrapper.lambda().in(RsdfTarget::getName,rsdfTargetQuery.getNameList());
        }
        if(CollectionUtils.isNotEmpty(rsdfTargetQuery.getNameNotInList())){
            wrapper.lambda().notIn(RsdfTarget::getName,rsdfTargetQuery.getNameNotInList());
        }
        if(StringUtils.isNotBlank(rsdfTargetQuery.getOrderByColumn())){
            if(rsdfTargetQuery.isAes()){
                wrapper.orderByAsc(rsdfTargetQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfTargetQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}