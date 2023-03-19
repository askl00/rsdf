package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEventProbabilityPropertyFeignService;
import com.lmy.rsck.view.dto.RsdfEventProbabilityPropertyDto;
import com.lmy.rsck.view.query.RsdfEventProbabilityPropertyQuery;
import com.lmy.rsck.model.example.RsdfEventProbabilityProperty;
import com.lmy.rsck.service.RsdfEventProbabilityPropertyService;
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
 * 事件-属性概率表(RsdfEventProbabilityProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEventProbabilityPropertyController implements RsdfEventProbabilityPropertyFeignService{
    
    @Autowired
    private RsdfEventProbabilityPropertyService rsdfEventProbabilityPropertyService;
    
    @Override
    public ResultData<RsdfEventProbabilityPropertyDto> insert(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto){
        RsdfEventProbabilityProperty rsdfEventProbabilityProperty = BeanUtils.copyProperties(rsdfEventProbabilityPropertyDto,RsdfEventProbabilityProperty.class);
        RsdfEventProbabilityProperty result = rsdfEventProbabilityPropertyService.insertSelective(rsdfEventProbabilityProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEventProbabilityPropertyDto.class));
    }

    @Override
    public ResultData<RsdfEventProbabilityPropertyDto> update(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto){
        Assert.isNotNull(rsdfEventProbabilityPropertyDto.getId(),"id不能为空");
        RsdfEventProbabilityProperty rsdfEventProbabilityProperty = BeanUtils.copyProperties(rsdfEventProbabilityPropertyDto,RsdfEventProbabilityProperty.class);
        RsdfEventProbabilityProperty result = rsdfEventProbabilityPropertyService.updateByPrimaryKeySelective( rsdfEventProbabilityProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventProbabilityPropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto){
    //      RsdfEventProbabilityProperty rsdfEventProbabilityProperty = BeanUtils.copyProperties(rsdfEventProbabilityPropertyDto,RsdfEventProbabilityProperty.class);
    //      rsdfEventProbabilityPropertyService.deleteByPrimaryKey( rsdfEventProbabilityProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEventProbabilityPropertyDto> get(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto){
        Assert.isNotNull(rsdfEventProbabilityPropertyDto.getId(),"id不能为空");
        RsdfEventProbabilityProperty result = rsdfEventProbabilityPropertyService.getByPrimaryKey(rsdfEventProbabilityPropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventProbabilityPropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEventProbabilityPropertyDto>> getList(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery){
        List<RsdfEventProbabilityProperty> rsdfEventProbabilityPropertyList = rsdfEventProbabilityPropertyService.getList( rsdfEventProbabilityPropertyQuery);
        if(CollectionUtils.isEmpty( rsdfEventProbabilityPropertyList)){
            ResultData.success(new ArrayList<RsdfEventProbabilityPropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEventProbabilityPropertyList,RsdfEventProbabilityPropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery){
        Page page = rsdfEventProbabilityPropertyService.getListWithPage( rsdfEventProbabilityPropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEventProbabilityPropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery){
        Integer count = rsdfEventProbabilityPropertyService.getCount( rsdfEventProbabilityPropertyQuery);
        return ResultData.success(count);
    }
}