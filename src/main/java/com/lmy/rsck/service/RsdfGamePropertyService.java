package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfGameProperty;
import com.lmy.rsck.view.query.RsdfGamePropertyQuery;
import java.util.List;
/**
 * 游戏人物属性表(RsdfGameProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfGamePropertyService extends IService<RsdfGameProperty>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfGameProperty insertSelective(RsdfGameProperty rsdfGameProperty);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfGameProperty getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfGameProperty selectOne(RsdfGamePropertyQuery rsdfGamePropertyQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfGameProperty updateByPrimaryKeySelective(RsdfGameProperty rsdfGameProperty);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfGameProperty> getList(RsdfGamePropertyQuery rsdfGamePropertyQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfGameProperty> getListWithPage(RsdfGamePropertyQuery rsdfGamePropertyQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfGamePropertyQuery rsdfGamePropertyQuery);
}