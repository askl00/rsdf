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
import com.lmy.rsck.model.example.RsdfTime;
import com.lmy.rsck.model.example.RsdfTimeExample;
import com.lmy.rsck.mapper.RsdfTimeMapper;
import com.lmy.rsck.view.query.RsdfTimeQuery;
import com.lmy.rsck.service.RsdfTimeService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 时间(RsdfTime)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
@Slf4j
@Service
@Transactional
public class RsdfTimeServiceImpl extends ServiceImpl<RsdfTimeMapper, RsdfTime> implements RsdfTimeService{

    @Autowired
    private RsdfTimeMapper rsdfTimeMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfTime rsdfTime = getByPrimaryKey(id);
        if(rsdfTime!=null) {
            return rsdfTimeMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfTime insertSelective(RsdfTime rsdfTime) {
        if(rsdfTime.getCreatedAt()==null){
            rsdfTime.setCreatedAt(new Date());
        }
        int index = rsdfTimeMapper.insert(rsdfTime);
        if(index!=0){
            return rsdfTime;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfTime对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfTime getByPrimaryKey(Long id) {
        RsdfTime result = rsdfTimeMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfTime selectOne(RsdfTimeQuery rsdfTimeQuery) {
        RsdfTime result = rsdfTimeMapper.selectOne(RsdfTimeExample.getWrapper(rsdfTimeQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfTime updateByPrimaryKeySelective(RsdfTime rsdfTime) {
        if(rsdfTime.getUpdatedAt()==null){
            rsdfTime.setUpdatedAt(new Date());
        }
        int result = rsdfTimeMapper.updateById(rsdfTime);
        if(result==0)return null;
        return getByPrimaryKey(rsdfTime.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfTime> getList(RsdfTimeQuery rsdfTimeQuery) {
        List<RsdfTime> rsdfTimeList = rsdfTimeMapper.selectList(RsdfTimeExample.getWrapper(rsdfTimeQuery));
        return rsdfTimeList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfTime> getListWithPage(RsdfTimeQuery rsdfTimeQuery) {
        page(rsdfTimeQuery,RsdfTimeExample.getWrapper(rsdfTimeQuery));
        return Page.build(rsdfTimeQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfTimeQuery rsdfTimeQuery) {
        int count = rsdfTimeMapper.selectCount(RsdfTimeExample.getWrapper(rsdfTimeQuery));
        return count;
    }
}