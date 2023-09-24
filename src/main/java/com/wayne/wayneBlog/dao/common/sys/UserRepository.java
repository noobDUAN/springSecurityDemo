package com.wayne.wayneBlog.dao.common.sys;

import com.wayne.wayneBlog.entity.common.sys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "from User where name = ?1")
    User findUserByName(String username);
}
