package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEventFeignService;
import com.lmy.rsck.view.dto.RsdfEventDto;
import com.lmy.rsck.view.query.RsdfEventQuery;
import com.lmy.rsck.model.example.RsdfEvent;
import com.lmy.rsck.service.RsdfEventService;
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
 * 事件(RsdfEvent)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEventController implements RsdfEventFeignService{
    
    @Autowired
    private RsdfEventService rsdfEventService;
    
    @Override
    public ResultData<RsdfEventDto> insert(@RequestBody RsdfEventDto rsdfEventDto){
        RsdfEvent rsdfEvent = BeanUtils.copyProperties(rsdfEventDto,RsdfEvent.class);
        RsdfEvent result = rsdfEventService.insertSelective(rsdfEvent);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEventDto.class));
    }

    @Override
    public ResultData<RsdfEventDto> update(@RequestBody RsdfEventDto rsdfEventDto){
        Assert.isNotNull(rsdfEventDto.getId(),"id不能为空");
        RsdfEvent rsdfEvent = BeanUtils.copyProperties(rsdfEventDto,RsdfEvent.class);
        RsdfEvent result = rsdfEventService.updateByPrimaryKeySelective( rsdfEvent);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEventDto rsdfEventDto){
    //      RsdfEvent rsdfEvent = BeanUtils.copyProperties(rsdfEventDto,RsdfEvent.class);
    //      rsdfEventService.deleteByPrimaryKey( rsdfEvent);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEventDto> get(@RequestBody RsdfEventDto rsdfEventDto){
        Assert.isNotNull(rsdfEventDto.getId(),"id不能为空");
        RsdfEvent result = rsdfEventService.getByPrimaryKey(rsdfEventDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEventDto>> getList(@RequestBody RsdfEventQuery rsdfEventQuery){
        List<RsdfEvent> rsdfEventList = rsdfEventService.getList( rsdfEventQuery);
        if(CollectionUtils.isEmpty( rsdfEventList)){
            ResultData.success(new ArrayList<RsdfEventDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEventList,RsdfEventDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEventQuery rsdfEventQuery){
        Page page = rsdfEventService.getListWithPage( rsdfEventQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEventDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEventQuery rsdfEventQuery){
        Integer count = rsdfEventService.getCount( rsdfEventQuery);
        return ResultData.success(count);
    }
}