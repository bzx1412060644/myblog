package com.ahui.myblog.service;

import com.ahui.myblog.models.Admin;

/**
 * @InterfaceName AdminService
 * @Description 管理员服务层
 * @Author DQH
 * @Date 2019/11/28 17:34
 * @Version 0.1
 */
public interface AdminService {

    /**
     * 查询管理员
     * @param admin
     * @return
     */
    public Admin selectAdmin(Admin admin);
}
