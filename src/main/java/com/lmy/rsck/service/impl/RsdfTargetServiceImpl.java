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
import com.lmy.rsck.model.example.RsdfTarget;
import com.lmy.rsck.model.example.RsdfTargetExample;
import com.lmy.rsck.mapper.RsdfTargetMapper;
import com.lmy.rsck.view.query.RsdfTargetQuery;
import com.lmy.rsck.service.RsdfTargetService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 目标表(RsdfTarget)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@Service
@Transactional
public class RsdfTargetServiceImpl extends ServiceImpl<RsdfTargetMapper, RsdfTarget> implements RsdfTargetService{

    @Autowired
    private RsdfTargetMapper rsdfTargetMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfTarget rsdfTarget = getByPrimaryKey(id);
        if(rsdfTarget!=null) {
            return rsdfTargetMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfTarget insertSelective(RsdfTarget rsdfTarget) {
        if(rsdfTarget.getCreatedAt()==null){
            rsdfTarget.setCreatedAt(new Date());
        }
        int index = rsdfTargetMapper.insert(rsdfTarget);
        if(index!=0){
            return rsdfTarget;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfTarget对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfTarget getByPrimaryKey(Long id) {
        RsdfTarget result = rsdfTargetMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfTarget selectOne(RsdfTargetQuery rsdfTargetQuery) {
        RsdfTarget result = rsdfTargetMapper.selectOne(RsdfTargetExample.getWrapper(rsdfTargetQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfTarget updateByPrimaryKeySelective(RsdfTarget rsdfTarget) {
        if(rsdfTarget.getUpdatedAt()==null){
            rsdfTarget.setUpdatedAt(new Date());
        }
        int result = rsdfTargetMapper.updateById(rsdfTarget);
        if(result==0)return null;
        return getByPrimaryKey(rsdfTarget.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfTarget> getList(RsdfTargetQuery rsdfTargetQuery) {
        List<RsdfTarget> rsdfTargetList = rsdfTargetMapper.selectList(RsdfTargetExample.getWrapper(rsdfTargetQuery));
        return rsdfTargetList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfTarget> getListWithPage(RsdfTargetQuery rsdfTargetQuery) {
        page(rsdfTargetQuery,RsdfTargetExample.getWrapper(rsdfTargetQuery));
        return Page.build(rsdfTargetQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfTargetQuery rsdfTargetQuery) {
        int count = rsdfTargetMapper.selectCount(RsdfTargetExample.getWrapper(rsdfTargetQuery));
        return count;
    }
}