package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEntryProperty;
import com.lmy.rsck.view.query.RsdfEntryPropertyQuery;
import java.util.List;
/**
 * 词条属性表(RsdfEntryProperty)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEntryPropertyService extends IService<RsdfEntryProperty>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEntryProperty insertSelective(RsdfEntryProperty rsdfEntryProperty);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEntryProperty getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEntryProperty selectOne(RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEntryProperty updateByPrimaryKeySelective(RsdfEntryProperty rsdfEntryProperty);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEntryProperty> getList(RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEntryProperty> getListWithPage(RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEntryPropertyQuery rsdfEntryPropertyQuery);
}