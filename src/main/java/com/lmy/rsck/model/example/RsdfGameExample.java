package com.lmy.rsck.model.example;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfGameQuery;
/**
 * 游戏（记录）表(RsdfGame)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfGameExample {
    public static Wrapper<RsdfGame> getWrapper(RsdfGameQuery rsdfGameQuery){
        QueryWrapper<RsdfGame> wrapper = new QueryWrapper();
                if(rsdfGameQuery.getId()!=null){
            wrapper.lambda().eq(RsdfGame::getId,rsdfGameQuery.getId());
        }
        if(rsdfGameQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGame::getId,rsdfGameQuery.getIdNotEq());
        }
        if(rsdfGameQuery.getIdStart()!=null&&rsdfGameQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfGame::getId,rsdfGameQuery.getIdStart(),rsdfGameQuery.getIdEnd());
        }
        if(rsdfGameQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGame::getId,rsdfGameQuery.getIdLessThan());
        }
        if(rsdfGameQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGame::getId,rsdfGameQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfGameQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGame::getId,rsdfGameQuery.getIdGreaterThan());
        }
        if(rsdfGameQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGame::getId,rsdfGameQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfGameQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfGame::getId);
        }
        if(rsdfGameQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGame::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getIdList())){
            wrapper.lambda().in(RsdfGame::getId,rsdfGameQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfGame::getId,rsdfGameQuery.getIdNotInList());
        }
            /**
         * 用户id
         */
            if(rsdfGameQuery.getUserId()!=null){
            wrapper.lambda().eq(RsdfGame::getUserId,rsdfGameQuery.getUserId());
        }
        if(rsdfGameQuery.getUserIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGame::getUserId,rsdfGameQuery.getUserIdNotEq());
        }
        if(rsdfGameQuery.getUserIdStart()!=null&&rsdfGameQuery.getUserIdEnd()!=null){
            wrapper.lambda().between(RsdfGame::getUserId,rsdfGameQuery.getUserIdStart(),rsdfGameQuery.getUserIdEnd());
        }
        if(rsdfGameQuery.getUserIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGame::getUserId,rsdfGameQuery.getUserIdLessThan());
        }
        if(rsdfGameQuery.getUserIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGame::getUserId,rsdfGameQuery.getUserIdLessThanOrEqualTo());
        }
        if(rsdfGameQuery.getUserIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGame::getUserId,rsdfGameQuery.getUserIdGreaterThan());
        }
        if(rsdfGameQuery.getUserIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGame::getUserId,rsdfGameQuery.getUserIdGreaterThanOrEqualTo());
        }
        if(rsdfGameQuery.isUserIdIsNull()){
            wrapper.lambda().isNull(RsdfGame::getUserId);
        }
        if(rsdfGameQuery.isUserIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGame::getUserId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getUserIdList())){
            wrapper.lambda().in(RsdfGame::getUserId,rsdfGameQuery.getUserIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getUserIdNotInList())){
            wrapper.lambda().notIn(RsdfGame::getUserId,rsdfGameQuery.getUserIdNotInList());
        }
            /**
         * 游戏唯一标识
         */
            if(StringUtils.isNotBlank(rsdfGameQuery.getDistinctId())){
            wrapper.lambda().eq(RsdfGame::getDistinctId,rsdfGameQuery.getDistinctId());
        }
        if(StringUtils.isNotBlank(rsdfGameQuery.getDistinctIdNotEq())){
            wrapper.lambda().ne(RsdfGame::getDistinctId,rsdfGameQuery.getDistinctIdNotEq());
        }
        if(StringUtils.isNotBlank(rsdfGameQuery.getDistinctIdLike())){
            wrapper.lambda().like(RsdfGame::getDistinctId,"%"+rsdfGameQuery.getDistinctIdLike()+"%");
        }
        if(StringUtils.isNotBlank(rsdfGameQuery.getDistinctIdLikeLeft())){
            wrapper.lambda().likeLeft(RsdfGame::getDistinctId,"%"+rsdfGameQuery.getDistinctIdLikeLeft());
        }
        if(StringUtils.isNotBlank(rsdfGameQuery.getDistinctIdLikeRight())){
            wrapper.lambda().likeRight(RsdfGame::getDistinctId,rsdfGameQuery.getDistinctIdLikeRight()+"%");
        }
        if(rsdfGameQuery.isDistinctIdIsNull()){
            wrapper.lambda().isNull(RsdfGame::getDistinctId);
        }
        if(rsdfGameQuery.isDistinctIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGame::getDistinctId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getDistinctIdList())){
            wrapper.lambda().in(RsdfGame::getDistinctId,rsdfGameQuery.getDistinctIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getDistinctIdNotInList())){
            wrapper.lambda().notIn(RsdfGame::getDistinctId,rsdfGameQuery.getDistinctIdNotInList());
        }
            /**
         * 开始时间
         */
            if(rsdfGameQuery.getGameDate()!=null){
            wrapper.lambda().eq(RsdfGame::getGameDate,rsdfGameQuery.getGameDate());
        }
        if(rsdfGameQuery.getGameDateNotEq()!=null){
            wrapper.lambda().ne(RsdfGame::getGameDate,rsdfGameQuery.getGameDateNotEq());
        }
        if(rsdfGameQuery.getGameDateStart()!=null&&rsdfGameQuery.getGameDateEnd()!=null){
            wrapper.lambda().between(RsdfGame::getGameDate,rsdfGameQuery.getGameDateStart(),rsdfGameQuery.getGameDateEnd());
        }
        if(rsdfGameQuery.getGameDateLessThan()!=null){
            wrapper.lambda().lt(RsdfGame::getGameDate,rsdfGameQuery.getGameDateLessThan());
        }
        if(rsdfGameQuery.getGameDateLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGame::getGameDate,rsdfGameQuery.getGameDateLessThanOrEqualTo());
        }
        if(rsdfGameQuery.getGameDateGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGame::getGameDate,rsdfGameQuery.getGameDateGreaterThan());
        }
        if(rsdfGameQuery.getGameDateGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGame::getGameDate,rsdfGameQuery.getGameDateGreaterThanOrEqualTo());
        }
        if(rsdfGameQuery.isGameDateIsNull()){
            wrapper.lambda().isNull(RsdfGame::getGameDate);
        }
        if(rsdfGameQuery.isGameDateIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGame::getGameDate);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getGameDateList())){
            wrapper.lambda().in(RsdfGame::getGameDate,rsdfGameQuery.getGameDateList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getGameDateNotInList())){
            wrapper.lambda().notIn(RsdfGame::getGameDate,rsdfGameQuery.getGameDateNotInList());
        }
            /**
         * 开始时间
         */
            if(rsdfGameQuery.getTimeStart()!=null){
            wrapper.lambda().eq(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStart());
        }
        if(rsdfGameQuery.getTimeStartNotEq()!=null){
            wrapper.lambda().ne(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartNotEq());
        }
        if(rsdfGameQuery.getTimeStartStart()!=null&&rsdfGameQuery.getTimeStartEnd()!=null){
            wrapper.lambda().between(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartStart(),rsdfGameQuery.getTimeStartEnd());
        }
        if(rsdfGameQuery.getTimeStartLessThan()!=null){
            wrapper.lambda().lt(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartLessThan());
        }
        if(rsdfGameQuery.getTimeStartLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartLessThanOrEqualTo());
        }
        if(rsdfGameQuery.getTimeStartGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartGreaterThan());
        }
        if(rsdfGameQuery.getTimeStartGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartGreaterThanOrEqualTo());
        }
        if(rsdfGameQuery.isTimeStartIsNull()){
            wrapper.lambda().isNull(RsdfGame::getTimeStart);
        }
        if(rsdfGameQuery.isTimeStartIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGame::getTimeStart);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getTimeStartList())){
            wrapper.lambda().in(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getTimeStartNotInList())){
            wrapper.lambda().notIn(RsdfGame::getTimeStart,rsdfGameQuery.getTimeStartNotInList());
        }
            /**
         * 结束时间
         */
            if(rsdfGameQuery.getTimeEnd()!=null){
            wrapper.lambda().eq(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEnd());
        }
        if(rsdfGameQuery.getTimeEndNotEq()!=null){
            wrapper.lambda().ne(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndNotEq());
        }
        if(rsdfGameQuery.getTimeEndStart()!=null&&rsdfGameQuery.getTimeEndEnd()!=null){
            wrapper.lambda().between(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndStart(),rsdfGameQuery.getTimeEndEnd());
        }
        if(rsdfGameQuery.getTimeEndLessThan()!=null){
            wrapper.lambda().lt(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndLessThan());
        }
        if(rsdfGameQuery.getTimeEndLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndLessThanOrEqualTo());
        }
        if(rsdfGameQuery.getTimeEndGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndGreaterThan());
        }
        if(rsdfGameQuery.getTimeEndGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndGreaterThanOrEqualTo());
        }
        if(rsdfGameQuery.isTimeEndIsNull()){
            wrapper.lambda().isNull(RsdfGame::getTimeEnd);
        }
        if(rsdfGameQuery.isTimeEndIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGame::getTimeEnd);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getTimeEndList())){
            wrapper.lambda().in(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameQuery.getTimeEndNotInList())){
            wrapper.lambda().notIn(RsdfGame::getTimeEnd,rsdfGameQuery.getTimeEndNotInList());
        }
        if(StringUtils.isNotBlank(rsdfGameQuery.getOrderByColumn())){
            if(rsdfGameQuery.isAes()){
                wrapper.orderByAsc(rsdfGameQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfGameQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}