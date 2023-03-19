package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfEventOptionQuery;
/**
 * 事件选项(RsdfEventOption)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfEventOptionExample {
    public static Wrapper<RsdfEventOption> getWrapper(RsdfEventOptionQuery rsdfEventOptionQuery){
        QueryWrapper<RsdfEventOption> wrapper = new QueryWrapper();
                if(rsdfEventOptionQuery.getId()!=null){
            wrapper.lambda().eq(RsdfEventOption::getId,rsdfEventOptionQuery.getId());
        }
        if(rsdfEventOptionQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventOption::getId,rsdfEventOptionQuery.getIdNotEq());
        }
        if(rsdfEventOptionQuery.getIdStart()!=null&&rsdfEventOptionQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfEventOption::getId,rsdfEventOptionQuery.getIdStart(),rsdfEventOptionQuery.getIdEnd());
        }
        if(rsdfEventOptionQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventOption::getId,rsdfEventOptionQuery.getIdLessThan());
        }
        if(rsdfEventOptionQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventOption::getId,rsdfEventOptionQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfEventOptionQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventOption::getId,rsdfEventOptionQuery.getIdGreaterThan());
        }
        if(rsdfEventOptionQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventOption::getId,rsdfEventOptionQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfEventOptionQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfEventOption::getId);
        }
        if(rsdfEventOptionQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventOption::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventOptionQuery.getIdList())){
            wrapper.lambda().in(RsdfEventOption::getId,rsdfEventOptionQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventOptionQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfEventOption::getId,rsdfEventOptionQuery.getIdNotInList());
        }
            /**
         * 选项id
         */
            if(rsdfEventOptionQuery.getEventId()!=null){
            wrapper.lambda().eq(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventId());
        }
        if(rsdfEventOptionQuery.getEventIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdNotEq());
        }
        if(rsdfEventOptionQuery.getEventIdStart()!=null&&rsdfEventOptionQuery.getEventIdEnd()!=null){
            wrapper.lambda().between(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdStart(),rsdfEventOptionQuery.getEventIdEnd());
        }
        if(rsdfEventOptionQuery.getEventIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdLessThan());
        }
        if(rsdfEventOptionQuery.getEventIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdLessThanOrEqualTo());
        }
        if(rsdfEventOptionQuery.getEventIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdGreaterThan());
        }
        if(rsdfEventOptionQuery.getEventIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdGreaterThanOrEqualTo());
        }
        if(rsdfEventOptionQuery.isEventIdIsNull()){
            wrapper.lambda().isNull(RsdfEventOption::getEventId);
        }
        if(rsdfEventOptionQuery.isEventIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventOption::getEventId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventOptionQuery.getEventIdList())){
            wrapper.lambda().in(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventOptionQuery.getEventIdNotInList())){
            wrapper.lambda().notIn(RsdfEventOption::getEventId,rsdfEventOptionQuery.getEventIdNotInList());
        }
            /**
         * 名称
         */
            if(StringUtils.isNotBlank(rsdfEventOptionQuery.getName())){
            wrapper.lambda().eq(RsdfEventOption::getName,rsdfEventOptionQuery.getName());
        }
        if(StringUtils.isNotBlank(rsdfEventOptionQuery.getNameNotEq())){
            wrapper.lambda().ne(RsdfEventOption::getName,rsdfEventOptionQuery.getNameNotEq());
        }
        if(StringUtils.isNotBlank(rsdfEventOptionQuery.getNameLike())){
            wrapper.lambda().like(RsdfEventOption::getName,"%"+rsdfEventOptionQuery.getNameLike()+"%");
        }
        if(StringUtils.isNotBlank(rsdfEventOptionQuery.getNameLikeLeft())){
            wrapper.lambda().likeLeft(RsdfEventOption::getName,"%"+rsdfEventOptionQuery.getNameLikeLeft());
        }
        if(StringUtils.isNotBlank(rsdfEventOptionQuery.getNameLikeRight())){
            wrapper.lambda().likeRight(RsdfEventOption::getName,rsdfEventOptionQuery.getNameLikeRight()+"%");
        }
        if(rsdfEventOptionQuery.isNameIsNull()){
            wrapper.lambda().isNull(RsdfEventOption::getName);
        }
        if(rsdfEventOptionQuery.isNameIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEventOption::getName);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventOptionQuery.getNameList())){
            wrapper.lambda().in(RsdfEventOption::getName,rsdfEventOptionQuery.getNameList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventOptionQuery.getNameNotInList())){
            wrapper.lambda().notIn(RsdfEventOption::getName,rsdfEventOptionQuery.getNameNotInList());
        }
        if(StringUtils.isNotBlank(rsdfEventOptionQuery.getOrderByColumn())){
            if(rsdfEventOptionQuery.isAes()){
                wrapper.orderByAsc(rsdfEventOptionQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfEventOptionQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}