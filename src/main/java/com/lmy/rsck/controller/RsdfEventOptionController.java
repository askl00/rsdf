package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfEventOptionFeignService;
import com.lmy.rsck.view.dto.RsdfEventOptionDto;
import com.lmy.rsck.view.query.RsdfEventOptionQuery;
import com.lmy.rsck.model.example.RsdfEventOption;
import com.lmy.rsck.service.RsdfEventOptionService;
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
 * 事件选项(RsdfEventOption)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfEventOptionController implements RsdfEventOptionFeignService{
    
    @Autowired
    private RsdfEventOptionService rsdfEventOptionService;
    
    @Override
    public ResultData<RsdfEventOptionDto> insert(@RequestBody RsdfEventOptionDto rsdfEventOptionDto){
        RsdfEventOption rsdfEventOption = BeanUtils.copyProperties(rsdfEventOptionDto,RsdfEventOption.class);
        RsdfEventOption result = rsdfEventOptionService.insertSelective(rsdfEventOption);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfEventOptionDto.class));
    }

    @Override
    public ResultData<RsdfEventOptionDto> update(@RequestBody RsdfEventOptionDto rsdfEventOptionDto){
        Assert.isNotNull(rsdfEventOptionDto.getId(),"id不能为空");
        RsdfEventOption rsdfEventOption = BeanUtils.copyProperties(rsdfEventOptionDto,RsdfEventOption.class);
        RsdfEventOption result = rsdfEventOptionService.updateByPrimaryKeySelective( rsdfEventOption);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventOptionDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfEventOptionDto rsdfEventOptionDto){
    //      RsdfEventOption rsdfEventOption = BeanUtils.copyProperties(rsdfEventOptionDto,RsdfEventOption.class);
    //      rsdfEventOptionService.deleteByPrimaryKey( rsdfEventOption);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfEventOptionDto> get(@RequestBody RsdfEventOptionDto rsdfEventOptionDto){
        Assert.isNotNull(rsdfEventOptionDto.getId(),"id不能为空");
        RsdfEventOption result = rsdfEventOptionService.getByPrimaryKey(rsdfEventOptionDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfEventOptionDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfEventOptionDto>> getList(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery){
        List<RsdfEventOption> rsdfEventOptionList = rsdfEventOptionService.getList( rsdfEventOptionQuery);
        if(CollectionUtils.isEmpty( rsdfEventOptionList)){
            ResultData.success(new ArrayList<RsdfEventOptionDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfEventOptionList,RsdfEventOptionDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery){
        Page page = rsdfEventOptionService.getListWithPage( rsdfEventOptionQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfEventOptionDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery){
        Integer count = rsdfEventOptionService.getCount( rsdfEventOptionQuery);
        return ResultData.success(count);
    }
}