package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfEntryQuery;
/**
 * 词条表(RsdfEntry)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfEntryExample {
    public static Wrapper<RsdfEntry> getWrapper(RsdfEntryQuery rsdfEntryQuery){
        QueryWrapper<RsdfEntry> wrapper = new QueryWrapper();
                if(rsdfEntryQuery.getId()!=null){
            wrapper.lambda().eq(RsdfEntry::getId,rsdfEntryQuery.getId());
        }
        if(rsdfEntryQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEntry::getId,rsdfEntryQuery.getIdNotEq());
        }
        if(rsdfEntryQuery.getIdStart()!=null&&rsdfEntryQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfEntry::getId,rsdfEntryQuery.getIdStart(),rsdfEntryQuery.getIdEnd());
        }
        if(rsdfEntryQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEntry::getId,rsdfEntryQuery.getIdLessThan());
        }
        if(rsdfEntryQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEntry::getId,rsdfEntryQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfEntryQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEntry::getId,rsdfEntryQuery.getIdGreaterThan());
        }
        if(rsdfEntryQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEntry::getId,rsdfEntryQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfEntryQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfEntry::getId);
        }
        if(rsdfEntryQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEntry::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryQuery.getIdList())){
            wrapper.lambda().in(RsdfEntry::getId,rsdfEntryQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfEntry::getId,rsdfEntryQuery.getIdNotInList());
        }
            /**
         * 名称
         */
            if(StringUtils.isNotBlank(rsdfEntryQuery.getName())){
            wrapper.lambda().eq(RsdfEntry::getName,rsdfEntryQuery.getName());
        }
        if(StringUtils.isNotBlank(rsdfEntryQuery.getNameNotEq())){
            wrapper.lambda().ne(RsdfEntry::getName,rsdfEntryQuery.getNameNotEq());
        }
        if(StringUtils.isNotBlank(rsdfEntryQuery.getNameLike())){
            wrapper.lambda().like(RsdfEntry::getName,"%"+rsdfEntryQuery.getNameLike()+"%");
        }
        if(StringUtils.isNotBlank(rsdfEntryQuery.getNameLikeLeft())){
            wrapper.lambda().likeLeft(RsdfEntry::getName,"%"+rsdfEntryQuery.getNameLikeLeft());
        }
        if(StringUtils.isNotBlank(rsdfEntryQuery.getNameLikeRight())){
            wrapper.lambda().likeRight(RsdfEntry::getName,rsdfEntryQuery.getNameLikeRight()+"%");
        }
        if(rsdfEntryQuery.isNameIsNull()){
            wrapper.lambda().isNull(RsdfEntry::getName);
        }
        if(rsdfEntryQuery.isNameIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEntry::getName);
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryQuery.getNameList())){
            wrapper.lambda().in(RsdfEntry::getName,rsdfEntryQuery.getNameList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEntryQuery.getNameNotInList())){
            wrapper.lambda().notIn(RsdfEntry::getName,rsdfEntryQuery.getNameNotInList());
        }
        if(StringUtils.isNotBlank(rsdfEntryQuery.getOrderByColumn())){
            if(rsdfEntryQuery.isAes()){
                wrapper.orderByAsc(rsdfEntryQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfEntryQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}