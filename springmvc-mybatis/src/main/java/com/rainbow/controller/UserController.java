package com.rainbow.controller;

import com.rainbow.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rainbow on 2016/6/15.
 * 每天进步一小步
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user")
    public String user()throws Exception{
        System.out.println("调用UserController.user方法");
        return "user/userList";
    }
    @RequestMapping(value = "/userList")
    public ModelAndView userList()throws Exception{
        System.out.println("调用UserController.userList方法");
        List<User> userList=new ArrayList<User>();
        User user=new User();
        user.setId(1);
        user.setUserName("昆明");
        user.setPassword("admin123");

        userList.add(user);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(userList);
        modelAndView.setViewName("user/list");
        return modelAndView;
    }

}
