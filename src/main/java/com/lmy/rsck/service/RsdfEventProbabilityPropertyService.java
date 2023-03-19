package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEventProbabilityProperty;
import com.lmy.rsck.view.query.RsdfEventProbabilityPropertyQuery;
import java.util.List;
/**
 * 事件-属性概率表(RsdfEventProbabilityProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEventProbabilityPropertyService extends IService<RsdfEventProbabilityProperty>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEventProbabilityProperty insertSelective(RsdfEventProbabilityProperty rsdfEventProbabilityProperty);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEventProbabilityProperty getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEventProbabilityProperty selectOne(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEventProbabilityProperty updateByPrimaryKeySelective(RsdfEventProbabilityProperty rsdfEventProbabilityProperty);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEventProbabilityProperty> getList(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEventProbabilityProperty> getListWithPage(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEventProbabilityPropertyQuery rsdfEventProbabilityPropertyQuery);
}