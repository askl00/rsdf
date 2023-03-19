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
import com.lmy.rsck.view.dto.RsdfTargetDto;
import com.lmy.rsck.view.query.RsdfTargetQuery;
/**
 * 目标表(RsdfTarget)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfTargetFeignService.RsdfTargetFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfTarget")
public interface RsdfTargetFeignService {
    /**
     * 插入一条数据
     * @param rsdfTargetDto
     * @return RsdfTargetDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfTargetDto> insert(@RequestBody RsdfTargetDto rsdfTargetDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfTargetDto
     * @return RsdfTargetDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfTargetDto> update(@RequestBody RsdfTargetDto rsdfTargetDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfTargetDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfTargetDto rsdfTargetDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfTargetDto
     * @return RsdfTargetDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfTargetDto> get(@RequestBody RsdfTargetDto rsdfTargetDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfTargetQuery
     * @return List<RsdfTargetDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfTargetDto>> getList(@RequestBody RsdfTargetQuery rsdfTargetQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfTargetQuery
     * @return Page<RsdfTargetDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfTargetQuery rsdfTargetQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfTargetQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfTargetQuery rsdfTargetQuery);
    
    /**
     * 熔断器
     */
    class RsdfTargetFeignServiceFallBack implements RsdfTargetFeignService {
        @Override
        public ResultData<RsdfTargetDto> insert(@RequestBody RsdfTargetDto rsdfTargetDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfTargetDto> update(@RequestBody RsdfTargetDto rsdfTargetDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfTargetDto rsdfTargetDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfTargetDto> get(@RequestBody RsdfTargetDto rsdfTargetDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfTargetDto>> getList(@RequestBody RsdfTargetQuery rsdfTargetQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfTargetQuery rsdfTargetQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfTargetQuery rsdfTargetQuery){
            return ResultData.fail("连接超时");
        }
    }
}