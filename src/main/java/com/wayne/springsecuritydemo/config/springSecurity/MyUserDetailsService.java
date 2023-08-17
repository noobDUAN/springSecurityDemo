package com.wayne.springsecuritydemo.config.springSecurity;

import com.wayne.springsecuritydemo.entity.UserBean;
import com.wayne.springsecuritydemo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Configuration
public class MyUserDetailsService implements UserDetailsService{

    @Resource
    UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserBean userBean = userService.findUserByName(username);
        if(Objects.isNull(userBean)){
            throw new UsernameNotFoundException("用户：‘"+username+"'不存在" );
        }else {
            List<SimpleGrantedAuthority> simpleGrantedAuthorityList = createAuthorities(userBean.getRole());
            UserDetails userDetails = new User(userBean.getName(), userBean.getPassword(), simpleGrantedAuthorityList);
            return userDetails;
        }
    }

    private List<SimpleGrantedAuthority> createAuthorities(String roleStr){
        String[] roles = roleStr.split(",");
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }
}
