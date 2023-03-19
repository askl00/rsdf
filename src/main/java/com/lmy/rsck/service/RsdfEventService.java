package com.lmy.rsck.service;

import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfEvent;
import com.lmy.rsck.view.query.RsdfEventQuery;
import java.util.List;
/**
 * 事件(RsdfEvent)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfEventService extends IService<RsdfEvent>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfEvent insertSelective(RsdfEvent rsdfEvent);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfEvent getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfEvent selectOne(RsdfEventQuery rsdfEventQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfEvent updateByPrimaryKeySelective(RsdfEvent rsdfEvent);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfEvent> getList(RsdfEventQuery rsdfEventQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfEvent> getListWithPage(RsdfEventQuery rsdfEventQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfEventQuery rsdfEventQuery);
}