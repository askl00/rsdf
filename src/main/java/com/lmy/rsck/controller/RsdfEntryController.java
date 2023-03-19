package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEntryFeignService;
import com.lmy.rsck.view.dto.RsdfEntryDto;
import com.lmy.rsck.view.query.RsdfEntryQuery;
import com.lmy.rsck.model.example.RsdfEntry;
import com.lmy.rsck.service.RsdfEntryService;
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
 * 词条表(RsdfEntry)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:02
 */
@Slf4j
@RestController
public class RsdfEntryController implements RsdfEntryFeignService{
    
    @Autowired
    private RsdfEntryService rsdfEntryService;
    
    @Override
    public ResultData<RsdfEntryDto> insert(@RequestBody RsdfEntryDto rsdfEntryDto){
        RsdfEntry rsdfEntry = BeanUtils.copyProperties(rsdfEntryDto,RsdfEntry.class);
        RsdfEntry result = rsdfEntryService.insertSelective(rsdfEntry);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEntryDto.class));
    }

    @Override
    public ResultData<RsdfEntryDto> update(@RequestBody RsdfEntryDto rsdfEntryDto){
        Assert.isNotNull(rsdfEntryDto.getId(),"id不能为空");
        RsdfEntry rsdfEntry = BeanUtils.copyProperties(rsdfEntryDto,RsdfEntry.class);
        RsdfEntry result = rsdfEntryService.updateByPrimaryKeySelective( rsdfEntry);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEntryDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEntryDto rsdfEntryDto){
    //      RsdfEntry rsdfEntry = BeanUtils.copyProperties(rsdfEntryDto,RsdfEntry.class);
    //      rsdfEntryService.deleteByPrimaryKey( rsdfEntry);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEntryDto> get(@RequestBody RsdfEntryDto rsdfEntryDto){
        Assert.isNotNull(rsdfEntryDto.getId(),"id不能为空");
        RsdfEntry result = rsdfEntryService.getByPrimaryKey(rsdfEntryDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEntryDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEntryDto>> getList(@RequestBody RsdfEntryQuery rsdfEntryQuery){
        List<RsdfEntry> rsdfEntryList = rsdfEntryService.getList( rsdfEntryQuery);
        if(CollectionUtils.isEmpty( rsdfEntryList)){
            ResultData.success(new ArrayList<RsdfEntryDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEntryList,RsdfEntryDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEntryQuery rsdfEntryQuery){
        Page page = rsdfEntryService.getListWithPage( rsdfEntryQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEntryDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEntryQuery rsdfEntryQuery){
        Integer count = rsdfEntryService.getCount( rsdfEntryQuery);
        return ResultData.success(count);
    }
}