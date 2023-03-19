package com.lmy.rsck.service;

import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfGame;
import com.lmy.rsck.view.query.RsdfGameQuery;
import java.util.List;
/**
 * 游戏（记录）表(RsdfGame)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfGameService extends IService<RsdfGame>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfGame insertSelective(RsdfGame rsdfGame);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfGame getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfGame selectOne(RsdfGameQuery rsdfGameQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfGame updateByPrimaryKeySelective(RsdfGame rsdfGame);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfGame> getList(RsdfGameQuery rsdfGameQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfGame> getListWithPage(RsdfGameQuery rsdfGameQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfGameQuery rsdfGameQuery);
}