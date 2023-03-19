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
import com.lmy.rsck.model.example.RsdfEventOption;
import com.lmy.rsck.model.example.RsdfEventOptionExample;
import com.lmy.rsck.mapper.RsdfEventOptionMapper;
import com.lmy.rsck.view.query.RsdfEventOptionQuery;
import com.lmy.rsck.service.RsdfEventOptionService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 事件选项(RsdfEventOption)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfEventOptionServiceImpl extends ServiceImpl<RsdfEventOptionMapper, RsdfEventOption> implements RsdfEventOptionService{

    @Autowired
    private RsdfEventOptionMapper rsdfEventOptionMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfEventOption rsdfEventOption = getByPrimaryKey(id);
        if(rsdfEventOption!=null) {
            return rsdfEventOptionMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfEventOption insertSelective(RsdfEventOption rsdfEventOption) {
        if(rsdfEventOption.getCreatedAt()==null){
            rsdfEventOption.setCreatedAt(new Date());
        }
        int index = rsdfEventOptionMapper.insert(rsdfEventOption);
        if(index!=0){
            return rsdfEventOption;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfEventOption对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfEventOption getByPrimaryKey(Long id) {
        RsdfEventOption result = rsdfEventOptionMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfEventOption selectOne(RsdfEventOptionQuery rsdfEventOptionQuery) {
        RsdfEventOption result = rsdfEventOptionMapper.selectOne(RsdfEventOptionExample.getWrapper(rsdfEventOptionQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfEventOption updateByPrimaryKeySelective(RsdfEventOption rsdfEventOption) {
        if(rsdfEventOption.getUpdatedAt()==null){
            rsdfEventOption.setUpdatedAt(new Date());
        }
        int result = rsdfEventOptionMapper.updateById(rsdfEventOption);
        if(result==0)return null;
        return getByPrimaryKey(rsdfEventOption.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfEventOption> getList(RsdfEventOptionQuery rsdfEventOptionQuery) {
        List<RsdfEventOption> rsdfEventOptionList = rsdfEventOptionMapper.selectList(RsdfEventOptionExample.getWrapper(rsdfEventOptionQuery));
        return rsdfEventOptionList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfEventOption> getListWithPage(RsdfEventOptionQuery rsdfEventOptionQuery) {
        page(rsdfEventOptionQuery,RsdfEventOptionExample.getWrapper(rsdfEventOptionQuery));
        return Page.build(rsdfEventOptionQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfEventOptionQuery rsdfEventOptionQuery) {
        int count = rsdfEventOptionMapper.selectCount(RsdfEventOptionExample.getWrapper(rsdfEventOptionQuery));
        return count;
    }
}