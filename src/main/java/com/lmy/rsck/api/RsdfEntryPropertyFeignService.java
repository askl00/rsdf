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
import com.lmy.rsck.view.dto.RsdfEntryPropertyDto;
import com.lmy.rsck.view.query.RsdfEntryPropertyQuery;
/**
 * 词条属性表(RsdfEntryProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEntryPropertyFeignService.RsdfEntryPropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEntryProperty")
public interface RsdfEntryPropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfEntryPropertyDto
     * @return RsdfEntryPropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEntryPropertyDto> insert(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEntryPropertyDto
     * @return RsdfEntryPropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEntryPropertyDto> update(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEntryPropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEntryPropertyDto
     * @return RsdfEntryPropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEntryPropertyDto> get(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEntryPropertyQuery
     * @return List<RsdfEntryPropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEntryPropertyDto>> getList(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEntryPropertyQuery
     * @return Page<RsdfEntryPropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEntryPropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfEntryPropertyFeignServiceFallBack implements RsdfEntryPropertyFeignService {
        @Override
        public ResultData<RsdfEntryPropertyDto> insert(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEntryPropertyDto> update(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEntryPropertyDto> get(@RequestBody RsdfEntryPropertyDto rsdfEntryPropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEntryPropertyDto>> getList(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEntryPropertyQuery rsdfEntryPropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}