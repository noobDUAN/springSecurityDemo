package com.wayne.wayneBlog.controller;

import com.wayne.wayneBlog.entity.UserBean;
import com.wayne.wayneBlog.entity.common.User;
import com.wayne.wayneBlog.service.UserService;
import com.wayne.wayneBlog.util.Result;
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

    @RequestMapping("/register")
    @ResponseBody
    public Result register(User user){
        return new Result(200,"注册成功");
    }
}
