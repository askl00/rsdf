package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfTargetFeignService;
import com.lmy.rsck.view.dto.RsdfTargetDto;
import com.lmy.rsck.view.query.RsdfTargetQuery;
import com.lmy.rsck.model.example.RsdfTarget;
import com.lmy.rsck.service.RsdfTargetService;
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
 * 目标表(RsdfTarget)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@RestController
public class RsdfTargetController implements RsdfTargetFeignService{
    
    @Autowired
    private RsdfTargetService rsdfTargetService;
    
    @Override
    public ResultData<RsdfTargetDto> insert(@RequestBody RsdfTargetDto rsdfTargetDto){
        RsdfTarget rsdfTarget = BeanUtils.copyProperties(rsdfTargetDto,RsdfTarget.class);
        RsdfTarget result = rsdfTargetService.insertSelective(rsdfTarget);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfTargetDto.class));
    }

    @Override
    public ResultData<RsdfTargetDto> update(@RequestBody RsdfTargetDto rsdfTargetDto){
        Assert.isNotNull(rsdfTargetDto.getId(),"id不能为空");
        RsdfTarget rsdfTarget = BeanUtils.copyProperties(rsdfTargetDto,RsdfTarget.class);
        RsdfTarget result = rsdfTargetService.updateByPrimaryKeySelective( rsdfTarget);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfTargetDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfTargetDto rsdfTargetDto){
    //      RsdfTarget rsdfTarget = BeanUtils.copyProperties(rsdfTargetDto,RsdfTarget.class);
    //      rsdfTargetService.deleteByPrimaryKey( rsdfTarget);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfTargetDto> get(@RequestBody RsdfTargetDto rsdfTargetDto){
        Assert.isNotNull(rsdfTargetDto.getId(),"id不能为空");
        RsdfTarget result = rsdfTargetService.getByPrimaryKey(rsdfTargetDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfTargetDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfTargetDto>> getList(@RequestBody RsdfTargetQuery rsdfTargetQuery){
        List<RsdfTarget> rsdfTargetList = rsdfTargetService.getList( rsdfTargetQuery);
        if(CollectionUtils.isEmpty( rsdfTargetList)){
            ResultData.success(new ArrayList<RsdfTargetDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfTargetList,RsdfTargetDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfTargetQuery rsdfTargetQuery){
        Page page = rsdfTargetService.getListWithPage( rsdfTargetQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfTargetDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfTargetQuery rsdfTargetQuery){
        Integer count = rsdfTargetService.getCount( rsdfTargetQuery);
        return ResultData.success(count);
    }
}