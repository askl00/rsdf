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
import com.lmy.rsck.model.example.RsdfUserProperty;
import com.lmy.rsck.model.example.RsdfUserPropertyExample;
import com.lmy.rsck.mapper.RsdfUserPropertyMapper;
import com.lmy.rsck.view.query.RsdfUserPropertyQuery;
import com.lmy.rsck.service.RsdfUserPropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 人物属性表(RsdfUserProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@Service
@Transactional
public class RsdfUserPropertyServiceImpl extends ServiceImpl<RsdfUserPropertyMapper, RsdfUserProperty> implements RsdfUserPropertyService{

    @Autowired
    private RsdfUserPropertyMapper rsdfUserPropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfUserProperty rsdfUserProperty = getByPrimaryKey(id);
        if(rsdfUserProperty!=null) {
            return rsdfUserPropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfUserProperty insertSelective(RsdfUserProperty rsdfUserProperty) {
        if(rsdfUserProperty.getCreatedAt()==null){
            rsdfUserProperty.setCreatedAt(new Date());
        }
        int index = rsdfUserPropertyMapper.insert(rsdfUserProperty);
        if(index!=0){
            return rsdfUserProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfUserProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfUserProperty getByPrimaryKey(Long id) {
        RsdfUserProperty result = rsdfUserPropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfUserProperty selectOne(RsdfUserPropertyQuery rsdfUserPropertyQuery) {
        RsdfUserProperty result = rsdfUserPropertyMapper.selectOne(RsdfUserPropertyExample.getWrapper(rsdfUserPropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfUserProperty updateByPrimaryKeySelective(RsdfUserProperty rsdfUserProperty) {
        if(rsdfUserProperty.getUpdatedAt()==null){
            rsdfUserProperty.setUpdatedAt(new Date());
        }
        int result = rsdfUserPropertyMapper.updateById(rsdfUserProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfUserProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfUserProperty> getList(RsdfUserPropertyQuery rsdfUserPropertyQuery) {
        List<RsdfUserProperty> rsdfUserPropertyList = rsdfUserPropertyMapper.selectList(RsdfUserPropertyExample.getWrapper(rsdfUserPropertyQuery));
        return rsdfUserPropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfUserProperty> getListWithPage(RsdfUserPropertyQuery rsdfUserPropertyQuery) {
        page(rsdfUserPropertyQuery,RsdfUserPropertyExample.getWrapper(rsdfUserPropertyQuery));
        return Page.build(rsdfUserPropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfUserPropertyQuery rsdfUserPropertyQuery) {
        int count = rsdfUserPropertyMapper.selectCount(RsdfUserPropertyExample.getWrapper(rsdfUserPropertyQuery));
        return count;
    }
}