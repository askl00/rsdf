package com.lmy.rsck.model.example;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheers.micro.common.vo.utils.StringUtils;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.lmy.rsck.view.query.RsdfGameEventQuery;
/**
 * 游戏发生的事件表(RsdfGameEvent)Example
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public class RsdfGameEventExample {
    public static Wrapper<RsdfGameEvent> getWrapper(RsdfGameEventQuery rsdfGameEventQuery){
        QueryWrapper<RsdfGameEvent> wrapper = new QueryWrapper();
                if(rsdfGameEventQuery.getId()!=null){
            wrapper.lambda().eq(RsdfGameEvent::getId,rsdfGameEventQuery.getId());
        }
        if(rsdfGameEventQuery.getIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameEvent::getId,rsdfGameEventQuery.getIdNotEq());
        }
        if(rsdfGameEventQuery.getIdStart()!=null&&rsdfGameEventQuery.getIdEnd()!=null){
            wrapper.lambda().between(RsdfGameEvent::getId,rsdfGameEventQuery.getIdStart(),rsdfGameEventQuery.getIdEnd());
        }
        if(rsdfGameEventQuery.getIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameEvent::getId,rsdfGameEventQuery.getIdLessThan());
        }
        if(rsdfGameEventQuery.getIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameEvent::getId,rsdfGameEventQuery.getIdLessThanOrEqualTo());
        }
        if(rsdfGameEventQuery.getIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameEvent::getId,rsdfGameEventQuery.getIdGreaterThan());
        }
        if(rsdfGameEventQuery.getIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameEvent::getId,rsdfGameEventQuery.getIdGreaterThanOrEqualTo());
        }
        if(rsdfGameEventQuery.isIdIsNull()){
            wrapper.lambda().isNull(RsdfGameEvent::getId);
        }
        if(rsdfGameEventQuery.isIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameEvent::getId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEventQuery.getIdList())){
            wrapper.lambda().in(RsdfGameEvent::getId,rsdfGameEventQuery.getIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEventQuery.getIdNotInList())){
            wrapper.lambda().notIn(RsdfGameEvent::getId,rsdfGameEventQuery.getIdNotInList());
        }
            /**
         * 游戏id
         */
            if(rsdfGameEventQuery.getGameId()!=null){
            wrapper.lambda().eq(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameId());
        }
        if(rsdfGameEventQuery.getGameIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdNotEq());
        }
        if(rsdfGameEventQuery.getGameIdStart()!=null&&rsdfGameEventQuery.getGameIdEnd()!=null){
            wrapper.lambda().between(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdStart(),rsdfGameEventQuery.getGameIdEnd());
        }
        if(rsdfGameEventQuery.getGameIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdLessThan());
        }
        if(rsdfGameEventQuery.getGameIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdLessThanOrEqualTo());
        }
        if(rsdfGameEventQuery.getGameIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdGreaterThan());
        }
        if(rsdfGameEventQuery.getGameIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdGreaterThanOrEqualTo());
        }
        if(rsdfGameEventQuery.isGameIdIsNull()){
            wrapper.lambda().isNull(RsdfGameEvent::getGameId);
        }
        if(rsdfGameEventQuery.isGameIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameEvent::getGameId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEventQuery.getGameIdList())){
            wrapper.lambda().in(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEventQuery.getGameIdNotInList())){
            wrapper.lambda().notIn(RsdfGameEvent::getGameId,rsdfGameEventQuery.getGameIdNotInList());
        }
            /**
         * 开始时间
         */
            if(rsdfGameEventQuery.getEventId()!=null){
            wrapper.lambda().eq(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventId());
        }
        if(rsdfGameEventQuery.getEventIdNotEq()!=null){
            wrapper.lambda().ne(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdNotEq());
        }
        if(rsdfGameEventQuery.getEventIdStart()!=null&&rsdfGameEventQuery.getEventIdEnd()!=null){
            wrapper.lambda().between(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdStart(),rsdfGameEventQuery.getEventIdEnd());
        }
        if(rsdfGameEventQuery.getEventIdLessThan()!=null){
            wrapper.lambda().lt(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdLessThan());
        }
        if(rsdfGameEventQuery.getEventIdLessThanOrEqualTo()!=null){
            wrapper.lambda().le(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdLessThanOrEqualTo());
        }
        if(rsdfGameEventQuery.getEventIdGreaterThan()!=null){
            wrapper.lambda().gt(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdGreaterThan());
        }
        if(rsdfGameEventQuery.getEventIdGreaterThanOrEqualTo()!=null){
            wrapper.lambda().ge(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdGreaterThanOrEqualTo());
        }
        if(rsdfGameEventQuery.isEventIdIsNull()){
            wrapper.lambda().isNull(RsdfGameEvent::getEventId);
        }
        if(rsdfGameEventQuery.isEventIdIsNotNull()){
            wrapper.lambda().isNotNull(RsdfGameEvent::getEventId);
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEventQuery.getEventIdList())){
            wrapper.lambda().in(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdList());
        }
        if(CollectionUtils.isNotEmpty(rsdfGameEventQuery.getEventIdNotInList())){
            wrapper.lambda().notIn(RsdfGameEvent::getEventId,rsdfGameEventQuery.getEventIdNotInList());
        }
        if(StringUtils.isNotBlank(rsdfGameEventQuery.getOrderByColumn())){
            if(rsdfGameEventQuery.isAes()){
                wrapper.orderByAsc(rsdfGameEventQuery.getOrderByColumn());
            }else{
                wrapper.orderByDesc(rsdfGameEventQuery.getOrderByColumn());
            }
        }
        return wrapper;
    }
}