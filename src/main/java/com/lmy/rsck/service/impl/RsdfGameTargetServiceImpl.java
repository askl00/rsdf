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
import com.lmy.rsck.model.example.RsdfGameTarget;
import com.lmy.rsck.model.example.RsdfGameTargetExample;
import com.lmy.rsck.mapper.RsdfGameTargetMapper;
import com.lmy.rsck.view.query.RsdfGameTargetQuery;
import com.lmy.rsck.service.RsdfGameTargetService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 游戏目标表(RsdfGameTarget)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@Service
@Transactional
public class RsdfGameTargetServiceImpl extends ServiceImpl<RsdfGameTargetMapper, RsdfGameTarget> implements RsdfGameTargetService{

    @Autowired
    private RsdfGameTargetMapper rsdfGameTargetMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfGameTarget rsdfGameTarget = getByPrimaryKey(id);
        if(rsdfGameTarget!=null) {
            return rsdfGameTargetMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfGameTarget insertSelective(RsdfGameTarget rsdfGameTarget) {
        if(rsdfGameTarget.getCreatedAt()==null){
            rsdfGameTarget.setCreatedAt(new Date());
        }
        int index = rsdfGameTargetMapper.insert(rsdfGameTarget);
        if(index!=0){
            return rsdfGameTarget;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfGameTarget对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfGameTarget getByPrimaryKey(Long id) {
        RsdfGameTarget result = rsdfGameTargetMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfGameTarget selectOne(RsdfGameTargetQuery rsdfGameTargetQuery) {
        RsdfGameTarget result = rsdfGameTargetMapper.selectOne(RsdfGameTargetExample.getWrapper(rsdfGameTargetQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfGameTarget updateByPrimaryKeySelective(RsdfGameTarget rsdfGameTarget) {
        if(rsdfGameTarget.getUpdatedAt()==null){
            rsdfGameTarget.setUpdatedAt(new Date());
        }
        int result = rsdfGameTargetMapper.updateById(rsdfGameTarget);
        if(result==0)return null;
        return getByPrimaryKey(rsdfGameTarget.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfGameTarget> getList(RsdfGameTargetQuery rsdfGameTargetQuery) {
        List<RsdfGameTarget> rsdfGameTargetList = rsdfGameTargetMapper.selectList(RsdfGameTargetExample.getWrapper(rsdfGameTargetQuery));
        return rsdfGameTargetList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfGameTarget> getListWithPage(RsdfGameTargetQuery rsdfGameTargetQuery) {
        page(rsdfGameTargetQuery,RsdfGameTargetExample.getWrapper(rsdfGameTargetQuery));
        return Page.build(rsdfGameTargetQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfGameTargetQuery rsdfGameTargetQuery) {
        int count = rsdfGameTargetMapper.selectCount(RsdfGameTargetExample.getWrapper(rsdfGameTargetQuery));
        return count;
    }
}