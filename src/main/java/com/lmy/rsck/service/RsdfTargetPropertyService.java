package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfTargetProperty;
import com.lmy.rsck.view.query.RsdfTargetPropertyQuery;
import java.util.List;
/**
 * 目标-所需属性表(RsdfTargetProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public interface RsdfTargetPropertyService extends IService<RsdfTargetProperty>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfTargetProperty insertSelective(RsdfTargetProperty rsdfTargetProperty);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfTargetProperty getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfTargetProperty selectOne(RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfTargetProperty updateByPrimaryKeySelective(RsdfTargetProperty rsdfTargetProperty);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfTargetProperty> getList(RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfTargetProperty> getListWithPage(RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfTargetPropertyQuery rsdfTargetPropertyQuery);
}