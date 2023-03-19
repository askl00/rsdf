package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfTargetPropertyFeignService;
import com.lmy.rsck.view.dto.RsdfTargetPropertyDto;
import com.lmy.rsck.view.query.RsdfTargetPropertyQuery;
import com.lmy.rsck.model.example.RsdfTargetProperty;
import com.lmy.rsck.service.RsdfTargetPropertyService;
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
 * 目标-所需属性表(RsdfTargetProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@RestController
public class RsdfTargetPropertyController implements RsdfTargetPropertyFeignService{
    
    @Autowired
    private RsdfTargetPropertyService rsdfTargetPropertyService;
    
    @Override
    public ResultData<RsdfTargetPropertyDto> insert(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto){
        RsdfTargetProperty rsdfTargetProperty = BeanUtils.copyProperties(rsdfTargetPropertyDto,RsdfTargetProperty.class);
        RsdfTargetProperty result = rsdfTargetPropertyService.insertSelective(rsdfTargetProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfTargetPropertyDto.class));
    }

    @Override
    public ResultData<RsdfTargetPropertyDto> update(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto){
        Assert.isNotNull(rsdfTargetPropertyDto.getId(),"id不能为空");
        RsdfTargetProperty rsdfTargetProperty = BeanUtils.copyProperties(rsdfTargetPropertyDto,RsdfTargetProperty.class);
        RsdfTargetProperty result = rsdfTargetPropertyService.updateByPrimaryKeySelective( rsdfTargetProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfTargetPropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto){
    //      RsdfTargetProperty rsdfTargetProperty = BeanUtils.copyProperties(rsdfTargetPropertyDto,RsdfTargetProperty.class);
    //      rsdfTargetPropertyService.deleteByPrimaryKey( rsdfTargetProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfTargetPropertyDto> get(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto){
        Assert.isNotNull(rsdfTargetPropertyDto.getId(),"id不能为空");
        RsdfTargetProperty result = rsdfTargetPropertyService.getByPrimaryKey(rsdfTargetPropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfTargetPropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfTargetPropertyDto>> getList(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
        List<RsdfTargetProperty> rsdfTargetPropertyList = rsdfTargetPropertyService.getList( rsdfTargetPropertyQuery);
        if(CollectionUtils.isEmpty( rsdfTargetPropertyList)){
            ResultData.success(new ArrayList<RsdfTargetPropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfTargetPropertyList,RsdfTargetPropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
        Page page = rsdfTargetPropertyService.getListWithPage( rsdfTargetPropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfTargetPropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
        Integer count = rsdfTargetPropertyService.getCount( rsdfTargetPropertyQuery);
        return ResultData.success(count);
    }
}