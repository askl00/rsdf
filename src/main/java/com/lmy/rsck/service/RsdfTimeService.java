package com.lmy.rsck.service;

import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfTime;
import com.lmy.rsck.view.query.RsdfTimeQuery;
import java.util.List;
/**
 * 时间(RsdfTime)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:05
 */
public interface RsdfTimeService extends IService<RsdfTime>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfTime insertSelective(RsdfTime rsdfTime);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfTime getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfTime selectOne(RsdfTimeQuery rsdfTimeQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfTime updateByPrimaryKeySelective(RsdfTime rsdfTime);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfTime> getList(RsdfTimeQuery rsdfTimeQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfTime> getListWithPage(RsdfTimeQuery rsdfTimeQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfTimeQuery rsdfTimeQuery);
}