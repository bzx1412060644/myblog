package com.ahui.myblog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Article
 * @Description 实体类，对应数据库中的文章表
 * @Author DQH
 * @Date 2019/11/28 15:28
 * @Version 0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    /**
     * id
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 路径
     */
    private String path;

    /**
     * 标签
     */
    private String tags;
}
