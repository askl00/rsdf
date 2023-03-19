package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfGameEventFeignService;
import com.lmy.rsck.view.dto.RsdfGameEventDto;
import com.lmy.rsck.view.query.RsdfGameEventQuery;
import com.lmy.rsck.model.example.RsdfGameEvent;
import com.lmy.rsck.service.RsdfGameEventService;
import com.cheers.micro.common.vo.exception.BusinessException;
import com.cheers.micro.common.vo.model.ResultData;
import com.cheers.micro.common.vo.utils.CollectionUtils;
import com.cheers.micro.common.web.utils.BeanUtils;
import com.cheers.micro.common.web.exception.Assert;
import com.cheers.micro.datasource.module.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
/**
 * 游戏发生的事件表(RsdfGameEvent)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfGameEventController implements RsdfGameEventFeignService{
    
    @Autowired
    private RsdfGameEventService rsdfGameEventService;
    
    @Override
    public ResultData<RsdfGameEventDto> insert(@RequestBody RsdfGameEventDto rsdfGameEventDto){
        RsdfGameEvent rsdfGameEvent = BeanUtils.copyProperties(rsdfGameEventDto,RsdfGameEvent.class);
        RsdfGameEvent result = rsdfGameEventService.insertSelective(rsdfGameEvent);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfGameEventDto.class));
    }

    @Override
    public ResultData<RsdfGameEventDto> update(@RequestBody RsdfGameEventDto rsdfGameEventDto){
        Assert.isNotNull(rsdfGameEventDto.getId(),"id不能为空");
        RsdfGameEvent rsdfGameEvent = BeanUtils.copyProperties(rsdfGameEventDto,RsdfGameEvent.class);
        RsdfGameEvent result = rsdfGameEventService.updateByPrimaryKeySelective( rsdfGameEvent);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameEventDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfGameEventDto rsdfGameEventDto){
    //      RsdfGameEvent rsdfGameEvent = BeanUtils.copyProperties(rsdfGameEventDto,RsdfGameEvent.class);
    //      rsdfGameEventService.deleteByPrimaryKey( rsdfGameEvent);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfGameEventDto> get(@RequestBody RsdfGameEventDto rsdfGameEventDto){
        Assert.isNotNull(rsdfGameEventDto.getId(),"id不能为空");
        RsdfGameEvent result = rsdfGameEventService.getByPrimaryKey(rsdfGameEventDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameEventDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfGameEventDto>> getList(@RequestBody RsdfGameEventQuery rsdfGameEventQuery){
        List<RsdfGameEvent> rsdfGameEventList = rsdfGameEventService.getList( rsdfGameEventQuery);
        if(CollectionUtils.isEmpty( rsdfGameEventList)){
            ResultData.success(new ArrayList<RsdfGameEventDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfGameEventList,RsdfGameEventDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfGameEventQuery rsdfGameEventQuery){
        Page page = rsdfGameEventService.getListWithPage( rsdfGameEventQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfGameEventDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfGameEventQuery rsdfGameEventQuery){
        Integer count = rsdfGameEventService.getCount( rsdfGameEventQuery);
        return ResultData.success(count);
    }
}