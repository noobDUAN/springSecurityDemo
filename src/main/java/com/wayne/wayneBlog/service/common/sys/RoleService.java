package com.wayne.wayneBlog.service.common.sys;

import com.wayne.wayneBlog.entity.common.sys.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> selectListByUserId(Long userId);
}
