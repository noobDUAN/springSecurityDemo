package com.wayne.wayneBlog.dao.common.sys;

import com.wayne.wayneBlog.entity.common.sys.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
