package com.wayne.springsecuritydemo.service;

import com.wayne.springsecuritydemo.entity.UserBean;

import java.util.List;

public interface UserService {
    List<UserBean> getAllUser();

    UserBean findUserByName(String name);
}
