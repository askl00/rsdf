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
import com.lmy.rsck.view.dto.RsdfGameTargetDto;
import com.lmy.rsck.view.query.RsdfGameTargetQuery;
/**
 * 游戏目标表(RsdfGameTarget)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfGameTargetFeignService.RsdfGameTargetFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfGameTarget")
public interface RsdfGameTargetFeignService {
    /**
     * 插入一条数据
     * @param rsdfGameTargetDto
     * @return RsdfGameTargetDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfGameTargetDto> insert(@RequestBody RsdfGameTargetDto rsdfGameTargetDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfGameTargetDto
     * @return RsdfGameTargetDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfGameTargetDto> update(@RequestBody RsdfGameTargetDto rsdfGameTargetDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfGameTargetDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfGameTargetDto rsdfGameTargetDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfGameTargetDto
     * @return RsdfGameTargetDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfGameTargetDto> get(@RequestBody RsdfGameTargetDto rsdfGameTargetDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfGameTargetQuery
     * @return List<RsdfGameTargetDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfGameTargetDto>> getList(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfGameTargetQuery
     * @return Page<RsdfGameTargetDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfGameTargetQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery);
    
    /**
     * 熔断器
     */
    class RsdfGameTargetFeignServiceFallBack implements RsdfGameTargetFeignService {
        @Override
        public ResultData<RsdfGameTargetDto> insert(@RequestBody RsdfGameTargetDto rsdfGameTargetDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfGameTargetDto> update(@RequestBody RsdfGameTargetDto rsdfGameTargetDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfGameTargetDto rsdfGameTargetDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfGameTargetDto> get(@RequestBody RsdfGameTargetDto rsdfGameTargetDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfGameTargetDto>> getList(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfGameTargetQuery rsdfGameTargetQuery){
            return ResultData.fail("连接超时");
        }
    }
}