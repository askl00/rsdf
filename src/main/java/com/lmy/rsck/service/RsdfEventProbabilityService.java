package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEventProbability;
import com.lmy.rsck.view.query.RsdfEventProbabilityQuery;
import java.util.List;
/**
 * 事件概率表(RsdfEventProbability)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEventProbabilityService extends IService<RsdfEventProbability>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEventProbability insertSelective(RsdfEventProbability rsdfEventProbability);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEventProbability getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEventProbability selectOne(RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEventProbability updateByPrimaryKeySelective(RsdfEventProbability rsdfEventProbability);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEventProbability> getList(RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEventProbability> getListWithPage(RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEventProbabilityQuery rsdfEventProbabilityQuery);
}