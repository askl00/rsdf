package com.lmy.rsck.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheers.micro.common.vo.exception.BusinessException;
import com.cheers.micro.common.vo.exception.DatasourceException;
import com.cheers.micro.common.vo.exception.ErrorCode;
import com.cheers.micro.common.vo.model.ResultData;
import com.cheers.micro.common.vo.utils.*;
import com.cheers.micro.datasource.module.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lmy.rsck.model.example.RsdfEventProbability;
import com.lmy.rsck.model.example.RsdfEventProbabilityExample;
import com.lmy.rsck.mapper.RsdfEventProbabilityMapper;
import com.lmy.rsck.view.query.RsdfEventProbabilityQuery;
import com.lmy.rsck.service.RsdfEventProbabilityService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 事件概率表(RsdfEventProbability)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEventProbabilityServiceImpl extends ServiceImpl<RsdfEventProbabilityMapper, RsdfEventProbability> implements RsdfEventProbabilityService{

    @Autowired
    private RsdfEventProbabilityMapper rsdfEventProbabilityMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEventProbability rsdfEventProbability = getByPrimaryKey(id);
        if(rsdfEventProbability!=null) {
            return rsdfEventProbabilityMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEventProbability insertSelective(RsdfEventProbability rsdfEventProbability) {
        if(rsdfEventProbability.getCreatedAt()==null){
            rsdfEventProbability.setCreatedAt(new Date());
        }
        int index = rsdfEventProbabilityMapper.insert(rsdfEventProbability);
        if(index!=0){
            return rsdfEventProbability;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEventProbability对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEventProbability getByPrimaryKey(Long id) {
        RsdfEventProbability result = rsdfEventProbabilityMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEventProbability selectOne(RsdfEventProbabilityQuery rsdfEventProbabilityQuery) {
        RsdfEventProbability result = rsdfEventProbabilityMapper.selectOne(RsdfEventProbabilityExample.getWrapper(rsdfEventProbabilityQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEventProbability updateByPrimaryKeySelective(RsdfEventProbability rsdfEventProbability) {
        if(rsdfEventProbability.getUpdatedAt()==null){
            rsdfEventProbability.setUpdatedAt(new Date());
        }
        int result = rsdfEventProbabilityMapper.updateById(rsdfEventProbability);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEventProbability.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEventProbability> getList(RsdfEventProbabilityQuery rsdfEventProbabilityQuery) {
        List<RsdfEventProbability> rsdfEventProbabilityList = rsdfEventProbabilityMapper.selectList(RsdfEventProbabilityExample.getWrapper(rsdfEventProbabilityQuery));
        return rsdfEventProbabilityList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEventProbability> getListWithPage(RsdfEventProbabilityQuery rsdfEventProbabilityQuery) {
        page(rsdfEventProbabilityQuery,RsdfEventProbabilityExample.getWrapper(rsdfEventProbabilityQuery));
        return Page.build(rsdfEventProbabilityQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEventProbabilityQuery rsdfEventProbabilityQuery) {
        int count = rsdfEventProbabilityMapper.selectCount(RsdfEventProbabilityExample.getWrapper(rsdfEventProbabilityQuery));
        return count;
    }
}