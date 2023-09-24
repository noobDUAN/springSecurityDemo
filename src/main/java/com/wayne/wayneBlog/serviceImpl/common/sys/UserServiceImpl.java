package com.wayne.wayneBlog.serviceImpl.common.sys;

import com.wayne.wayneBlog.dao.common.sys.UserRepository;
import com.wayne.wayneBlog.entity.UserBean;
import com.wayne.wayneBlog.entity.common.sys.User;
import com.wayne.wayneBlog.service.common.sys.UserService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public User findUserByName(String username) {
        return userRepository.findUserByName(username);
    }
}
