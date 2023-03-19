package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfUserProperty;
import com.lmy.rsck.view.query.RsdfUserPropertyQuery;
import java.util.List;
/**
 * 人物属性表(RsdfUserProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public interface RsdfUserPropertyService extends IService<RsdfUserProperty>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfUserProperty insertSelective(RsdfUserProperty rsdfUserProperty);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfUserProperty getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfUserProperty selectOne(RsdfUserPropertyQuery rsdfUserPropertyQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfUserProperty updateByPrimaryKeySelective(RsdfUserProperty rsdfUserProperty);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfUserProperty> getList(RsdfUserPropertyQuery rsdfUserPropertyQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfUserProperty> getListWithPage(RsdfUserPropertyQuery rsdfUserPropertyQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfUserPropertyQuery rsdfUserPropertyQuery);
}