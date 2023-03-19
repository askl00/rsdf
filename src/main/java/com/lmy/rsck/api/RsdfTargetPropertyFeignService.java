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
import com.lmy.rsck.view.dto.RsdfTargetPropertyDto;
import com.lmy.rsck.view.query.RsdfTargetPropertyQuery;
/**
 * 目标-所需属性表(RsdfTargetProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfTargetPropertyFeignService.RsdfTargetPropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfTargetProperty")
public interface RsdfTargetPropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfTargetPropertyDto
     * @return RsdfTargetPropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfTargetPropertyDto> insert(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfTargetPropertyDto
     * @return RsdfTargetPropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfTargetPropertyDto> update(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfTargetPropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfTargetPropertyDto
     * @return RsdfTargetPropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfTargetPropertyDto> get(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfTargetPropertyQuery
     * @return List<RsdfTargetPropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfTargetPropertyDto>> getList(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfTargetPropertyQuery
     * @return Page<RsdfTargetPropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfTargetPropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfTargetPropertyFeignServiceFallBack implements RsdfTargetPropertyFeignService {
        @Override
        public ResultData<RsdfTargetPropertyDto> insert(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfTargetPropertyDto> update(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfTargetPropertyDto> get(@RequestBody RsdfTargetPropertyDto rsdfTargetPropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfTargetPropertyDto>> getList(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfTargetPropertyQuery rsdfTargetPropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}