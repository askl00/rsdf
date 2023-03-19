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
import com.lmy.rsck.model.example.RsdfEventTargetProbability;
import com.lmy.rsck.model.example.RsdfEventTargetProbabilityExample;
import com.lmy.rsck.mapper.RsdfEventTargetProbabilityMapper;
import com.lmy.rsck.view.query.RsdfEventTargetProbabilityQuery;
import com.lmy.rsck.service.RsdfEventTargetProbabilityService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 事件-目标概率表(RsdfEventTargetProbability)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEventTargetProbabilityServiceImpl extends ServiceImpl<RsdfEventTargetProbabilityMapper, RsdfEventTargetProbability> implements RsdfEventTargetProbabilityService{

    @Autowired
    private RsdfEventTargetProbabilityMapper rsdfEventTargetProbabilityMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEventTargetProbability rsdfEventTargetProbability = getByPrimaryKey(id);
        if(rsdfEventTargetProbability!=null) {
            return rsdfEventTargetProbabilityMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEventTargetProbability insertSelective(RsdfEventTargetProbability rsdfEventTargetProbability) {
        if(rsdfEventTargetProbability.getCreatedAt()==null){
            rsdfEventTargetProbability.setCreatedAt(new Date());
        }
        int index = rsdfEventTargetProbabilityMapper.insert(rsdfEventTargetProbability);
        if(index!=0){
            return rsdfEventTargetProbability;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEventTargetProbability对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEventTargetProbability getByPrimaryKey(Long id) {
        RsdfEventTargetProbability result = rsdfEventTargetProbabilityMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEventTargetProbability selectOne(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery) {
        RsdfEventTargetProbability result = rsdfEventTargetProbabilityMapper.selectOne(RsdfEventTargetProbabilityExample.getWrapper(rsdfEventTargetProbabilityQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEventTargetProbability updateByPrimaryKeySelective(RsdfEventTargetProbability rsdfEventTargetProbability) {
        if(rsdfEventTargetProbability.getUpdatedAt()==null){
            rsdfEventTargetProbability.setUpdatedAt(new Date());
        }
        int result = rsdfEventTargetProbabilityMapper.updateById(rsdfEventTargetProbability);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEventTargetProbability.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEventTargetProbability> getList(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery) {
        List<RsdfEventTargetProbability> rsdfEventTargetProbabilityList = rsdfEventTargetProbabilityMapper.selectList(RsdfEventTargetProbabilityExample.getWrapper(rsdfEventTargetProbabilityQuery));
        return rsdfEventTargetProbabilityList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEventTargetProbability> getListWithPage(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery) {
        page(rsdfEventTargetProbabilityQuery,RsdfEventTargetProbabilityExample.getWrapper(rsdfEventTargetProbabilityQuery));
        return Page.build(rsdfEventTargetProbabilityQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery) {
        int count = rsdfEventTargetProbabilityMapper.selectCount(RsdfEventTargetProbabilityExample.getWrapper(rsdfEventTargetProbabilityQuery));
        return count;
    }
}