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
import com.lmy.rsck.view.dto.RsdfGamePropertyDto;
import com.lmy.rsck.view.query.RsdfGamePropertyQuery;
/**
 * 游戏人物属性表(RsdfGameProperty)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfGamePropertyFeignService.RsdfGamePropertyFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfGameProperty")
public interface RsdfGamePropertyFeignService {
    /**
     * 插入一条数据
     * @param rsdfGamePropertyDto
     * @return RsdfGamePropertyDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfGamePropertyDto> insert(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfGamePropertyDto
     * @return RsdfGamePropertyDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfGamePropertyDto> update(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfGamePropertyDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfGamePropertyDto
     * @return RsdfGamePropertyDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfGamePropertyDto> get(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfGamePropertyQuery
     * @return List<RsdfGamePropertyDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfGamePropertyDto>> getList(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfGamePropertyQuery
     * @return Page<RsdfGamePropertyDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfGamePropertyQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery);
    
    /**
     * 熔断器
     */
    class RsdfGamePropertyFeignServiceFallBack implements RsdfGamePropertyFeignService {
        @Override
        public ResultData<RsdfGamePropertyDto> insert(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfGamePropertyDto> update(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfGamePropertyDto> get(@RequestBody RsdfGamePropertyDto rsdfGamePropertyDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfGamePropertyDto>> getList(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfGamePropertyQuery rsdfGamePropertyQuery){
            return ResultData.fail("连接超时");
        }
    }
}