package com.codeup.blog.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Collections;

public class UserWithRoles extends User implements UserDetails {

    public UserWithRoles(User user){
        super(user); //call the copy constructor define in User; means to share information with class
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //FOR SECURITY
        String roles = StringUtils.collectionToCommaDelimitedString(Collections.emptyList()); //userRoles is a list of strings if don't want to use userRoles can use empty list
        return AuthorityUtils.commaSeparatedStringToAuthorityList(roles); //this model is for security component
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
