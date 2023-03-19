package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEventOptionProperty;
import com.lmy.rsck.view.query.RsdfEventOptionPropertyQuery;
import java.util.List;
/**
 * 事件-属性变动表(RsdfEventOptionProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEventOptionPropertyService extends IService<RsdfEventOptionProperty>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEventOptionProperty insertSelective(RsdfEventOptionProperty rsdfEventOptionProperty);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEventOptionProperty getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEventOptionProperty selectOne(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEventOptionProperty updateByPrimaryKeySelective(RsdfEventOptionProperty rsdfEventOptionProperty);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEventOptionProperty> getList(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEventOptionProperty> getListWithPage(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEventOptionPropertyQuery rsdfEventOptionPropertyQuery);
}