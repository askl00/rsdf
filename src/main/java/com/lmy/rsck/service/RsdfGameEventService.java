package com.lmy.rsck.service;

import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfGameEvent;
import com.lmy.rsck.view.query.RsdfGameEventQuery;
import java.util.List;
/**
 * 游戏发生的事件表(RsdfGameEvent)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfGameEventService extends IService<RsdfGameEvent>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfGameEvent insertSelective(RsdfGameEvent rsdfGameEvent);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfGameEvent getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfGameEvent selectOne(RsdfGameEventQuery rsdfGameEventQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfGameEvent updateByPrimaryKeySelective(RsdfGameEvent rsdfGameEvent);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfGameEvent> getList(RsdfGameEventQuery rsdfGameEventQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfGameEvent> getListWithPage(RsdfGameEventQuery rsdfGameEventQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfGameEventQuery rsdfGameEventQuery);
}