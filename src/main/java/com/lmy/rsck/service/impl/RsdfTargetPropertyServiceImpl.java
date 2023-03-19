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
import com.lmy.rsck.model.example.RsdfTargetProperty;
import com.lmy.rsck.model.example.RsdfTargetPropertyExample;
import com.lmy.rsck.mapper.RsdfTargetPropertyMapper;
import com.lmy.rsck.view.query.RsdfTargetPropertyQuery;
import com.lmy.rsck.service.RsdfTargetPropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 目标-所需属性表(RsdfTargetProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@Service
@Transactional
public class RsdfTargetPropertyServiceImpl extends ServiceImpl<RsdfTargetPropertyMapper, RsdfTargetProperty> implements RsdfTargetPropertyService{

    @Autowired
    private RsdfTargetPropertyMapper rsdfTargetPropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfTargetProperty rsdfTargetProperty = getByPrimaryKey(id);
        if(rsdfTargetProperty!=null) {
            return rsdfTargetPropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfTargetProperty insertSelective(RsdfTargetProperty rsdfTargetProperty) {
        if(rsdfTargetProperty.getCreatedAt()==null){
            rsdfTargetProperty.setCreatedAt(new Date());
        }
        int index = rsdfTargetPropertyMapper.insert(rsdfTargetProperty);
        if(index!=0){
            return rsdfTargetProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfTargetProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfTargetProperty getByPrimaryKey(Long id) {
        RsdfTargetProperty result = rsdfTargetPropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfTargetProperty selectOne(RsdfTargetPropertyQuery rsdfTargetPropertyQuery) {
        RsdfTargetProperty result = rsdfTargetPropertyMapper.selectOne(RsdfTargetPropertyExample.getWrapper(rsdfTargetPropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfTargetProperty updateByPrimaryKeySelective(RsdfTargetProperty rsdfTargetProperty) {
        if(rsdfTargetProperty.getUpdatedAt()==null){
            rsdfTargetProperty.setUpdatedAt(new Date());
        }
        int result = rsdfTargetPropertyMapper.updateById(rsdfTargetProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfTargetProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfTargetProperty> getList(RsdfTargetPropertyQuery rsdfTargetPropertyQuery) {
        List<RsdfTargetProperty> rsdfTargetPropertyList = rsdfTargetPropertyMapper.selectList(RsdfTargetPropertyExample.getWrapper(rsdfTargetPropertyQuery));
        return rsdfTargetPropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfTargetProperty> getListWithPage(RsdfTargetPropertyQuery rsdfTargetPropertyQuery) {
        page(rsdfTargetPropertyQuery,RsdfTargetPropertyExample.getWrapper(rsdfTargetPropertyQuery));
        return Page.build(rsdfTargetPropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfTargetPropertyQuery rsdfTargetPropertyQuery) {
        int count = rsdfTargetPropertyMapper.selectCount(RsdfTargetPropertyExample.getWrapper(rsdfTargetPropertyQuery));
        return count;
    }
}