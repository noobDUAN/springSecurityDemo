package com.wayne.wayneBlog.dao.common.sys;

import com.wayne.wayneBlog.entity.common.sys.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query(value =
            "select role.id, role.code, role.parentId, role.name from Role role" +
                    " left join UserRole gx on gx.roleId = gx.id" +
                    " where gx.userId=?1"
    )
    Set<Role> selectListByUserId(Long userId);
}
