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
import com.lmy.rsck.view.dto.RsdfGameEntryDto;
import com.lmy.rsck.view.query.RsdfGameEntryQuery;
/**
 * 游戏词条表(RsdfGameEntry)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfGameEntryFeignService.RsdfGameEntryFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfGameEntry")
public interface RsdfGameEntryFeignService {
    /**
     * 插入一条数据
     * @param rsdfGameEntryDto
     * @return RsdfGameEntryDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfGameEntryDto> insert(@RequestBody RsdfGameEntryDto rsdfGameEntryDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfGameEntryDto
     * @return RsdfGameEntryDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfGameEntryDto> update(@RequestBody RsdfGameEntryDto rsdfGameEntryDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfGameEntryDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfGameEntryDto rsdfGameEntryDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfGameEntryDto
     * @return RsdfGameEntryDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfGameEntryDto> get(@RequestBody RsdfGameEntryDto rsdfGameEntryDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfGameEntryQuery
     * @return List<RsdfGameEntryDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfGameEntryDto>> getList(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfGameEntryQuery
     * @return Page<RsdfGameEntryDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfGameEntryQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery);
    
    /**
     * 熔断器
     */
    class RsdfGameEntryFeignServiceFallBack implements RsdfGameEntryFeignService {
        @Override
        public ResultData<RsdfGameEntryDto> insert(@RequestBody RsdfGameEntryDto rsdfGameEntryDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfGameEntryDto> update(@RequestBody RsdfGameEntryDto rsdfGameEntryDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfGameEntryDto rsdfGameEntryDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfGameEntryDto> get(@RequestBody RsdfGameEntryDto rsdfGameEntryDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfGameEntryDto>> getList(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfGameEntryQuery rsdfGameEntryQuery){
            return ResultData.fail("连接超时");
        }
    }
}