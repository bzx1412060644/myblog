package com.ahui.myblog.service.impl;

import com.ahui.myblog.dao.AdminDao;
import com.ahui.myblog.models.Admin;
import com.ahui.myblog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName AdminServiceImpl
 * @Description 管理员服务层实现类
 * @Author DQH
 * @Date 2019/11/28 17:37
 * @Version 0.1
 */
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminDao adminDao;

    /**
     * 查询管理员
     * @param admin
     * @return
     */
    @Override
    public Admin selectAdmin(Admin admin) {
        adminDao.selectAdmin(admin);
        return null;
    }

}
