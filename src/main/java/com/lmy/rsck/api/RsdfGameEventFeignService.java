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
import com.lmy.rsck.view.dto.RsdfGameEventDto;
import com.lmy.rsck.view.query.RsdfGameEventQuery;
/**
 * 游戏发生的事件表(RsdfGameEvent)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfGameEventFeignService.RsdfGameEventFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfGameEvent")
public interface RsdfGameEventFeignService {
    /**
     * 插入一条数据
     * @param rsdfGameEventDto
     * @return RsdfGameEventDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfGameEventDto> insert(@RequestBody RsdfGameEventDto rsdfGameEventDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfGameEventDto
     * @return RsdfGameEventDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfGameEventDto> update(@RequestBody RsdfGameEventDto rsdfGameEventDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfGameEventDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfGameEventDto rsdfGameEventDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfGameEventDto
     * @return RsdfGameEventDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfGameEventDto> get(@RequestBody RsdfGameEventDto rsdfGameEventDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfGameEventQuery
     * @return List<RsdfGameEventDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfGameEventDto>> getList(@RequestBody RsdfGameEventQuery rsdfGameEventQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfGameEventQuery
     * @return Page<RsdfGameEventDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfGameEventQuery rsdfGameEventQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfGameEventQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfGameEventQuery rsdfGameEventQuery);
    
    /**
     * 熔断器
     */
    class RsdfGameEventFeignServiceFallBack implements RsdfGameEventFeignService {
        @Override
        public ResultData<RsdfGameEventDto> insert(@RequestBody RsdfGameEventDto rsdfGameEventDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfGameEventDto> update(@RequestBody RsdfGameEventDto rsdfGameEventDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfGameEventDto rsdfGameEventDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfGameEventDto> get(@RequestBody RsdfGameEventDto rsdfGameEventDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfGameEventDto>> getList(@RequestBody RsdfGameEventQuery rsdfGameEventQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfGameEventQuery rsdfGameEventQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfGameEventQuery rsdfGameEventQuery){
            return ResultData.fail("连接超时");
        }
    }
}