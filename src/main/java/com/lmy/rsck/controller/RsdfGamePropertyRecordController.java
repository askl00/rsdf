package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfGamePropertyRecordFeignService;
import com.lmy.rsck.view.dto.RsdfGamePropertyRecordDto;
import com.lmy.rsck.view.query.RsdfGamePropertyRecordQuery;
import com.lmy.rsck.model.example.RsdfGamePropertyRecord;
import com.lmy.rsck.service.RsdfGamePropertyRecordService;
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
 * 属性变动记录表(RsdfGamePropertyRecord)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfGamePropertyRecordController implements RsdfGamePropertyRecordFeignService{
    
    @Autowired
    private RsdfGamePropertyRecordService rsdfGamePropertyRecordService;
    
    @Override
    public ResultData<RsdfGamePropertyRecordDto> insert(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto){
        RsdfGamePropertyRecord rsdfGamePropertyRecord = BeanUtils.copyProperties(rsdfGamePropertyRecordDto,RsdfGamePropertyRecord.class);
        RsdfGamePropertyRecord result = rsdfGamePropertyRecordService.insertSelective(rsdfGamePropertyRecord);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfGamePropertyRecordDto.class));
    }

    @Override
    public ResultData<RsdfGamePropertyRecordDto> update(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto){
        Assert.isNotNull(rsdfGamePropertyRecordDto.getId(),"id不能为空");
        RsdfGamePropertyRecord rsdfGamePropertyRecord = BeanUtils.copyProperties(rsdfGamePropertyRecordDto,RsdfGamePropertyRecord.class);
        RsdfGamePropertyRecord result = rsdfGamePropertyRecordService.updateByPrimaryKeySelective( rsdfGamePropertyRecord);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGamePropertyRecordDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto){
    //      RsdfGamePropertyRecord rsdfGamePropertyRecord = BeanUtils.copyProperties(rsdfGamePropertyRecordDto,RsdfGamePropertyRecord.class);
    //      rsdfGamePropertyRecordService.deleteByPrimaryKey( rsdfGamePropertyRecord);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfGamePropertyRecordDto> get(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto){
        Assert.isNotNull(rsdfGamePropertyRecordDto.getId(),"id不能为空");
        RsdfGamePropertyRecord result = rsdfGamePropertyRecordService.getByPrimaryKey(rsdfGamePropertyRecordDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGamePropertyRecordDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfGamePropertyRecordDto>> getList(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery){
        List<RsdfGamePropertyRecord> rsdfGamePropertyRecordList = rsdfGamePropertyRecordService.getList( rsdfGamePropertyRecordQuery);
        if(CollectionUtils.isEmpty( rsdfGamePropertyRecordList)){
            ResultData.success(new ArrayList<RsdfGamePropertyRecordDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfGamePropertyRecordList,RsdfGamePropertyRecordDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery){
        Page page = rsdfGamePropertyRecordService.getListWithPage( rsdfGamePropertyRecordQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfGamePropertyRecordDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery){
        Integer count = rsdfGamePropertyRecordService.getCount( rsdfGamePropertyRecordQuery);
        return ResultData.success(count);
    }
}