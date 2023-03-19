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
import com.lmy.rsck.view.dto.RsdfTimeDto;
import com.lmy.rsck.view.query.RsdfTimeQuery;
/**
 * 时间(RsdfTime)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfTimeFeignService.RsdfTimeFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfTime")
public interface RsdfTimeFeignService {
    /**
     * 插入一条数据
     * @param rsdfTimeDto
     * @return RsdfTimeDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfTimeDto> insert(@RequestBody RsdfTimeDto rsdfTimeDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfTimeDto
     * @return RsdfTimeDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfTimeDto> update(@RequestBody RsdfTimeDto rsdfTimeDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfTimeDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfTimeDto rsdfTimeDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfTimeDto
     * @return RsdfTimeDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfTimeDto> get(@RequestBody RsdfTimeDto rsdfTimeDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfTimeQuery
     * @return List<RsdfTimeDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfTimeDto>> getList(@RequestBody RsdfTimeQuery rsdfTimeQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfTimeQuery
     * @return Page<RsdfTimeDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfTimeQuery rsdfTimeQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfTimeQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfTimeQuery rsdfTimeQuery);
    
    /**
     * 熔断器
     */
    class RsdfTimeFeignServiceFallBack implements RsdfTimeFeignService {
        @Override
        public ResultData<RsdfTimeDto> insert(@RequestBody RsdfTimeDto rsdfTimeDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfTimeDto> update(@RequestBody RsdfTimeDto rsdfTimeDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfTimeDto rsdfTimeDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfTimeDto> get(@RequestBody RsdfTimeDto rsdfTimeDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfTimeDto>> getList(@RequestBody RsdfTimeQuery rsdfTimeQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfTimeQuery rsdfTimeQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfTimeQuery rsdfTimeQuery){
            return ResultData.fail("连接超时");
        }
    }
}