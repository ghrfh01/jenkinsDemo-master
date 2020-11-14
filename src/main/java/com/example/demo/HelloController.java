package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/")
public class HelloController {
    /**
     * 获取首页
     */
    @RequestMapping("/index")
    public String index(String test) {

        return "succss"+test;
    }
}
