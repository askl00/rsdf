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
import com.lmy.rsck.view.dto.RsdfEventProbabilityPropertyDto;
import com.lmy.rsck.view.query.RsdfEventProbabilityPropertyQuery;
/**
 * 事件-属性概率表(RsdfEventProbabilityProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEventProbabilityPropertyFeignService.RsdfEventProbabilityPropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEventProbabilityProperty")
public interface RsdfEventProbabilityPropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfEventProbabilityPropertyDto
     * @return RsdfEventProbabilityPropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEventProbabilityPropertyDto> insert(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEventProbabilityPropertyDto
     * @return RsdfEventProbabilityPropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEventProbabilityPropertyDto> update(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEventProbabilityPropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEventProbabilityPropertyDto
     * @return RsdfEventProbabilityPropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEventProbabilityPropertyDto> get(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEventProbabilityPropertyQuery
     * @return List<RsdfEventProbabilityPropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEventProbabilityPropertyDto>> getList(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEventProbabilityPropertyQuery
     * @return Page<RsdfEventProbabilityPropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEventProbabilityPropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfEventProbabilityPropertyFeignServiceFallBack implements RsdfEventProbabilityPropertyFeignService {
        @Override
        public ResultData<RsdfEventProbabilityPropertyDto> insert(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEventProbabilityPropertyDto> update(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEventProbabilityPropertyDto> get(@RequestBody RsdfEventProbabilityPropertyDto rsdfEventProbabilityPropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEventProbabilityPropertyDto>> getList(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}