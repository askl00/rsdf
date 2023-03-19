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
import com.lmy.rsck.model.example.RsdfGameEntry;
import com.lmy.rsck.model.example.RsdfGameEntryExample;
import com.lmy.rsck.mapper.RsdfGameEntryMapper;
import com.lmy.rsck.view.query.RsdfGameEntryQuery;
import com.lmy.rsck.service.RsdfGameEntryService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 游戏词条表(RsdfGameEntry)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfGameEntryServiceImpl extends ServiceImpl<RsdfGameEntryMapper, RsdfGameEntry> implements RsdfGameEntryService{

    @Autowired
    private RsdfGameEntryMapper rsdfGameEntryMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfGameEntry rsdfGameEntry = getByPrimaryKey(id);
        if(rsdfGameEntry!=null) {
            return rsdfGameEntryMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfGameEntry insertSelective(RsdfGameEntry rsdfGameEntry) {
        if(rsdfGameEntry.getCreatedAt()==null){
            rsdfGameEntry.setCreatedAt(new Date());
        }
        int index = rsdfGameEntryMapper.insert(rsdfGameEntry);
        if(index!=0){
            return rsdfGameEntry;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfGameEntry对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfGameEntry getByPrimaryKey(Long id) {
        RsdfGameEntry result = rsdfGameEntryMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfGameEntry selectOne(RsdfGameEntryQuery rsdfGameEntryQuery) {
        RsdfGameEntry result = rsdfGameEntryMapper.selectOne(RsdfGameEntryExample.getWrapper(rsdfGameEntryQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfGameEntry updateByPrimaryKeySelective(RsdfGameEntry rsdfGameEntry) {
        if(rsdfGameEntry.getUpdatedAt()==null){
            rsdfGameEntry.setUpdatedAt(new Date());
        }
        int result = rsdfGameEntryMapper.updateById(rsdfGameEntry);
        if(result==0)return null;
        return getByPrimaryKey(rsdfGameEntry.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfGameEntry> getList(RsdfGameEntryQuery rsdfGameEntryQuery) {
        List<RsdfGameEntry> rsdfGameEntryList = rsdfGameEntryMapper.selectList(RsdfGameEntryExample.getWrapper(rsdfGameEntryQuery));
        return rsdfGameEntryList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfGameEntry> getListWithPage(RsdfGameEntryQuery rsdfGameEntryQuery) {
        page(rsdfGameEntryQuery,RsdfGameEntryExample.getWrapper(rsdfGameEntryQuery));
        return Page.build(rsdfGameEntryQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfGameEntryQuery rsdfGameEntryQuery) {
        int count = rsdfGameEntryMapper.selectCount(RsdfGameEntryExample.getWrapper(rsdfGameEntryQuery));
        return count;
    }
}