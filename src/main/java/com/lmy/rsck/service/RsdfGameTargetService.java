package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfGameTarget;
import com.lmy.rsck.view.query.RsdfGameTargetQuery;
import java.util.List;
/**
 * 游戏目标表(RsdfGameTarget)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public interface RsdfGameTargetService extends IService<RsdfGameTarget>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfGameTarget insertSelective(RsdfGameTarget rsdfGameTarget);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfGameTarget getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfGameTarget selectOne(RsdfGameTargetQuery rsdfGameTargetQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfGameTarget updateByPrimaryKeySelective(RsdfGameTarget rsdfGameTarget);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfGameTarget> getList(RsdfGameTargetQuery rsdfGameTargetQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfGameTarget> getListWithPage(RsdfGameTargetQuery rsdfGameTargetQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfGameTargetQuery rsdfGameTargetQuery);
}