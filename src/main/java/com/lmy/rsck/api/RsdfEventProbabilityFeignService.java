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
import com.lmy.rsck.view.dto.RsdfEventProbabilityDto;
import com.lmy.rsck.view.query.RsdfEventProbabilityQuery;
/**
 * 事件概率表(RsdfEventProbability)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEventProbabilityFeignService.RsdfEventProbabilityFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEventProbability")
public interface RsdfEventProbabilityFeignService {
    /**
     * 插入一条数据
     * @param rsdfEventProbabilityDto
     * @return RsdfEventProbabilityDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEventProbabilityDto> insert(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEventProbabilityDto
     * @return RsdfEventProbabilityDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEventProbabilityDto> update(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEventProbabilityDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEventProbabilityDto
     * @return RsdfEventProbabilityDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEventProbabilityDto> get(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEventProbabilityQuery
     * @return List<RsdfEventProbabilityDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEventProbabilityDto>> getList(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEventProbabilityQuery
     * @return Page<RsdfEventProbabilityDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEventProbabilityQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
    
    /**
     * 熔断器
     */
    class RsdfEventProbabilityFeignServiceFallBack implements RsdfEventProbabilityFeignService {
        @Override
        public ResultData<RsdfEventProbabilityDto> insert(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEventProbabilityDto> update(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEventProbabilityDto> get(@RequestBody RsdfEventProbabilityDto rsdfEventProbabilityDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEventProbabilityDto>> getList(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEventProbabilityQuery rsdfEventProbabilityQuery){
            return ResultData.fail("连接超时");
        }
    }
}