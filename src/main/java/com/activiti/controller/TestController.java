package com.activiti.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujinqian on 2018/3/12.
 */
@RestController
@RequestMapping("/activiti")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testMethod(){
        return "{\"aa\":\"bb\"}";
    }
}
