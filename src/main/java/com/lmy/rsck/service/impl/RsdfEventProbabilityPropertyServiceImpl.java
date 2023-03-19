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
import com.lmy.rsck.model.example.RsdfEventProbabilityProperty;
import com.lmy.rsck.model.example.RsdfEventProbabilityPropertyExample;
import com.lmy.rsck.mapper.RsdfEventProbabilityPropertyMapper;
import com.lmy.rsck.view.query.RsdfEventProbabilityPropertyQuery;
import com.lmy.rsck.service.RsdfEventProbabilityPropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 事件-属性概率表(RsdfEventProbabilityProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEventProbabilityPropertyServiceImpl extends ServiceImpl<RsdfEventProbabilityPropertyMapper, RsdfEventProbabilityProperty> implements RsdfEventProbabilityPropertyService{

    @Autowired
    private RsdfEventProbabilityPropertyMapper rsdfEventProbabilityPropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEventProbabilityProperty rsdfEventProbabilityProperty = getByPrimaryKey(id);
        if(rsdfEventProbabilityProperty!=null) {
            return rsdfEventProbabilityPropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEventProbabilityProperty insertSelective(RsdfEventProbabilityProperty rsdfEventProbabilityProperty) {
        if(rsdfEventProbabilityProperty.getCreatedAt()==null){
            rsdfEventProbabilityProperty.setCreatedAt(new Date());
        }
        int index = rsdfEventProbabilityPropertyMapper.insert(rsdfEventProbabilityProperty);
        if(index!=0){
            return rsdfEventProbabilityProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEventProbabilityProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEventProbabilityProperty getByPrimaryKey(Long id) {
        RsdfEventProbabilityProperty result = rsdfEventProbabilityPropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEventProbabilityProperty selectOne(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery) {
        RsdfEventProbabilityProperty result = rsdfEventProbabilityPropertyMapper.selectOne(RsdfEventProbabilityPropertyExample.getWrapper(rsdfEventProbabilityPropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEventProbabilityProperty updateByPrimaryKeySelective(RsdfEventProbabilityProperty rsdfEventProbabilityProperty) {
        if(rsdfEventProbabilityProperty.getUpdatedAt()==null){
            rsdfEventProbabilityProperty.setUpdatedAt(new Date());
        }
        int result = rsdfEventProbabilityPropertyMapper.updateById(rsdfEventProbabilityProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEventProbabilityProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEventProbabilityProperty> getList(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery) {
        List<RsdfEventProbabilityProperty> rsdfEventProbabilityPropertyList = rsdfEventProbabilityPropertyMapper.selectList(RsdfEventProbabilityPropertyExample.getWrapper(rsdfEventProbabilityPropertyQuery));
        return rsdfEventProbabilityPropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEventProbabilityProperty> getListWithPage(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery) {
        page(rsdfEventProbabilityPropertyQuery,RsdfEventProbabilityPropertyExample.getWrapper(rsdfEventProbabilityPropertyQuery));
        return Page.build(rsdfEventProbabilityPropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery) {
        int count = rsdfEventProbabilityPropertyMapper.selectCount(RsdfEventProbabilityPropertyExample.getWrapper(rsdfEventProbabilityPropertyQuery));
        return count;
    }
}