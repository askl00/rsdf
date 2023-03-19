package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEventTargetProbability;
import com.lmy.rsck.view.query.RsdfEventTargetProbabilityQuery;
import java.util.List;
/**
 * 事件-目标概率表(RsdfEventTargetProbability)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEventTargetProbabilityService extends IService<RsdfEventTargetProbability>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEventTargetProbability insertSelective(RsdfEventTargetProbability rsdfEventTargetProbability);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEventTargetProbability getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEventTargetProbability selectOne(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEventTargetProbability updateByPrimaryKeySelective(RsdfEventTargetProbability rsdfEventTargetProbability);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEventTargetProbability> getList(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEventTargetProbability> getListWithPage(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEventTargetProbabilityQuery rsdfEventTargetProbabilityQuery);
}