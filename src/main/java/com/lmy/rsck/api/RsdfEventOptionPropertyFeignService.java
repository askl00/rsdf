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
import com.lmy.rsck.view.dto.RsdfEventOptionPropertyDto;
import com.lmy.rsck.view.query.RsdfEventOptionPropertyQuery;
/**
 * 事件-属性变动表(RsdfEventOptionProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEventOptionPropertyFeignService.RsdfEventOptionPropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEventOptionProperty")
public interface RsdfEventOptionPropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfEventOptionPropertyDto
     * @return RsdfEventOptionPropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEventOptionPropertyDto> insert(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEventOptionPropertyDto
     * @return RsdfEventOptionPropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEventOptionPropertyDto> update(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEventOptionPropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEventOptionPropertyDto
     * @return RsdfEventOptionPropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEventOptionPropertyDto> get(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEventOptionPropertyQuery
     * @return List<RsdfEventOptionPropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEventOptionPropertyDto>> getList(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEventOptionPropertyQuery
     * @return Page<RsdfEventOptionPropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEventOptionPropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfEventOptionPropertyFeignServiceFallBack implements RsdfEventOptionPropertyFeignService {
        @Override
        public ResultData<RsdfEventOptionPropertyDto> insert(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEventOptionPropertyDto> update(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEventOptionPropertyDto> get(@RequestBody RsdfEventOptionPropertyDto rsdfEventOptionPropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEventOptionPropertyDto>> getList(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}