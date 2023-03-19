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
import com.lmy.rsck.view.dto.RsdfEventOptionDto;
import com.lmy.rsck.view.query.RsdfEventOptionQuery;
/**
 * 事件选项(RsdfEventOption)feign service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@FeignClient(
    value = "${serviceName}",
    fallback = RsdfEventOptionFeignService.RsdfEventOptionFeignServiceFallBack.class,
    configuration = FeignConfiguration.class
    //,url = "http://127.0.0.1:port"
)
@RequestMapping("/rsdfEventOption")
public interface RsdfEventOptionFeignService {
    /**
     * 插入一条数据
     * @param rsdfEventOptionDto
     * @return RsdfEventOptionDto
     */
    @PostMapping(value = "/insert", produces = "application/json")
    ResultData<RsdfEventOptionDto> insert(@RequestBody RsdfEventOptionDto rsdfEventOptionDto);
    
    /**
     * 根据主键更新数据
     * @param rsdfEventOptionDto
     * @return RsdfEventOptionDto
     */
    @PostMapping(value = "/update", produces = "application/json")
    ResultData<RsdfEventOptionDto> update(@RequestBody RsdfEventOptionDto rsdfEventOptionDto);
    
    /**
     * 根据主键删除数据
     * @param rsdfEventOptionDto
     * @return 
     */
    // @PostMapping(value = "/delete", produces = "application/json")
    // ResultData delete(@RequestBody RsdfEventOptionDto rsdfEventOptionDto);
    
    /**
     * 根据主键查询数据
     * @param rsdfEventOptionDto
     * @return RsdfEventOptionDto
     */
    @PostMapping(value = "/get", produces = "application/json")
    ResultData<RsdfEventOptionDto> get(@RequestBody RsdfEventOptionDto rsdfEventOptionDto);
    
    /**
     * 根据条件查询数据集合
     * @param rsdfEventOptionQuery
     * @return List<RsdfEventOptionDto>
     */
    @PostMapping(value = "/getList", produces = "application/json")
    ResultData<List<RsdfEventOptionDto>> getList(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery);
    
    /**
     * 根据条件查询数据并分页
     * @param rsdfEventOptionQuery
     * @return Page<RsdfEventOptionDto>
     */
    @PostMapping(value = "/getListWithPage", produces ="application/json")
    ResultData<Page> getListWithPage(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery);
    
    /**
     * 根据条件查询数据数量
     * @param rsdfEventOptionQuery
     * @return Integer
     */
    @PostMapping(value = "/getCount", produces = "application/json")
    ResultData<Integer> getCount(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery);
    
    /**
     * 熔断器
     */
    class RsdfEventOptionFeignServiceFallBack implements RsdfEventOptionFeignService {
        @Override
        public ResultData<RsdfEventOptionDto> insert(@RequestBody RsdfEventOptionDto rsdfEventOptionDto) {
            return ResultData.fail("连接超时");
        }
        
        @Override
        public ResultData<RsdfEventOptionDto> update(@RequestBody RsdfEventOptionDto rsdfEventOptionDto) {
            return ResultData.fail("连接超时");
        }
        
        // @Override
        // public ResultData delete(@RequestBody RsdfEventOptionDto rsdfEventOptionDto){
        //    return ResultData.fail("连接超时");
        //}
        
        @Override
        public ResultData<RsdfEventOptionDto> get(@RequestBody RsdfEventOptionDto rsdfEventOptionDto){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<List<RsdfEventOptionDto>> getList(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery){
            return ResultData.fail("连接超时");
        }
     
        @Override
        public ResultData<Page> getListWithPage(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery){
            return ResultData.fail("连接超时");
        }
    
        @Override
        public ResultData<Integer> getCount(@RequestBody RsdfEventOptionQuery rsdfEventOptionQuery){
            return ResultData.fail("连接超时");
        }
    }
}