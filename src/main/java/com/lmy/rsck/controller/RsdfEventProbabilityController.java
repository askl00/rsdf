package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEventProbabilityFeignService;
import com.lmy.rsck.view.dto.RsdfEventProbabilityDto;
import com.lmy.rsck.view.query.RsdfEventProbabilityQuery;
import com.lmy.rsck.model.example.RsdfEventProbability;
import com.lmy.rsck.service.RsdfEventProbabilityService;
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
 * 事件概率表(RsdfEventProbability)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEventProbabilityController implements RsdfEventProbabilityFeignService{
    
    @Autowired
    private RsdfEventProbabilityService rsdfEventProbabilityService;
    
    @Override
    public ResultData<RsdfEventProbabilityDto> insert(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto){
        RsdfEventProbability rsdfEventProbability = BeanUtils.copyProperties(rsdfEventProbabilityDto,RsdfEventProbability.class);
        RsdfEventProbability result = rsdfEventProbabilityService.insertSelective(rsdfEventProbability);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEventProbabilityDto.class));
    }

    @Override
    public ResultData<RsdfEventProbabilityDto> update(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto){
        Assert.isNotNull(rsdfEventProbabilityDto.getId(),"id不能为空");
        RsdfEventProbability rsdfEventProbability = BeanUtils.copyProperties(rsdfEventProbabilityDto,RsdfEventProbability.class);
        RsdfEventProbability result = rsdfEventProbabilityService.updateByPrimaryKeySelective( rsdfEventProbability);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventProbabilityDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto){
    //      RsdfEventProbability rsdfEventProbability = BeanUtils.copyProperties(rsdfEventProbabilityDto,RsdfEventProbability.class);
    //      rsdfEventProbabilityService.deleteByPrimaryKey( rsdfEventProbability);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEventProbabilityDto> get(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto){
        Assert.isNotNull(rsdfEventProbabilityDto.getId(),"id不能为空");
        RsdfEventProbability result = rsdfEventProbabilityService.getByPrimaryKey(rsdfEventProbabilityDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventProbabilityDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEventProbabilityDto>> getList(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
        List<RsdfEventProbability> rsdfEventProbabilityList = rsdfEventProbabilityService.getList( rsdfEventProbabilityQuery);
        if(CollectionUtils.isEmpty( rsdfEventProbabilityList)){
            ResultData.success(new ArrayList<RsdfEventProbabilityDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEventProbabilityList,RsdfEventProbabilityDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
        Page page = rsdfEventProbabilityService.getListWithPage( rsdfEventProbabilityQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEventProbabilityDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
        Integer count = rsdfEventProbabilityService.getCount( rsdfEventProbabilityQuery);
        return ResultData.success(count);
    }
}