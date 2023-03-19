package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfGameTargetFeignService;
import com.lmy.rsck.view.dto.RsdfGameTargetDto;
import com.lmy.rsck.view.query.RsdfGameTargetQuery;
import com.lmy.rsck.model.example.RsdfGameTarget;
import com.lmy.rsck.service.RsdfGameTargetService;
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
 * 游戏目标表(RsdfGameTarget)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@RestController
public class RsdfGameTargetController implements RsdfGameTargetFeignService{
    
    @Autowired
    private RsdfGameTargetService rsdfGameTargetService;
    
    @Override
    public ResultData<RsdfGameTargetDto> insert(@RequestBody RsdfGameTargetDto rsdfGameTargetDto){
        RsdfGameTarget rsdfGameTarget = BeanUtils.copyProperties(rsdfGameTargetDto,RsdfGameTarget.class);
        RsdfGameTarget result = rsdfGameTargetService.insertSelective(rsdfGameTarget);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfGameTargetDto.class));
    }

    @Override
    public ResultData<RsdfGameTargetDto> update(@RequestBody RsdfGameTargetDto rsdfGameTargetDto){
        Assert.isNotNull(rsdfGameTargetDto.getId(),"id不能为空");
        RsdfGameTarget rsdfGameTarget = BeanUtils.copyProperties(rsdfGameTargetDto,RsdfGameTarget.class);
        RsdfGameTarget result = rsdfGameTargetService.updateByPrimaryKeySelective( rsdfGameTarget);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameTargetDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfGameTargetDto rsdfGameTargetDto){
    //      RsdfGameTarget rsdfGameTarget = BeanUtils.copyProperties(rsdfGameTargetDto,RsdfGameTarget.class);
    //      rsdfGameTargetService.deleteByPrimaryKey( rsdfGameTarget);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfGameTargetDto> get(@RequestBody RsdfGameTargetDto rsdfGameTargetDto){
        Assert.isNotNull(rsdfGameTargetDto.getId(),"id不能为空");
        RsdfGameTarget result = rsdfGameTargetService.getByPrimaryKey(rsdfGameTargetDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameTargetDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfGameTargetDto>> getList(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery){
        List<RsdfGameTarget> rsdfGameTargetList = rsdfGameTargetService.getList( rsdfGameTargetQuery);
        if(CollectionUtils.isEmpty( rsdfGameTargetList)){
            ResultData.success(new ArrayList<RsdfGameTargetDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfGameTargetList,RsdfGameTargetDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery){
        Page page = rsdfGameTargetService.getListWithPage( rsdfGameTargetQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfGameTargetDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery){
        Integer count = rsdfGameTargetService.getCount( rsdfGameTargetQuery);
        return ResultData.success(count);
    }
}