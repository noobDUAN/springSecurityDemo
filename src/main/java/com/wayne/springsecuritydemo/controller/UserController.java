package com.wayne.springsecuritydemo.controller;

import com.wayne.springsecuritydemo.entity.UserBean;
import com.wayne.springsecuritydemo.service.UserService;
import com.wayne.springsecuritydemo.util.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public Result getAllUser(){
        List<UserBean> userBeanList = userService.getAllUser();
        Result result = new Result(200, "操作成功");
        result.setData(userBeanList);
        return result;
    }
}
