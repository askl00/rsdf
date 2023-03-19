package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfTimeFeignService;
import com.lmy.rsck.view.dto.RsdfTimeDto;
import com.lmy.rsck.view.query.RsdfTimeQuery;
import com.lmy.rsck.model.example.RsdfTime;
import com.lmy.rsck.service.RsdfTimeService;
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
 * 时间(RsdfTime)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@RestController
public class RsdfTimeController implements RsdfTimeFeignService{
    
    @Autowired
    private RsdfTimeService rsdfTimeService;
    
    @Override
    public ResultData<RsdfTimeDto> insert(@RequestBody RsdfTimeDto rsdfTimeDto){
        RsdfTime rsdfTime = BeanUtils.copyProperties(rsdfTimeDto,RsdfTime.class);
        RsdfTime result = rsdfTimeService.insertSelective(rsdfTime);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfTimeDto.class));
    }

    @Override
    public ResultData<RsdfTimeDto> update(@RequestBody RsdfTimeDto rsdfTimeDto){
        Assert.isNotNull(rsdfTimeDto.getId(),"id不能为空");
        RsdfTime rsdfTime = BeanUtils.copyProperties(rsdfTimeDto,RsdfTime.class);
        RsdfTime result = rsdfTimeService.updateByPrimaryKeySelective( rsdfTime);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfTimeDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfTimeDto rsdfTimeDto){
    //      RsdfTime rsdfTime = BeanUtils.copyProperties(rsdfTimeDto,RsdfTime.class);
    //      rsdfTimeService.deleteByPrimaryKey( rsdfTime);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfTimeDto> get(@RequestBody RsdfTimeDto rsdfTimeDto){
        Assert.isNotNull(rsdfTimeDto.getId(),"id不能为空");
        RsdfTime result = rsdfTimeService.getByPrimaryKey(rsdfTimeDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfTimeDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfTimeDto>> getList(@RequestBody RsdfTimeQuery rsdfTimeQuery){
        List<RsdfTime> rsdfTimeList = rsdfTimeService.getList( rsdfTimeQuery);
        if(CollectionUtils.isEmpty( rsdfTimeList)){
            ResultData.success(new ArrayList<RsdfTimeDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfTimeList,RsdfTimeDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfTimeQuery rsdfTimeQuery){
        Page page = rsdfTimeService.getListWithPage( rsdfTimeQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfTimeDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfTimeQuery rsdfTimeQuery){
        Integer count = rsdfTimeService.getCount( rsdfTimeQuery);
        return ResultData.success(count);
    }
}