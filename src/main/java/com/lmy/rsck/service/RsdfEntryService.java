package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEntry;
import com.lmy.rsck.view.query.RsdfEntryQuery;
import java.util.List;
/**
 * 词条表(RsdfEntry)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:03
 */
public interface RsdfEntryService extends IService<RsdfEntry>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEntry insertSelective(RsdfEntry rsdfEntry);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEntry getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEntry selectOne(RsdfEntryQuery rsdfEntryQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEntry updateByPrimaryKeySelective(RsdfEntry rsdfEntry);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEntry> getList(RsdfEntryQuery rsdfEntryQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEntry> getListWithPage(RsdfEntryQuery rsdfEntryQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEntryQuery rsdfEntryQuery);
}