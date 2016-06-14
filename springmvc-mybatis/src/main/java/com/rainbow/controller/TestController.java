package com.rainbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rainbow on 2016/6/14.
 * 每天进步一小步
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test")
    public String test()throws Exception{
        System.out.println("调用TestController.test方法");
        return "test";
    }
}
