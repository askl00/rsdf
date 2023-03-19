package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfGamePropertyFeignService;
import com.lmy.rsck.view.dto.RsdfGamePropertyDto;
import com.lmy.rsck.view.query.RsdfGamePropertyQuery;
import com.lmy.rsck.model.example.RsdfGameProperty;
import com.lmy.rsck.service.RsdfGamePropertyService;
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
 * 游戏人物属性表(RsdfGameProperty)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfGamePropertyController implements RsdfGamePropertyFeignService{
    
    @Autowired
    private RsdfGamePropertyService rsdfGamePropertyService;
    
    @Override
    public ResultData<RsdfGamePropertyDto> insert(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto){
        RsdfGameProperty rsdfGameProperty = BeanUtils.copyProperties(rsdfGamePropertyDto,RsdfGameProperty.class);
        RsdfGameProperty result = rsdfGamePropertyService.insertSelective(rsdfGameProperty);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfGamePropertyDto.class));
    }

    @Override
    public ResultData<RsdfGamePropertyDto> update(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto){
        Assert.isNotNull(rsdfGamePropertyDto.getId(),"id不能为空");
        RsdfGameProperty rsdfGameProperty = BeanUtils.copyProperties(rsdfGamePropertyDto,RsdfGameProperty.class);
        RsdfGameProperty result = rsdfGamePropertyService.updateByPrimaryKeySelective( rsdfGameProperty);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGamePropertyDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto){
    //      RsdfGameProperty rsdfGameProperty = BeanUtils.copyProperties(rsdfGamePropertyDto,RsdfGameProperty.class);
    //      rsdfGamePropertyService.deleteByPrimaryKey( rsdfGameProperty);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfGamePropertyDto> get(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto){
        Assert.isNotNull(rsdfGamePropertyDto.getId(),"id不能为空");
        RsdfGameProperty result = rsdfGamePropertyService.getByPrimaryKey(rsdfGamePropertyDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGamePropertyDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfGamePropertyDto>> getList(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery){
        List<RsdfGameProperty> rsdfGamePropertyList = rsdfGamePropertyService.getList( rsdfGamePropertyQuery);
        if(CollectionUtils.isEmpty( rsdfGamePropertyList)){
            ResultData.success(new ArrayList<RsdfGamePropertyDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfGamePropertyList,RsdfGamePropertyDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery){
        Page page = rsdfGamePropertyService.getListWithPage( rsdfGamePropertyQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfGamePropertyDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery){
        Integer count = rsdfGamePropertyService.getCount( rsdfGamePropertyQuery);
        return ResultData.success(count);
    }
}