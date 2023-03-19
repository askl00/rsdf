package com.lmy.rsck.service;

import java.util.Date;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.micro.datasource.module.Page;
import com.lmy.rsck.model.example.RsdfGamePropertyRecord;
import com.lmy.rsck.view.query.RsdfGamePropertyRecordQuery;
import java.util.List;
/**
 * 属性变动记录表(RsdfGamePropertyRecord)service
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
public interface RsdfGamePropertyRecordService extends IService<RsdfGamePropertyRecord>{
    /**
     * 根据主键删除记录
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 插入实体信息，只有当字段有值时，才会构建 sql
     * @return
     */
    RsdfGamePropertyRecord insertSelective(RsdfGamePropertyRecord rsdfGamePropertyRecord);
    /**
     * 根据主键查询实体信息
     * @return
     */
    RsdfGamePropertyRecord getByPrimaryKey(Long id);
    /**
     * 查询
     * @return
     */
    RsdfGamePropertyRecord selectOne(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
    /**
     * 根据对象中的主键更新其他信息，只有当字段有值时，才会构建sql
     * @return
     */
    RsdfGamePropertyRecord updateByPrimaryKeySelective(RsdfGamePropertyRecord rsdfGamePropertyRecord);
    /**
     * 根据对象中的条件查询所有数据
     * @return
     */
    List<RsdfGamePropertyRecord> getList(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
    /**
     * 根据对象中的条件分页查询
     * @return
     */
    Page<RsdfGamePropertyRecord> getListWithPage(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
    /**
     * 根据对象中的条件查询数据条数
     * @return
     */
    Integer getCount(RsdfGamePropertyRecordQuery rsdfGamePropertyRecordQuery);
}