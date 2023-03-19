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
import com.lmy.rsck.model.example.RsdfGameEvent;
import com.lmy.rsck.model.example.RsdfGameEventExample;
import com.lmy.rsck.mapper.RsdfGameEventMapper;
import com.lmy.rsck.view.query.RsdfGameEventQuery;
import com.lmy.rsck.service.RsdfGameEventService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 游戏发生的事件表(RsdfGameEvent)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfGameEventServiceImpl extends ServiceImpl<RsdfGameEventMapper, RsdfGameEvent> implements RsdfGameEventService{

    @Autowired
    private RsdfGameEventMapper rsdfGameEventMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfGameEvent rsdfGameEvent = getByPrimaryKey(id);
        if(rsdfGameEvent!=null) {
            return rsdfGameEventMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfGameEvent insertSelective(RsdfGameEvent rsdfGameEvent) {
        if(rsdfGameEvent.getCreatedAt()==null){
            rsdfGameEvent.setCreatedAt(new Date());
        }
        int index = rsdfGameEventMapper.insert(rsdfGameEvent);
        if(index!=0){
            return rsdfGameEvent;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfGameEvent对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfGameEvent getByPrimaryKey(Long id) {
        RsdfGameEvent result = rsdfGameEventMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfGameEvent selectOne(RsdfGameEventQuery rsdfGameEventQuery) {
        RsdfGameEvent result = rsdfGameEventMapper.selectOne(RsdfGameEventExample.getWrapper(rsdfGameEventQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfGameEvent updateByPrimaryKeySelective(RsdfGameEvent rsdfGameEvent) {
        if(rsdfGameEvent.getUpdatedAt()==null){
            rsdfGameEvent.setUpdatedAt(new Date());
        }
        int result = rsdfGameEventMapper.updateById(rsdfGameEvent);
        if(result==0)return null;
        return getByPrimaryKey(rsdfGameEvent.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfGameEvent> getList(RsdfGameEventQuery rsdfGameEventQuery) {
        List<RsdfGameEvent> rsdfGameEventList = rsdfGameEventMapper.selectList(RsdfGameEventExample.getWrapper(rsdfGameEventQuery));
        return rsdfGameEventList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfGameEvent> getListWithPage(RsdfGameEventQuery rsdfGameEventQuery) {
        page(rsdfGameEventQuery,RsdfGameEventExample.getWrapper(rsdfGameEventQuery));
        return Page.build(rsdfGameEventQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfGameEventQuery rsdfGameEventQuery) {
        int count = rsdfGameEventMapper.selectCount(RsdfGameEventExample.getWrapper(rsdfGameEventQuery));
        return count;
    }
}