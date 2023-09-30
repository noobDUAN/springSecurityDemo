package com.wayne.wayneBlog.config.springSecurity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;

public class SecurityUserDetails implements UserDetails {

    private String username;
    private String password;
    private String salt;
    private HashSet<SimpleGrantedAuthority> authoritySet;

    public SecurityUserDetails(String username, String password, String salt, HashSet<SimpleGrantedAuthority> authoritySet) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.authoritySet = authoritySet;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authoritySet;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public String getSalt() {
        return salt;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
