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
import com.lmy.rsck.model.example.RsdfProperty;
import com.lmy.rsck.model.example.RsdfPropertyExample;
import com.lmy.rsck.mapper.RsdfPropertyMapper;
import com.lmy.rsck.view.query.RsdfPropertyQuery;
import com.lmy.rsck.service.RsdfPropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 属性表(RsdfProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@Service
@Transactional
public class RsdfPropertyServiceImpl extends ServiceImpl<RsdfPropertyMapper, RsdfProperty> implements RsdfPropertyService{

    @Autowired
    private RsdfPropertyMapper rsdfPropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfProperty rsdfProperty = getByPrimaryKey(id);
        if(rsdfProperty!=null) {
            return rsdfPropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfProperty insertSelective(RsdfProperty rsdfProperty) {
        if(rsdfProperty.getCreatedAt()==null){
            rsdfProperty.setCreatedAt(new Date());
        }
        int index = rsdfPropertyMapper.insert(rsdfProperty);
        if(index!=0){
            return rsdfProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfProperty getByPrimaryKey(Long id) {
        RsdfProperty result = rsdfPropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfProperty selectOne(RsdfPropertyQuery rsdfPropertyQuery) {
        RsdfProperty result = rsdfPropertyMapper.selectOne(RsdfPropertyExample.getWrapper(rsdfPropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfProperty updateByPrimaryKeySelective(RsdfProperty rsdfProperty) {
        if(rsdfProperty.getUpdatedAt()==null){
            rsdfProperty.setUpdatedAt(new Date());
        }
        int result = rsdfPropertyMapper.updateById(rsdfProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfProperty> getList(RsdfPropertyQuery rsdfPropertyQuery) {
        List<RsdfProperty> rsdfPropertyList = rsdfPropertyMapper.selectList(RsdfPropertyExample.getWrapper(rsdfPropertyQuery));
        return rsdfPropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfProperty> getListWithPage(RsdfPropertyQuery rsdfPropertyQuery) {
        page(rsdfPropertyQuery,RsdfPropertyExample.getWrapper(rsdfPropertyQuery));
        return Page.build(rsdfPropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfPropertyQuery rsdfPropertyQuery) {
        int count = rsdfPropertyMapper.selectCount(RsdfPropertyExample.getWrapper(rsdfPropertyQuery));
        return count;
    }
}