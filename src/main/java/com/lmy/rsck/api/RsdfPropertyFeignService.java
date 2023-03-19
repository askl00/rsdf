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
import com.lmy.rsck.view.dto.RsdfPropertyDto;
import com.lmy.rsck.view.query.RsdfPropertyQuery;
/**
 * 属性表(RsdfProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfPropertyFeignService.RsdfPropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfProperty")
public interface RsdfPropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfPropertyDto
     * @return RsdfPropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfPropertyDto> insert(@RequestBody RsdfPropertyDto rsdfPropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfPropertyDto
     * @return RsdfPropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfPropertyDto> update(@RequestBody RsdfPropertyDto rsdfPropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfPropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfPropertyDto rsdfPropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfPropertyDto
     * @return RsdfPropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfPropertyDto> get(@RequestBody RsdfPropertyDto rsdfPropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfPropertyQuery
     * @return List<RsdfPropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfPropertyDto>> getList(@RequestBody RsdfPropertyQuery rsdfPropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfPropertyQuery
     * @return Page<RsdfPropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfPropertyQuery rsdfPropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfPropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfPropertyQuery rsdfPropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfPropertyFeignServiceFallBack implements RsdfPropertyFeignService {
        @Override
        public ResultData<RsdfPropertyDto> insert(@RequestBody RsdfPropertyDto rsdfPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfPropertyDto> update(@RequestBody RsdfPropertyDto rsdfPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfPropertyDto rsdfPropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfPropertyDto> get(@RequestBody RsdfPropertyDto rsdfPropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfPropertyDto>> getList(@RequestBody RsdfPropertyQuery rsdfPropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfPropertyQuery rsdfPropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfPropertyQuery rsdfPropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}