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
import com.lmy.rsck.view.dto.RsdfEventDto;
import com.lmy.rsck.view.query.RsdfEventQuery;
/**
 * 事件(RsdfEvent)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEventFeignService.RsdfEventFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEvent")
public interface RsdfEventFeignService {
    /**
     * 插入一条数据
     * @param rsdfEventDto
     * @return RsdfEventDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEventDto> insert(@RequestBody RsdfEventDto rsdfEventDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEventDto
     * @return RsdfEventDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEventDto> update(@RequestBody RsdfEventDto rsdfEventDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEventDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEventDto rsdfEventDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEventDto
     * @return RsdfEventDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEventDto> get(@RequestBody RsdfEventDto rsdfEventDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEventQuery
     * @return List<RsdfEventDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEventDto>> getList(@RequestBody RsdfEventQuery rsdfEventQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEventQuery
     * @return Page<RsdfEventDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEventQuery rsdfEventQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEventQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEventQuery rsdfEventQuery);
    
    /**
     * 熔断器
     */
    class RsdfEventFeignServiceFallBack implements RsdfEventFeignService {
        @Override
        public ResultData<RsdfEventDto> insert(@RequestBody RsdfEventDto rsdfEventDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEventDto> update(@RequestBody RsdfEventDto rsdfEventDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEventDto rsdfEventDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEventDto> get(@RequestBody RsdfEventDto rsdfEventDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEventDto>> getList(@RequestBody RsdfEventQuery rsdfEventQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEventQuery rsdfEventQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEventQuery rsdfEventQuery){
            return ResultData.fail("连接超时");
        }
    }
}