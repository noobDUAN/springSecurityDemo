package com.wayne.wayneBlog.config.springSecurity;

import com.wayne.wayneBlog.entity.common.sys.Role;
import com.wayne.wayneBlog.entity.common.sys.User;
import com.wayne.wayneBlog.service.common.sys.RoleService;
import com.wayne.wayneBlog.service.common.sys.UserService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.*;

@Configuration
public class SecurityUserDetailsService implements UserDetailsService {
    private static List<SecurityUserDetails> users = new ArrayList<>();

    @Resource
    UserService userService;
    @Resource
    RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userBean = userService.findUserByName(username);
        if (Objects.isNull(userBean)) {
            throw new UsernameNotFoundException("用户：‘" + username + "'不存在");
        } else {
            HashSet<SimpleGrantedAuthority> authorityHashSet = createAuthorities(userBean.getId());
            SecurityUserDetails newUser = new SecurityUserDetails(userBean.getName(), userBean.getPassword(), userBean.getSalt(), authorityHashSet);
            users.add(newUser);
            return newUser;
        }
    }

    private HashSet<SimpleGrantedAuthority> createAuthorities(Long userId) {
        Set<Role> roles = roleService.selectListByUserId(userId);
        HashSet<SimpleGrantedAuthority> simpleGrantedAuthorities = new HashSet<>();
        for (Role role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return simpleGrantedAuthorities;
    }
}
