package com.wayne.springsecuritydemo.serviceImpl;

import com.wayne.springsecuritydemo.dao.UserRepository;
import com.wayne.springsecuritydemo.entity.UserBean;
import com.wayne.springsecuritydemo.service.UserService;
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
