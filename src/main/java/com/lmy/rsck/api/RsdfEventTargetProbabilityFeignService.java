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
import com.lmy.rsck.view.dto.RsdfEventTargetProbabilityDto;
import com.lmy.rsck.view.query.RsdfEventTargetProbabilityQuery;
/**
 * 事件-目标概率表(RsdfEventTargetProbability)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEventTargetProbabilityFeignService.RsdfEventTargetProbabilityFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEventTargetProbability")
public interface RsdfEventTargetProbabilityFeignService {
    /**
     * 插入一条数据
     * @param rsdfEventTargetProbabilityDto
     * @return RsdfEventTargetProbabilityDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEventTargetProbabilityDto> insert(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEventTargetProbabilityDto
     * @return RsdfEventTargetProbabilityDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEventTargetProbabilityDto> update(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEventTargetProbabilityDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEventTargetProbabilityDto
     * @return RsdfEventTargetProbabilityDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEventTargetProbabilityDto> get(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEventTargetProbabilityQuery
     * @return List<RsdfEventTargetProbabilityDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEventTargetProbabilityDto>> getList(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEventTargetProbabilityQuery
     * @return Page<RsdfEventTargetProbabilityDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEventTargetProbabilityQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
    
    /**
     * 熔断器
     */
    class RsdfEventTargetProbabilityFeignServiceFallBack implements RsdfEventTargetProbabilityFeignService {
        @Override
        public ResultData<RsdfEventTargetProbabilityDto> insert(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEventTargetProbabilityDto> update(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEventTargetProbabilityDto> get(@RequestBody RsdfEventTargetProbabilityDto rsdfEventTargetProbabilityDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEventTargetProbabilityDto>> getList(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery){
            return ResultData.fail("连接超时");
        }
    }
}