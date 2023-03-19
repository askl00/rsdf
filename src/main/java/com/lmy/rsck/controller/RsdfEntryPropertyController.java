package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEntryPropertyFeignService;
import com.lmy.rsck.view.dto.RsdfEntryPropertyDto;
import com.lmy.rsck.view.query.RsdfEntryPropertyQuery;
import com.lmy.rsck.model.example.RsdfEntryProperty;
import com.lmy.rsck.service.RsdfEntryPropertyService;
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
 * 词条属性表(RsdfEntryProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEntryPropertyController implements RsdfEntryPropertyFeignService{
    
    @Autowired
    private RsdfEntryPropertyService rsdfEntryPropertyService;
    
    @Override
    public ResultData<RsdfEntryPropertyDto> insert(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto){
        RsdfEntryProperty rsdfEntryProperty = BeanUtils.copyProperties(rsdfEntryPropertyDto,RsdfEntryProperty.class);
        RsdfEntryProperty result = rsdfEntryPropertyService.insertSelective(rsdfEntryProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEntryPropertyDto.class));
    }

    @Override
    public ResultData<RsdfEntryPropertyDto> update(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto){
        Assert.isNotNull(rsdfEntryPropertyDto.getId(),"id不能为空");
        RsdfEntryProperty rsdfEntryProperty = BeanUtils.copyProperties(rsdfEntryPropertyDto,RsdfEntryProperty.class);
        RsdfEntryProperty result = rsdfEntryPropertyService.updateByPrimaryKeySelective( rsdfEntryProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEntryPropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto){
    //      RsdfEntryProperty rsdfEntryProperty = BeanUtils.copyProperties(rsdfEntryPropertyDto,RsdfEntryProperty.class);
    //      rsdfEntryPropertyService.deleteByPrimaryKey( rsdfEntryProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEntryPropertyDto> get(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto){
        Assert.isNotNull(rsdfEntryPropertyDto.getId(),"id不能为空");
        RsdfEntryProperty result = rsdfEntryPropertyService.getByPrimaryKey(rsdfEntryPropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEntryPropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEntryPropertyDto>> getList(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
        List<RsdfEntryProperty> rsdfEntryPropertyList = rsdfEntryPropertyService.getList( rsdfEntryPropertyQuery);
        if(CollectionUtils.isEmpty( rsdfEntryPropertyList)){
            ResultData.success(new ArrayList<RsdfEntryPropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEntryPropertyList,RsdfEntryPropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
        Page page = rsdfEntryPropertyService.getListWithPage( rsdfEntryPropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEntryPropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
        Integer count = rsdfEntryPropertyService.getCount( rsdfEntryPropertyQuery);
        return ResultData.success(count);
    }
}