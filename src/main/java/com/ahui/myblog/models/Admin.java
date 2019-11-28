package com.ahui.myblog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Admin
 * @Description 实体类，对应数据库中的管理员表
 * @Author DQH
 * @Date 2019/11/28 16:56
 * @Version 0.1
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

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
}
