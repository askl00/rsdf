package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfPropertyFeignService;
import com.lmy.rsck.view.dto.RsdfPropertyDto;
import com.lmy.rsck.view.query.RsdfPropertyQuery;
import com.lmy.rsck.model.example.RsdfProperty;
import com.lmy.rsck.service.RsdfPropertyService;
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
 * 属性表(RsdfProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@RestController
public class RsdfPropertyController implements RsdfPropertyFeignService{
    
    @Autowired
    private RsdfPropertyService rsdfPropertyService;
    
    @Override
    public ResultData<RsdfPropertyDto> insert(@RequestBody RsdfPropertyDto rsdfPropertyDto){
        RsdfProperty rsdfProperty = BeanUtils.copyProperties(rsdfPropertyDto,RsdfProperty.class);
        RsdfProperty result = rsdfPropertyService.insertSelective(rsdfProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfPropertyDto.class));
    }

    @Override
    public ResultData<RsdfPropertyDto> update(@RequestBody RsdfPropertyDto rsdfPropertyDto){
        Assert.isNotNull(rsdfPropertyDto.getId(),"id不能为空");
        RsdfProperty rsdfProperty = BeanUtils.copyProperties(rsdfPropertyDto,RsdfProperty.class);
        RsdfProperty result = rsdfPropertyService.updateByPrimaryKeySelective( rsdfProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfPropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfPropertyDto rsdfPropertyDto){
    //      RsdfProperty rsdfProperty = BeanUtils.copyProperties(rsdfPropertyDto,RsdfProperty.class);
    //      rsdfPropertyService.deleteByPrimaryKey( rsdfProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfPropertyDto> get(@RequestBody RsdfPropertyDto rsdfPropertyDto){
        Assert.isNotNull(rsdfPropertyDto.getId(),"id不能为空");
        RsdfProperty result = rsdfPropertyService.getByPrimaryKey(rsdfPropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfPropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfPropertyDto>> getList(@RequestBody RsdfPropertyQuery rsdfPropertyQuery){
        List<RsdfProperty> rsdfPropertyList = rsdfPropertyService.getList( rsdfPropertyQuery);
        if(CollectionUtils.isEmpty( rsdfPropertyList)){
            ResultData.success(new ArrayList<RsdfPropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfPropertyList,RsdfPropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfPropertyQuery rsdfPropertyQuery){
        Page page = rsdfPropertyService.getListWithPage( rsdfPropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfPropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfPropertyQuery rsdfPropertyQuery){
        Integer count = rsdfPropertyService.getCount( rsdfPropertyQuery);
        return ResultData.success(count);
    }
}