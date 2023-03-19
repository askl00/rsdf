package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfUserPropertyFeignService;
import com.lmy.rsck.view.dto.RsdfUserPropertyDto;
import com.lmy.rsck.view.query.RsdfUserPropertyQuery;
import com.lmy.rsck.model.example.RsdfUserProperty;
import com.lmy.rsck.service.RsdfUserPropertyService;
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
 * 人物属性表(RsdfUserProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@RestController
public class RsdfUserPropertyController implements RsdfUserPropertyFeignService{
    
    @Autowired
    private RsdfUserPropertyService rsdfUserPropertyService;
    
    @Override
    public ResultData<RsdfUserPropertyDto> insert(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto){
        RsdfUserProperty rsdfUserProperty = BeanUtils.copyProperties(rsdfUserPropertyDto,RsdfUserProperty.class);
        RsdfUserProperty result = rsdfUserPropertyService.insertSelective(rsdfUserProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfUserPropertyDto.class));
    }

    @Override
    public ResultData<RsdfUserPropertyDto> update(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto){
        Assert.isNotNull(rsdfUserPropertyDto.getId(),"id不能为空");
        RsdfUserProperty rsdfUserProperty = BeanUtils.copyProperties(rsdfUserPropertyDto,RsdfUserProperty.class);
        RsdfUserProperty result = rsdfUserPropertyService.updateByPrimaryKeySelective( rsdfUserProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfUserPropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto){
    //      RsdfUserProperty rsdfUserProperty = BeanUtils.copyProperties(rsdfUserPropertyDto,RsdfUserProperty.class);
    //      rsdfUserPropertyService.deleteByPrimaryKey( rsdfUserProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfUserPropertyDto> get(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto){
        Assert.isNotNull(rsdfUserPropertyDto.getId(),"id不能为空");
        RsdfUserProperty result = rsdfUserPropertyService.getByPrimaryKey(rsdfUserPropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfUserPropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfUserPropertyDto>> getList(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery){
        List<RsdfUserProperty> rsdfUserPropertyList = rsdfUserPropertyService.getList( rsdfUserPropertyQuery);
        if(CollectionUtils.isEmpty( rsdfUserPropertyList)){
            ResultData.success(new ArrayList<RsdfUserPropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfUserPropertyList,RsdfUserPropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery){
        Page page = rsdfUserPropertyService.getListWithPage( rsdfUserPropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfUserPropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery){
        Integer count = rsdfUserPropertyService.getCount( rsdfUserPropertyQuery);
        return ResultData.success(count);
    }
}