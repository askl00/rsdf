package com.lmy.rsck.controller;

import lombok.extern.slf4j.Slf4j;
import com.lmy.rsck.api.RsdfGameFeignService;
import com.lmy.rsck.view.dto.RsdfGameDto;
import com.lmy.rsck.view.query.RsdfGameQuery;
import com.lmy.rsck.model.example.RsdfGame;
import com.lmy.rsck.service.RsdfGameService;
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
 * 游戏（记录）表(RsdfGame)Controller
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@RestController
public class RsdfGameController implements RsdfGameFeignService{
    
    @Autowired
    private RsdfGameService rsdfGameService;
    
    @Override
    public ResultData<RsdfGameDto> insert(@RequestBody RsdfGameDto rsdfGameDto){
        RsdfGame rsdfGame = BeanUtils.copyProperties(rsdfGameDto,RsdfGame.class);
        RsdfGame result = rsdfGameService.insertSelective(rsdfGame);
        return ResultData.success(BeanUtils.copyProperties(result,RsdfGameDto.class));
    }

    @Override
    public ResultData<RsdfGameDto> update(@RequestBody RsdfGameDto rsdfGameDto){
        Assert.isNotNull(rsdfGameDto.getId(),"id不能为空");
        RsdfGame rsdfGame = BeanUtils.copyProperties(rsdfGameDto,RsdfGame.class);
        RsdfGame result = rsdfGameService.updateByPrimaryKeySelective( rsdfGame);
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameDto.class));
        }
        return ResultData.fail();
    }

    // @Override
    // public ResultData delete(@RequestBody RsdfGameDto rsdfGameDto){
    //      RsdfGame rsdfGame = BeanUtils.copyProperties(rsdfGameDto,RsdfGame.class);
    //      rsdfGameService.deleteByPrimaryKey( rsdfGame);
    //      return Result.success();
    // }

    @Override
    public ResultData<RsdfGameDto> get(@RequestBody RsdfGameDto rsdfGameDto){
        Assert.isNotNull(rsdfGameDto.getId(),"id不能为空");
        RsdfGame result = rsdfGameService.getByPrimaryKey(rsdfGameDto.getId());
        if(result!=null){
            return ResultData.success(BeanUtils.copyProperties(result,RsdfGameDto.class));
        }
        return ResultData.success();
    }

    @Override 
    public ResultData<List<RsdfGameDto>> getList(@RequestBody RsdfGameQuery rsdfGameQuery){
        List<RsdfGame> rsdfGameList = rsdfGameService.getList( rsdfGameQuery);
        if(CollectionUtils.isEmpty( rsdfGameList)){
            ResultData.success(new ArrayList<RsdfGameDto>());
        }
        return ResultData.success(BeanUtils.copyList( rsdfGameList,RsdfGameDto.class));
    }

    @Override
    public ResultData<Page> getListWithPage(@RequestBody RsdfGameQuery rsdfGameQuery){
        Page page = rsdfGameService.getListWithPage( rsdfGameQuery);
        if(CollectionUtils.isEmpty(page.getList())){
            ResultData.success(page);
        }
        page.setList(BeanUtils.copyList(page.getList(),RsdfGameDto.class));
        return ResultData.success(page);
    }

    @Override
    public ResultData<Integer> getCount(@RequestBody RsdfGameQuery rsdfGameQuery){
        Integer count = rsdfGameService.getCount( rsdfGameQuery);
        return ResultData.success(count);
    }
}