package com.wayne.wayneBlog.dao.common.sys;

import com.wayne.wayneBlog.entity.common.sys.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Integer> {
}
