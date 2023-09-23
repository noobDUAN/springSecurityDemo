package com.wayne.wayneBlog.config.springSecurity;

import com.wayne.wayneBlog.entity.UserBean;
import com.wayne.wayneBlog.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@Configuration
public class ProjectUserDetails implements UserDetailsService {

    private List<UserDetails> users;

    @Resource
    UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = users.stream().filter(each -> each.getUsername().equals(username)).findFirst().get();

        if(Objects.isNull(user)){
            UserBean userBean = userService.findUserByName(username);
            if (Objects.isNull(userBean)) {
                throw new UsernameNotFoundException("用户：‘" + username + "'不存在");
            } else {
                HashSet<SimpleGrantedAuthority> authorityHashSet = createAuthorities(userBean.getRole());
                UserDetails newUser = new SecurityUserDetails(userBean.getName(), userBean.getPassword(), authorityHashSet);
                users.add(newUser);
                return newUser;
            }
        }else{
            return user;
        }


    }

    private HashSet<SimpleGrantedAuthority> createAuthorities(String roleStr) {
        String[] roles = roleStr.split(",");
        HashSet<SimpleGrantedAuthority> simpleGrantedAuthorities = new HashSet<>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }
}
