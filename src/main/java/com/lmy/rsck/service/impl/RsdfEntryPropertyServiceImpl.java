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
import com.lmy.rsck.model.example.RsdfEntryProperty;
import com.lmy.rsck.model.example.RsdfEntryPropertyExample;
import com.lmy.rsck.mapper.RsdfEntryPropertyMapper;
import com.lmy.rsck.view.query.RsdfEntryPropertyQuery;
import com.lmy.rsck.service.RsdfEntryPropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 词条属性表(RsdfEntryProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEntryPropertyServiceImpl extends ServiceImpl<RsdfEntryPropertyMapper, RsdfEntryProperty> implements RsdfEntryPropertyService{

    @Autowired
    private RsdfEntryPropertyMapper rsdfEntryPropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEntryProperty rsdfEntryProperty = getByPrimaryKey(id);
        if(rsdfEntryProperty!=null) {
            return rsdfEntryPropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEntryProperty insertSelective(RsdfEntryProperty rsdfEntryProperty) {
        if(rsdfEntryProperty.getCreatedAt()==null){
            rsdfEntryProperty.setCreatedAt(new Date());
        }
        int index = rsdfEntryPropertyMapper.insert(rsdfEntryProperty);
        if(index!=0){
            return rsdfEntryProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEntryProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEntryProperty getByPrimaryKey(Long id) {
        RsdfEntryProperty result = rsdfEntryPropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEntryProperty selectOne(RsdfEntryPropertyQuery rsdfEntryPropertyQuery) {
        RsdfEntryProperty result = rsdfEntryPropertyMapper.selectOne(RsdfEntryPropertyExample.getWrapper(rsdfEntryPropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEntryProperty updateByPrimaryKeySelective(RsdfEntryProperty rsdfEntryProperty) {
        if(rsdfEntryProperty.getUpdatedAt()==null){
            rsdfEntryProperty.setUpdatedAt(new Date());
        }
        int result = rsdfEntryPropertyMapper.updateById(rsdfEntryProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEntryProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEntryProperty> getList(RsdfEntryPropertyQuery rsdfEntryPropertyQuery) {
        List<RsdfEntryProperty> rsdfEntryPropertyList = rsdfEntryPropertyMapper.selectList(RsdfEntryPropertyExample.getWrapper(rsdfEntryPropertyQuery));
        return rsdfEntryPropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEntryProperty> getListWithPage(RsdfEntryPropertyQuery rsdfEntryPropertyQuery) {
        page(rsdfEntryPropertyQuery,RsdfEntryPropertyExample.getWrapper(rsdfEntryPropertyQuery));
        return Page.build(rsdfEntryPropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEntryPropertyQuery rsdfEntryPropertyQuery) {
        int count = rsdfEntryPropertyMapper.selectCount(RsdfEntryPropertyExample.getWrapper(rsdfEntryPropertyQuery));
        return count;
    }
}