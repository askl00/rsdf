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
import com.lmy.rsck.view.dto.RsdfEntryDto;
import com.lmy.rsck.view.query.RsdfEntryQuery;
/**
 * 词条表(RsdfEntry)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:02
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEntryFeignService.RsdfEntryFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEntry")
public interface RsdfEntryFeignService {
    /**
     * 插入一条数据
     * @param rsdfEntryDto
     * @return RsdfEntryDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEntryDto> insert(@RequestBody RsdfEntryDto rsdfEntryDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEntryDto
     * @return RsdfEntryDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEntryDto> update(@RequestBody RsdfEntryDto rsdfEntryDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEntryDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEntryDto rsdfEntryDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEntryDto
     * @return RsdfEntryDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEntryDto> get(@RequestBody RsdfEntryDto rsdfEntryDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEntryQuery
     * @return List<RsdfEntryDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEntryDto>> getList(@RequestBody RsdfEntryQuery rsdfEntryQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEntryQuery
     * @return Page<RsdfEntryDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEntryQuery rsdfEntryQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEntryQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEntryQuery rsdfEntryQuery);
    
    /**
     * 熔断器
     */
    class RsdfEntryFeignServiceFallBack implements RsdfEntryFeignService {
        @Override
        public ResultData<RsdfEntryDto> insert(@RequestBody RsdfEntryDto rsdfEntryDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEntryDto> update(@RequestBody RsdfEntryDto rsdfEntryDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEntryDto rsdfEntryDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEntryDto> get(@RequestBody RsdfEntryDto rsdfEntryDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEntryDto>> getList(@RequestBody RsdfEntryQuery rsdfEntryQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEntryQuery rsdfEntryQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEntryQuery rsdfEntryQuery){
            return ResultData.fail("连接超时");
        }
    }
}