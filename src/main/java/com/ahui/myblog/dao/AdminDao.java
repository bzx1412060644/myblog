package com.ahui.myblog.dao;

import com.ahui.myblog.models.Admin;

/**
 * @InterfaceName AdminDao
 * @Description 管理员操作
 * @Author DQH
 * @Date 2019/11/28 17:24
 * @Version 0.1
 */
public interface AdminDao {

    /**
     * 查询管理员
     * @param amdin
     * @return
     */
    public Admin selectAdmin(Admin amdin);
}
