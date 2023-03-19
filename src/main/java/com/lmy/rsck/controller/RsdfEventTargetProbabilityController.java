package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEventTargetProbabilityFeignService;
import com.lmy.rsck.view.dto.RsdfEventTargetProbabilityDto;
import com.lmy.rsck.view.query.RsdfEventTargetProbabilityQuery;
import com.lmy.rsck.model.example.RsdfEventTargetProbability;
import com.lmy.rsck.service.RsdfEventTargetProbabilityService;
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
 * 事件-目标概率表(RsdfEventTargetProbability)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEventTargetProbabilityController implements RsdfEventTargetProbabilityFeignService{
    
    @Autowired
    private RsdfEventTargetProbabilityService rsdfEventTargetProbabilityService;
    
    @Override
    public ResultData<RsdfEventTargetProbabilityDto> insert(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto){
        RsdfEventTargetProbability rsdfEventTargetProbability = BeanUtils.copyProperties(rsdfEventTargetProbabilityDto,RsdfEventTargetProbability.class);
        RsdfEventTargetProbability result = rsdfEventTargetProbabilityService.insertSelective(rsdfEventTargetProbability);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEventTargetProbabilityDto.class));
    }

    @Override
    public ResultData<RsdfEventTargetProbabilityDto> update(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto){
        Assert.isNotNull(rsdfEventTargetProbabilityDto.getId(),"id不能为空");
        RsdfEventTargetProbability rsdfEventTargetProbability = BeanUtils.copyProperties(rsdfEventTargetProbabilityDto,RsdfEventTargetProbability.class);
        RsdfEventTargetProbability result = rsdfEventTargetProbabilityService.updateByPrimaryKeySelective( rsdfEventTargetProbability);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventTargetProbabilityDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto){
    //      RsdfEventTargetProbability rsdfEventTargetProbability = BeanUtils.copyProperties(rsdfEventTargetProbabilityDto,RsdfEventTargetProbability.class);
    //      rsdfEventTargetProbabilityService.deleteByPrimaryKey( rsdfEventTargetProbability);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEventTargetProbabilityDto> get(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto){
        Assert.isNotNull(rsdfEventTargetProbabilityDto.getId(),"id不能为空");
        RsdfEventTargetProbability result = rsdfEventTargetProbabilityService.getByPrimaryKey(rsdfEventTargetProbabilityDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventTargetProbabilityDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEventTargetProbabilityDto>> getList(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
        List<RsdfEventTargetProbability> rsdfEventTargetProbabilityList = rsdfEventTargetProbabilityService.getList( rsdfEventTargetProbabilityQuery);
        if(CollectionUtils.isEmpty( rsdfEventTargetProbabilityList)){
            ResultData.success(new ArrayList<RsdfEventTargetProbabilityDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEventTargetProbabilityList,RsdfEventTargetProbabilityDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
        Page page = rsdfEventTargetProbabilityService.getListWithPage( rsdfEventTargetProbabilityQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEventTargetProbabilityDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
        Integer count = rsdfEventTargetProbabilityService.getCount( rsdfEventTargetProbabilityQuery);
        return ResultData.success(count);
    }
}