package com.wayne.wayneBlog.dao.common.sys;

import com.wayne.wayneBlog.entity.common.sys.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
