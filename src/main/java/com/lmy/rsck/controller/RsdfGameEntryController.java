package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfGameEntryFeignService;
import com.lmy.rsck.view.dto.RsdfGameEntryDto;
import com.lmy.rsck.view.query.RsdfGameEntryQuery;
import com.lmy.rsck.model.example.RsdfGameEntry;
import com.lmy.rsck.service.RsdfGameEntryService;
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
 * 游戏词条表(RsdfGameEntry)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfGameEntryController implements RsdfGameEntryFeignService{
    
    @Autowired
    private RsdfGameEntryService rsdfGameEntryService;
    
    @Override
    public ResultData<RsdfGameEntryDto> insert(@RequestBody RsdfGameEntryDto rsdfGameEntryDto){
        RsdfGameEntry rsdfGameEntry = BeanUtils.copyProperties(rsdfGameEntryDto,RsdfGameEntry.class);
        RsdfGameEntry result = rsdfGameEntryService.insertSelective(rsdfGameEntry);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfGameEntryDto.class));
    }

    @Override
    public ResultData<RsdfGameEntryDto> update(@RequestBody RsdfGameEntryDto rsdfGameEntryDto){
        Assert.isNotNull(rsdfGameEntryDto.getId(),"id不能为空");
        RsdfGameEntry rsdfGameEntry = BeanUtils.copyProperties(rsdfGameEntryDto,RsdfGameEntry.class);
        RsdfGameEntry result = rsdfGameEntryService.updateByPrimaryKeySelective( rsdfGameEntry);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameEntryDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfGameEntryDto rsdfGameEntryDto){
    //      RsdfGameEntry rsdfGameEntry = BeanUtils.copyProperties(rsdfGameEntryDto,RsdfGameEntry.class);
    //      rsdfGameEntryService.deleteByPrimaryKey( rsdfGameEntry);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfGameEntryDto> get(@RequestBody RsdfGameEntryDto rsdfGameEntryDto){
        Assert.isNotNull(rsdfGameEntryDto.getId(),"id不能为空");
        RsdfGameEntry result = rsdfGameEntryService.getByPrimaryKey(rsdfGameEntryDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameEntryDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfGameEntryDto>> getList(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery){
        List<RsdfGameEntry> rsdfGameEntryList = rsdfGameEntryService.getList( rsdfGameEntryQuery);
        if(CollectionUtils.isEmpty( rsdfGameEntryList)){
            ResultData.success(new ArrayList<RsdfGameEntryDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfGameEntryList,RsdfGameEntryDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery){
        Page page = rsdfGameEntryService.getListWithPage( rsdfGameEntryQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfGameEntryDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery){
        Integer count = rsdfGameEntryService.getCount( rsdfGameEntryQuery);
        return ResultData.success(count);
    }
}