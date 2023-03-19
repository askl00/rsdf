package com.lmy.rsck.model.example;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfEventQuery;
/**
 * 事件(RsdfEvent)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfEventExample {
    public static Wrapper<RsdfEvent> getWrapper(RsdfEventQuery rsdfEventQuery){
        QueryWrapper<RsdfEvent> wrapper = new QueryWrapper();
                if(rsdfEventQuery.getId()!=null){
            wrapper.lambda().eq(RsdfEvent::getId,rsdfEventQuery.getId());
        }
        if(rsdfEventQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEvent::getId,rsdfEventQuery.getIdNotEq());
        }
        if(rsdfEventQuery.getIdStart()!=null&&rsdfEventQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfEvent::getId,rsdfEventQuery.getIdStart(),rsdfEventQuery.getIdEnd());
        }
        if(rsdfEventQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEvent::getId,rsdfEventQuery.getIdLessThan());
        }
        if(rsdfEventQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEvent::getId,rsdfEventQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfEventQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEvent::getId,rsdfEventQuery.getIdGreaterThan());
        }
        if(rsdfEventQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEvent::getId,rsdfEventQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfEventQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfEvent::getId);
        }
        if(rsdfEventQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEvent::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getIdList())){
            wrapper.lambda().in(RsdfEvent::getId,rsdfEventQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfEvent::getId,rsdfEventQuery.getIdNotInList());
        }
            /**
         * 时间id
         */
            if(rsdfEventQuery.getTimeId()!=null){
            wrapper.lambda().eq(RsdfEvent::getTimeId,rsdfEventQuery.getTimeId());
        }
        if(rsdfEventQuery.getTimeIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdNotEq());
        }
        if(rsdfEventQuery.getTimeIdStart()!=null&&rsdfEventQuery.getTimeIdEnd()!=null){
            wrapper.lambda().between(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdStart(),rsdfEventQuery.getTimeIdEnd());
        }
        if(rsdfEventQuery.getTimeIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdLessThan());
        }
        if(rsdfEventQuery.getTimeIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdLessThanOrEqualTo());
        }
        if(rsdfEventQuery.getTimeIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdGreaterThan());
        }
        if(rsdfEventQuery.getTimeIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdGreaterThanOrEqualTo());
        }
        if(rsdfEventQuery.isTimeIdIsNull()){
            wrapper.lambda().isNull(RsdfEvent::getTimeId);
        }
        if(rsdfEventQuery.isTimeIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEvent::getTimeId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getTimeIdList())){
            wrapper.lambda().in(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getTimeIdNotInList())){
            wrapper.lambda().notIn(RsdfEvent::getTimeId,rsdfEventQuery.getTimeIdNotInList());
        }
            /**
         * 名称
         */
            if(StringUtils.isNotBlank(rsdfEventQuery.getName())){
            wrapper.lambda().eq(RsdfEvent::getName,rsdfEventQuery.getName());
        }
        if(StringUtils.isNotBlank(rsdfEventQuery.getNameNotEq())){
            wrapper.lambda().ne(RsdfEvent::getName,rsdfEventQuery.getNameNotEq());
        }
        if(StringUtils.isNotBlank(rsdfEventQuery.getNameLike())){
            wrapper.lambda().like(RsdfEvent::getName,"%"+rsdfEventQuery.getNameLike()+"%");
        }
        if(StringUtils.isNotBlank(rsdfEventQuery.getNameLikeLeft())){
            wrapper.lambda().likeLeft(RsdfEvent::getName,"%"+rsdfEventQuery.getNameLikeLeft());
        }
        if(StringUtils.isNotBlank(rsdfEventQuery.getNameLikeRight())){
            wrapper.lambda().likeRight(RsdfEvent::getName,rsdfEventQuery.getNameLikeRight()+"%");
        }
        if(rsdfEventQuery.isNameIsNull()){
            wrapper.lambda().isNull(RsdfEvent::getName);
        }
        if(rsdfEventQuery.isNameIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEvent::getName);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getNameList())){
            wrapper.lambda().in(RsdfEvent::getName,rsdfEventQuery.getNameList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getNameNotInList())){
            wrapper.lambda().notIn(RsdfEvent::getName,rsdfEventQuery.getNameNotInList());
        }
            /**
         * 父级事件
         */
            if(rsdfEventQuery.getParentId()!=null){
            wrapper.lambda().eq(RsdfEvent::getParentId,rsdfEventQuery.getParentId());
        }
        if(rsdfEventQuery.getParentIdNotEq()!=null){
            wrapper.lambda().ne(RsdfEvent::getParentId,rsdfEventQuery.getParentIdNotEq());
        }
        if(rsdfEventQuery.getParentIdStart()!=null&&rsdfEventQuery.getParentIdEnd()!=null){
            wrapper.lambda().between(RsdfEvent::getParentId,rsdfEventQuery.getParentIdStart(),rsdfEventQuery.getParentIdEnd());
        }
        if(rsdfEventQuery.getParentIdLessThan()!=null){
            wrapper.lambda().lt(RsdfEvent::getParentId,rsdfEventQuery.getParentIdLessThan());
        }
        if(rsdfEventQuery.getParentIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfEvent::getParentId,rsdfEventQuery.getParentIdLessThanOrEqualTo());
        }
        if(rsdfEventQuery.getParentIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfEvent::getParentId,rsdfEventQuery.getParentIdGreaterThan());
        }
        if(rsdfEventQuery.getParentIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfEvent::getParentId,rsdfEventQuery.getParentIdGreaterThanOrEqualTo());
        }
        if(rsdfEventQuery.isParentIdIsNull()){
            wrapper.lambda().isNull(RsdfEvent::getParentId);
        }
        if(rsdfEventQuery.isParentIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfEvent::getParentId);
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getParentIdList())){
            wrapper.lambda().in(RsdfEvent::getParentId,rsdfEventQuery.getParentIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfEventQuery.getParentIdNotInList())){
            wrapper.lambda().notIn(RsdfEvent::getParentId,rsdfEventQuery.getParentIdNotInList());
        }
        if(StringUtils.isNotBlank(rsdfEventQuery.getOrderByColumn())){
            if(rsdfEventQuery.isAes()){
                wrapper.orderByAsc(rsdfEventQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfEventQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}