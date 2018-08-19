package com.qingtian.controller;

import com.qingtian.config.WeChatConfig;
import com.qingtian.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "hello mcrwayfun";
    }

    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("test_config")
    public String testConfig() {

        return weChatConfig.toString();
    }


    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping("test_db")
    public Object testDB() {
        return videoMapper.findAll();
    }


}
