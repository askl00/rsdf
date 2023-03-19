package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEventOptionPropertyFeignService;
import com.lmy.rsck.view.dto.RsdfEventOptionPropertyDto;
import com.lmy.rsck.view.query.RsdfEventOptionPropertyQuery;
import com.lmy.rsck.model.example.RsdfEventOptionProperty;
import com.lmy.rsck.service.RsdfEventOptionPropertyService;
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
 * 事件-属性变动表(RsdfEventOptionProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEventOptionPropertyController implements RsdfEventOptionPropertyFeignService{
    
    @Autowired
    private RsdfEventOptionPropertyService rsdfEventOptionPropertyService;
    
    @Override
    public ResultData<RsdfEventOptionPropertyDto> insert(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto){
        RsdfEventOptionProperty rsdfEventOptionProperty = BeanUtils.copyProperties(rsdfEventOptionPropertyDto,RsdfEventOptionProperty.class);
        RsdfEventOptionProperty result = rsdfEventOptionPropertyService.insertSelective(rsdfEventOptionProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEventOptionPropertyDto.class));
    }

    @Override
    public ResultData<RsdfEventOptionPropertyDto> update(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto){
        Assert.isNotNull(rsdfEventOptionPropertyDto.getId(),"id不能为空");
        RsdfEventOptionProperty rsdfEventOptionProperty = BeanUtils.copyProperties(rsdfEventOptionPropertyDto,RsdfEventOptionProperty.class);
        RsdfEventOptionProperty result = rsdfEventOptionPropertyService.updateByPrimaryKeySelective( rsdfEventOptionProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventOptionPropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto){
    //      RsdfEventOptionProperty rsdfEventOptionProperty = BeanUtils.copyProperties(rsdfEventOptionPropertyDto,RsdfEventOptionProperty.class);
    //      rsdfEventOptionPropertyService.deleteByPrimaryKey( rsdfEventOptionProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEventOptionPropertyDto> get(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto){
        Assert.isNotNull(rsdfEventOptionPropertyDto.getId(),"id不能为空");
        RsdfEventOptionProperty result = rsdfEventOptionPropertyService.getByPrimaryKey(rsdfEventOptionPropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventOptionPropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEventOptionPropertyDto>> getList(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery){
        List<RsdfEventOptionProperty> rsdfEventOptionPropertyList = rsdfEventOptionPropertyService.getList( rsdfEventOptionPropertyQuery);
        if(CollectionUtils.isEmpty( rsdfEventOptionPropertyList)){
            ResultData.success(new ArrayList<RsdfEventOptionPropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEventOptionPropertyList,RsdfEventOptionPropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery){
        Page page = rsdfEventOptionPropertyService.getListWithPage( rsdfEventOptionPropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEventOptionPropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery){
        Integer count = rsdfEventOptionPropertyService.getCount( rsdfEventOptionPropertyQuery);
        return ResultData.success(count);
    }
}