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
import com.lmy.rsck.model.example.RsdfGamePropertyRecord;
import com.lmy.rsck.model.example.RsdfGamePropertyRecordExample;
import com.lmy.rsck.mapper.RsdfGamePropertyRecordMapper;
import com.lmy.rsck.view.query.RsdfGamePropertyRecordQuery;
import com.lmy.rsck.service.RsdfGamePropertyRecordService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 属性变动记录表(RsdfGamePropertyRecord)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfGamePropertyRecordServiceImpl extends ServiceImpl<RsdfGamePropertyRecordMapper, RsdfGamePropertyRecord> implements RsdfGamePropertyRecordService{

    @Autowired
    private RsdfGamePropertyRecordMapper rsdfGamePropertyRecordMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfGamePropertyRecord rsdfGamePropertyRecord = getByPrimaryKey(id);
        if(rsdfGamePropertyRecord!=null) {
            return rsdfGamePropertyRecordMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfGamePropertyRecord insertSelective(RsdfGamePropertyRecord rsdfGamePropertyRecord) {
        if(rsdfGamePropertyRecord.getCreatedAt()==null){
            rsdfGamePropertyRecord.setCreatedAt(new Date());
        }
        int index = rsdfGamePropertyRecordMapper.insert(rsdfGamePropertyRecord);
        if(index!=0){
            return rsdfGamePropertyRecord;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfGamePropertyRecord对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfGamePropertyRecord getByPrimaryKey(Long id) {
        RsdfGamePropertyRecord result = rsdfGamePropertyRecordMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfGamePropertyRecord selectOne(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery) {
        RsdfGamePropertyRecord result = rsdfGamePropertyRecordMapper.selectOne(RsdfGamePropertyRecordExample.getWrapper(rsdfGamePropertyRecordQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfGamePropertyRecord updateByPrimaryKeySelective(RsdfGamePropertyRecord rsdfGamePropertyRecord) {
        if(rsdfGamePropertyRecord.getUpdatedAt()==null){
            rsdfGamePropertyRecord.setUpdatedAt(new Date());
        }
        int result = rsdfGamePropertyRecordMapper.updateById(rsdfGamePropertyRecord);
        if(result==0)return null;
        return getByPrimaryKey(rsdfGamePropertyRecord.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfGamePropertyRecord> getList(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery) {
        List<RsdfGamePropertyRecord> rsdfGamePropertyRecordList = rsdfGamePropertyRecordMapper.selectList(RsdfGamePropertyRecordExample.getWrapper(rsdfGamePropertyRecordQuery));
        return rsdfGamePropertyRecordList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfGamePropertyRecord> getListWithPage(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery) {
        page(rsdfGamePropertyRecordQuery,RsdfGamePropertyRecordExample.getWrapper(rsdfGamePropertyRecordQuery));
        return Page.build(rsdfGamePropertyRecordQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery) {
        int count = rsdfGamePropertyRecordMapper.selectCount(RsdfGamePropertyRecordExample.getWrapper(rsdfGamePropertyRecordQuery));
        return count;
    }
}