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
import com.lmy.rsck.view.dto.RsdfGamePropertyRecordDto;
import com.lmy.rsck.view.query.RsdfGamePropertyRecordQuery;
/**
 * 属性变动记录表(RsdfGamePropertyRecord)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfGamePropertyRecordFeignService.RsdfGamePropertyRecordFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfGamePropertyRecord")
public interface RsdfGamePropertyRecordFeignService {
    /**
     * 插入一条数据
     * @param rsdfGamePropertyRecordDto
     * @return RsdfGamePropertyRecordDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfGamePropertyRecordDto> insert(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfGamePropertyRecordDto
     * @return RsdfGamePropertyRecordDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfGamePropertyRecordDto> update(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfGamePropertyRecordDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfGamePropertyRecordDto
     * @return RsdfGamePropertyRecordDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfGamePropertyRecordDto> get(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfGamePropertyRecordQuery
     * @return List<RsdfGamePropertyRecordDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfGamePropertyRecordDto>> getList(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfGamePropertyRecordQuery
     * @return Page<RsdfGamePropertyRecordDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfGamePropertyRecordQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
    
    /**
     * 熔断器
     */
    class RsdfGamePropertyRecordFeignServiceFallBack implements RsdfGamePropertyRecordFeignService {
        @Override
        public ResultData<RsdfGamePropertyRecordDto> insert(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfGamePropertyRecordDto> update(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfGamePropertyRecordDto> get(@RequestBody RsdfGamePropertyRecordDto rsdfGamePropertyRecordDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfGamePropertyRecordDto>> getList(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery){
            return ResultData.fail("连接超时");
        }
    }
}