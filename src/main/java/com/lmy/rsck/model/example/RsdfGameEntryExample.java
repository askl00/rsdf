package com.lmy.rsck.model.example;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfGameEntryQuery;
/**
 * 游戏词条表(RsdfGameEntry)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfGameEntryExample {
    public static Wrapper<RsdfGameEntry> getWrapper(RsdfGameEntryQuery rsdfGameEntryQuery){
        QueryWrapper<RsdfGameEntry> wrapper = new QueryWrapper();
                if(rsdfGameEntryQuery.getId()!=null){
            wrapper.lambda().eq(RsdfGameEntry::getId,rsdfGameEntryQuery.getId());
        }
        if(rsdfGameEntryQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdNotEq());
        }
        if(rsdfGameEntryQuery.getIdStart()!=null&&rsdfGameEntryQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdStart(),rsdfGameEntryQuery.getIdEnd());
        }
        if(rsdfGameEntryQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdLessThan());
        }
        if(rsdfGameEntryQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfGameEntryQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdGreaterThan());
        }
        if(rsdfGameEntryQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfGameEntryQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfGameEntry::getId);
        }
        if(rsdfGameEntryQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameEntry::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEntryQuery.getIdList())){
            wrapper.lambda().in(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEntryQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfGameEntry::getId,rsdfGameEntryQuery.getIdNotInList());
        }
            /**
         * 游戏id
         */
            if(rsdfGameEntryQuery.getGameId()!=null){
            wrapper.lambda().eq(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameId());
        }
        if(rsdfGameEntryQuery.getGameIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdNotEq());
        }
        if(rsdfGameEntryQuery.getGameIdStart()!=null&&rsdfGameEntryQuery.getGameIdEnd()!=null){
            wrapper.lambda().between(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdStart(),rsdfGameEntryQuery.getGameIdEnd());
        }
        if(rsdfGameEntryQuery.getGameIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdLessThan());
        }
        if(rsdfGameEntryQuery.getGameIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdLessThanOrEqualTo());
        }
        if(rsdfGameEntryQuery.getGameIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdGreaterThan());
        }
        if(rsdfGameEntryQuery.getGameIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdGreaterThanOrEqualTo());
        }
        if(rsdfGameEntryQuery.isGameIdIsNull()){
            wrapper.lambda().isNull(RsdfGameEntry::getGameId);
        }
        if(rsdfGameEntryQuery.isGameIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameEntry::getGameId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEntryQuery.getGameIdList())){
            wrapper.lambda().in(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEntryQuery.getGameIdNotInList())){
            wrapper.lambda().notIn(RsdfGameEntry::getGameId,rsdfGameEntryQuery.getGameIdNotInList());
        }
            /**
         * 目标id
         */
            if(rsdfGameEntryQuery.getEntryId()!=null){
            wrapper.lambda().eq(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryId());
        }
        if(rsdfGameEntryQuery.getEntryIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdNotEq());
        }
        if(rsdfGameEntryQuery.getEntryIdStart()!=null&&rsdfGameEntryQuery.getEntryIdEnd()!=null){
            wrapper.lambda().between(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdStart(),rsdfGameEntryQuery.getEntryIdEnd());
        }
        if(rsdfGameEntryQuery.getEntryIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdLessThan());
        }
        if(rsdfGameEntryQuery.getEntryIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdLessThanOrEqualTo());
        }
        if(rsdfGameEntryQuery.getEntryIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdGreaterThan());
        }
        if(rsdfGameEntryQuery.getEntryIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdGreaterThanOrEqualTo());
        }
        if(rsdfGameEntryQuery.isEntryIdIsNull()){
            wrapper.lambda().isNull(RsdfGameEntry::getEntryId);
        }
        if(rsdfGameEntryQuery.isEntryIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameEntry::getEntryId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEntryQuery.getEntryIdList())){
            wrapper.lambda().in(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEntryQuery.getEntryIdNotInList())){
            wrapper.lambda().notIn(RsdfGameEntry::getEntryId,rsdfGameEntryQuery.getEntryIdNotInList());
        }
        if(StringUtils.isNotBlank(rsdfGameEntryQuery.getOrderByColumn())){
            if(rsdfGameEntryQuery.isAes()){
                wrapper.orderByAsc(rsdfGameEntryQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfGameEntryQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}