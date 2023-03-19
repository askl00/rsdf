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
import com.lmy.rsck.model.example.RsdfGameProperty;
import com.lmy.rsck.model.example.RsdfGamePropertyExample;
import com.lmy.rsck.mapper.RsdfGamePropertyMapper;
import com.lmy.rsck.view.query.RsdfGamePropertyQuery;
import com.lmy.rsck.service.RsdfGamePropertyService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 游戏人物属性表(RsdfGameProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfGamePropertyServiceImpl extends ServiceImpl<RsdfGamePropertyMapper, RsdfGameProperty> implements RsdfGamePropertyService{

    @Autowired
    private RsdfGamePropertyMapper rsdfGamePropertyMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfGameProperty rsdfGameProperty = getByPrimaryKey(id);
        if(rsdfGameProperty!=null) {
            return rsdfGamePropertyMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfGameProperty insertSelective(RsdfGameProperty rsdfGameProperty) {
        if(rsdfGameProperty.getCreatedAt()==null){
            rsdfGameProperty.setCreatedAt(new Date());
        }
        int index = rsdfGamePropertyMapper.insert(rsdfGameProperty);
        if(index!=0){
            return rsdfGameProperty;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfGameProperty对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfGameProperty getByPrimaryKey(Long id) {
        RsdfGameProperty result = rsdfGamePropertyMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfGameProperty selectOne(RsdfGamePropertyQuery rsdfGamePropertyQuery) {
        RsdfGameProperty result = rsdfGamePropertyMapper.selectOne(RsdfGamePropertyExample.getWrapper(rsdfGamePropertyQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfGameProperty updateByPrimaryKeySelective(RsdfGameProperty rsdfGameProperty) {
        if(rsdfGameProperty.getUpdatedAt()==null){
            rsdfGameProperty.setUpdatedAt(new Date());
        }
        int result = rsdfGamePropertyMapper.updateById(rsdfGameProperty);
        if(result==0)return null;
        return getByPrimaryKey(rsdfGameProperty.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfGameProperty> getList(RsdfGamePropertyQuery rsdfGamePropertyQuery) {
        List<RsdfGameProperty> rsdfGamePropertyList = rsdfGamePropertyMapper.selectList(RsdfGamePropertyExample.getWrapper(rsdfGamePropertyQuery));
        return rsdfGamePropertyList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfGameProperty> getListWithPage(RsdfGamePropertyQuery rsdfGamePropertyQuery) {
        page(rsdfGamePropertyQuery,RsdfGamePropertyExample.getWrapper(rsdfGamePropertyQuery));
        return Page.build(rsdfGamePropertyQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfGamePropertyQuery rsdfGamePropertyQuery) {
        int count = rsdfGamePropertyMapper.selectCount(RsdfGamePropertyExample.getWrapper(rsdfGamePropertyQuery));
        return count;
    }
}