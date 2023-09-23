package com.wayne.wayneBlog.service;

import com.wayne.wayneBlog.entity.UserBean;

import java.util.List;

public interface UserService {
    List<UserBean> getAllUser();

    UserBean findUserByName(String name);
}
