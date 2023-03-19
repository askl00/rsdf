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
import com.lmy.rsck.model.example.RsdfEntry;
import com.lmy.rsck.model.example.RsdfEntryExample;
import com.lmy.rsck.mapper.RsdfEntryMapper;
import com.lmy.rsck.view.query.RsdfEntryQuery;
import com.lmy.rsck.service.RsdfEntryService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 词条表(RsdfEntry)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:03
 */
@Slf4j
@Service
@Transactional
public class RsdfEntryServiceImpl extends ServiceImpl<RsdfEntryMapper, RsdfEntry> implements RsdfEntryService{

    @Autowired
    private RsdfEntryMapper rsdfEntryMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEntry rsdfEntry = getByPrimaryKey(id);
        if(rsdfEntry!=null) {
            return rsdfEntryMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEntry insertSelective(RsdfEntry rsdfEntry) {
        if(rsdfEntry.getCreatedAt()==null){
            rsdfEntry.setCreatedAt(new Date());
        }
        int index = rsdfEntryMapper.insert(rsdfEntry);
        if(index!=0){
            return rsdfEntry;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEntry对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEntry getByPrimaryKey(Long id) {
        RsdfEntry result = rsdfEntryMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEntry selectOne(RsdfEntryQuery rsdfEntryQuery) {
        RsdfEntry result = rsdfEntryMapper.selectOne(RsdfEntryExample.getWrapper(rsdfEntryQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEntry updateByPrimaryKeySelective(RsdfEntry rsdfEntry) {
        if(rsdfEntry.getUpdatedAt()==null){
            rsdfEntry.setUpdatedAt(new Date());
        }
        int result = rsdfEntryMapper.updateById(rsdfEntry);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEntry.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEntry> getList(RsdfEntryQuery rsdfEntryQuery) {
        List<RsdfEntry> rsdfEntryList = rsdfEntryMapper.selectList(RsdfEntryExample.getWrapper(rsdfEntryQuery));
        return rsdfEntryList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEntry> getListWithPage(RsdfEntryQuery rsdfEntryQuery) {
        page(rsdfEntryQuery,RsdfEntryExample.getWrapper(rsdfEntryQuery));
        return Page.build(rsdfEntryQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEntryQuery rsdfEntryQuery) {
        int count = rsdfEntryMapper.selectCount(RsdfEntryExample.getWrapper(rsdfEntryQuery));
        return count;
    }
}