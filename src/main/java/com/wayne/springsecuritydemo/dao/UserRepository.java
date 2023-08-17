package com.wayne.springsecuritydemo.dao;

import com.wayne.springsecuritydemo.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<UserBean, Integer> {

    @Query(value = "from UserBean where name = ?1")
    UserBean findUserByName(String name);
}
