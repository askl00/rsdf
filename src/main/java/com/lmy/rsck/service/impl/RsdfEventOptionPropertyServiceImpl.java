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
import com.lmy.rsck.model.example.RsdfEventOptionProperty;
import com.lmy.rsck.model.example.RsdfEventOptionPropertyExample;
import com.lmy.rsck.mapper.RsdfEventOptionPropertyMapper;
import com.lmy.rsck.view.query.RsdfEventOptionPropertyQuery;
import com.lmy.rsck.service.RsdfEventOptionPropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 事件-属性变动表(RsdfEventOptionProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEventOptionPropertyServiceImpl extends ServiceImpl<RsdfEventOptionPropertyMapper, RsdfEventOptionProperty> implements RsdfEventOptionPropertyService{

    @Autowired
    private RsdfEventOptionPropertyMapper rsdfEventOptionPropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEventOptionProperty rsdfEventOptionProperty = getByPrimaryKey(id);
        if(rsdfEventOptionProperty!=null) {
            return rsdfEventOptionPropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEventOptionProperty insertSelective(RsdfEventOptionProperty rsdfEventOptionProperty) {
        if(rsdfEventOptionProperty.getCreatedAt()==null){
            rsdfEventOptionProperty.setCreatedAt(new Date());
        }
        int index = rsdfEventOptionPropertyMapper.insert(rsdfEventOptionProperty);
        if(index!=0){
            return rsdfEventOptionProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEventOptionProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEventOptionProperty getByPrimaryKey(Long id) {
        RsdfEventOptionProperty result = rsdfEventOptionPropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEventOptionProperty selectOne(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery) {
        RsdfEventOptionProperty result = rsdfEventOptionPropertyMapper.selectOne(RsdfEventOptionPropertyExample.getWrapper(rsdfEventOptionPropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEventOptionProperty updateByPrimaryKeySelective(RsdfEventOptionProperty rsdfEventOptionProperty) {
        if(rsdfEventOptionProperty.getUpdatedAt()==null){
            rsdfEventOptionProperty.setUpdatedAt(new Date());
        }
        int result = rsdfEventOptionPropertyMapper.updateById(rsdfEventOptionProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEventOptionProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEventOptionProperty> getList(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery) {
        List<RsdfEventOptionProperty> rsdfEventOptionPropertyList = rsdfEventOptionPropertyMapper.selectList(RsdfEventOptionPropertyExample.getWrapper(rsdfEventOptionPropertyQuery));
        return rsdfEventOptionPropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEventOptionProperty> getListWithPage(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery) {
        page(rsdfEventOptionPropertyQuery,RsdfEventOptionPropertyExample.getWrapper(rsdfEventOptionPropertyQuery));
        return Page.build(rsdfEventOptionPropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery) {
        int count = rsdfEventOptionPropertyMapper.selectCount(RsdfEventOptionPropertyExample.getWrapper(rsdfEventOptionPropertyQuery));
        return count;
    }
}