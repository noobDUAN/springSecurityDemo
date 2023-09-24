package com.wayne.wayneBlog.serviceImpl.common.sys;

import com.wayne.wayneBlog.dao.common.sys.RoleRepository;
import com.wayne.wayneBlog.entity.common.sys.Role;
import com.wayne.wayneBlog.service.common.sys.RoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleRepository roleRepository;

    @Override
    public Set<Role> selectListByUserId(Long userId) {
        return roleRepository.selectListByUserId(userId);
    }
}
