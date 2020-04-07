package com.atguigu.springbootautoconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WuJun
 * @Date:9:34 2019/12/10
 */
@RestController
public class HelloController {
    @RequestMapping("/helloword")
    public String show(){
        return "hellworld";
    }
}
