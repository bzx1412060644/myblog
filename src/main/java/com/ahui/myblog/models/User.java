package com.ahui.myblog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description 实体类，对应数据库中的用户表
 * @Author DQH
 * @Date 2019/11/28 16:56
 * @Version 0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 头像
     */
    private String headPortrait;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 上一次登录时间
     */
    private String lastLoginTime;
}
