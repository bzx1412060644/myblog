package com.ahui.myblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description 主页
 * @Author DQH
 * @Date 2019/11/28 17:18
 * @Version 0.1
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
