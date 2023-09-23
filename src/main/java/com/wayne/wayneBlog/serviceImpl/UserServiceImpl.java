package com.wayne.wayneBlog.serviceImpl;

import com.wayne.wayneBlog.dao.UserRepository;
import com.wayne.wayneBlog.entity.UserBean;
import com.wayne.wayneBlog.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public List<UserBean> getAllUser() {
        return  userRepository.findAll();
    }

    @Override
    public UserBean findUserByName(String name) {
        return userRepository.findUserByName(name);
    }
}
