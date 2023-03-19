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
import com.lmy.rsck.model.example.RsdfEvent;
import com.lmy.rsck.model.example.RsdfEventExample;
import com.lmy.rsck.mapper.RsdfEventMapper;
import com.lmy.rsck.view.query.RsdfEventQuery;
import com.lmy.rsck.service.RsdfEventService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 事件(RsdfEvent)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEventServiceImpl extends ServiceImpl<RsdfEventMapper, RsdfEvent> implements RsdfEventService{

    @Autowired
    private RsdfEventMapper rsdfEventMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEvent rsdfEvent = getByPrimaryKey(id);
        if(rsdfEvent!=null) {
            return rsdfEventMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEvent insertSelective(RsdfEvent rsdfEvent) {
        if(rsdfEvent.getCreatedAt()==null){
            rsdfEvent.setCreatedAt(new Date());
        }
        int index = rsdfEventMapper.insert(rsdfEvent);
        if(index!=0){
            return rsdfEvent;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEvent对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEvent getByPrimaryKey(Long id) {
        RsdfEvent result = rsdfEventMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEvent selectOne(RsdfEventQuery rsdfEventQuery) {
        RsdfEvent result = rsdfEventMapper.selectOne(RsdfEventExample.getWrapper(rsdfEventQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEvent updateByPrimaryKeySelective(RsdfEvent rsdfEvent) {
        if(rsdfEvent.getUpdatedAt()==null){
            rsdfEvent.setUpdatedAt(new Date());
        }
        int result = rsdfEventMapper.updateById(rsdfEvent);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEvent.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEvent> getList(RsdfEventQuery rsdfEventQuery) {
        List<RsdfEvent> rsdfEventList = rsdfEventMapper.selectList(RsdfEventExample.getWrapper(rsdfEventQuery));
        return rsdfEventList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEvent> getListWithPage(RsdfEventQuery rsdfEventQuery) {
        page(rsdfEventQuery,RsdfEventExample.getWrapper(rsdfEventQuery));
        return Page.build(rsdfEventQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEventQuery rsdfEventQuery) {
        int count = rsdfEventMapper.selectCount(RsdfEventExample.getWrapper(rsdfEventQuery));
        return count;
    }
}