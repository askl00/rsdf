package com.lmy.rsck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEventOption;
import com.lmy.rsck.view.query.RsdfEventOptionQuery;
import java.util.List;
/**
 * 事件选项(RsdfEventOption)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEventOptionService extends IService<RsdfEventOption>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEventOption insertSelective(RsdfEventOption rsdfEventOption);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEventOption getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEventOption selectOne(RsdfEventOptionQuery rsdfEventOptionQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEventOption updateByPrimaryKeySelective(RsdfEventOption rsdfEventOption);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEventOption> getList(RsdfEventOptionQuery rsdfEventOptionQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEventOption> getListWithPage(RsdfEventOptionQuery rsdfEventOptionQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEventOptionQuery rsdfEventOptionQuery);
}