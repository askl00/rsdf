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
import com.lmy.rsck.view.dto.RsdfUserPropertyDto;
import com.lmy.rsck.view.query.RsdfUserPropertyQuery;
/**
 * 人物属性表(RsdfUserProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfUserPropertyFeignService.RsdfUserPropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfUserProperty")
public interface RsdfUserPropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfUserPropertyDto
     * @return RsdfUserPropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfUserPropertyDto> insert(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfUserPropertyDto
     * @return RsdfUserPropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfUserPropertyDto> update(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfUserPropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfUserPropertyDto
     * @return RsdfUserPropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfUserPropertyDto> get(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfUserPropertyQuery
     * @return List<RsdfUserPropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfUserPropertyDto>> getList(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfUserPropertyQuery
     * @return Page<RsdfUserPropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfUserPropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfUserPropertyFeignServiceFallBack implements RsdfUserPropertyFeignService {
        @Override
        public ResultData<RsdfUserPropertyDto> insert(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfUserPropertyDto> update(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfUserPropertyDto> get(@RequestBody RsdfUserPropertyDto rsdfUserPropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfUserPropertyDto>> getList(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfUserPropertyQuery rsdfUserPropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}