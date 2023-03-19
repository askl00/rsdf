package com.lmy.rsck.api;

import java.util.List;
import com.cheers.micro.datasource.module.Page;
import com.cheers.micro.common.vo.feign.FeignConfiguration;
import com.cheers.micro.common.vo.model.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lmy.rsck.view.dto.RsdfGameDto;
import com.lmy.rsck.view.query.RsdfGameQuery;
/**
 * 游戏（记录）表(RsdfGame)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfGameFeignService.RsdfGameFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfGame")
public interface RsdfGameFeignService {
    /**
     * 插入一条数据
     * @param rsdfGameDto
     * @return RsdfGameDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfGameDto> insert(@RequestBody RsdfGameDto rsdfGameDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfGameDto
     * @return RsdfGameDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfGameDto> update(@RequestBody RsdfGameDto rsdfGameDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfGameDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfGameDto rsdfGameDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfGameDto
     * @return RsdfGameDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfGameDto> get(@RequestBody RsdfGameDto rsdfGameDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfGameQuery
     * @return List<RsdfGameDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfGameDto>> getList(@RequestBody RsdfGameQuery rsdfGameQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfGameQuery
     * @return Page<RsdfGameDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfGameQuery rsdfGameQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfGameQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfGameQuery rsdfGameQuery);
    
    /**
     * 熔断器
     */
    class RsdfGameFeignServiceFallBack implements RsdfGameFeignService {
        @Override
        public ResultData<RsdfGameDto> insert(@RequestBody RsdfGameDto rsdfGameDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfGameDto> update(@RequestBody RsdfGameDto rsdfGameDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfGameDto rsdfGameDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfGameDto> get(@RequestBody RsdfGameDto rsdfGameDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfGameDto>> getList(@RequestBody RsdfGameQuery rsdfGameQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfGameQuery rsdfGameQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfGameQuery rsdfGameQuery){
            return ResultData.fail("连接超时");
        }
    }
}