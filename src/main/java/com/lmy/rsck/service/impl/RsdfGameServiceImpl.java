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
import com.lmy.rsck.model.example.RsdfGame;
import com.lmy.rsck.model.example.RsdfGameExample;
import com.lmy.rsck.mapper.RsdfGameMapper;
import com.lmy.rsck.view.query.RsdfGameQuery;
import com.lmy.rsck.service.RsdfGameService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Date;
/**
 * 游戏（记录）表(RsdfGame)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Slf4j
@Service
@Transactional
public class RsdfGameServiceImpl extends ServiceImpl<RsdfGameMapper, RsdfGame> implements RsdfGameService{

    @Autowired
    private RsdfGameMapper rsdfGameMapper;
    
    /**
     * 根据主键删除记录
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id){
        RsdfGame rsdfGame = getByPrimaryKey(id);
        if(rsdfGame!=null) {
            return rsdfGameMapper.deleteById(id);
        }else{
            return 0;
        }
    }
    
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    @Override
    public RsdfGame insertSelective(RsdfGame rsdfGame) {
        if(rsdfGame.getCreatedAt()==null){
            rsdfGame.setCreatedAt(new Date());
        }
        int index = rsdfGameMapper.insert(rsdfGame);
        if(index!=0){
            return rsdfGame;
        }else{
            throw new BusinessException("数据库操作失败，插入rsdfGame对象失败");
        }
    }
    
    /**
     * 根据主键查询实体信息
     * @return
     */
    @Override
    public RsdfGame getByPrimaryKey(Long id) {
        RsdfGame result = rsdfGameMapper.selectById(id);
        return result;
    }

    /**
     * 根据对象中的条件查询单条数据，当返回多条时报错
     * @return
     */
    @Override
    public RsdfGame selectOne(RsdfGameQuery rsdfGameQuery) {
        RsdfGame result = rsdfGameMapper.selectOne(RsdfGameExample.getWrapper(rsdfGameQuery));
        return result;
    }
    
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    @Override
    public RsdfGame updateByPrimaryKeySelective(RsdfGame rsdfGame) {
        if(rsdfGame.getUpdatedAt()==null){
            rsdfGame.setUpdatedAt(new Date());
        }
        int result = rsdfGameMapper.updateById(rsdfGame);
        if(result==0)return null;
        return getByPrimaryKey(rsdfGame.getId());
    }
    
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    @Override
    public List<RsdfGame> getList(RsdfGameQuery rsdfGameQuery) {
        List<RsdfGame> rsdfGameList = rsdfGameMapper.selectList(RsdfGameExample.getWrapper(rsdfGameQuery));
        return rsdfGameList;
    }

    /**
     * 根据对象中的条件分页查询
     * @return
     */
    @Override
    public Page<RsdfGame> getListWithPage(RsdfGameQuery rsdfGameQuery) {
        page(rsdfGameQuery,RsdfGameExample.getWrapper(rsdfGameQuery));
        return Page.build(rsdfGameQuery);
    }
    
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    @Override
    public Integer getCount(RsdfGameQuery rsdfGameQuery) {
        int count = rsdfGameMapper.selectCount(RsdfGameExample.getWrapper(rsdfGameQuery));
        return count;
    }
}