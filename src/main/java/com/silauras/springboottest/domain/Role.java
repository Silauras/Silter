package com.silauras.springboottest.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Silauras
 * Created on 17.01.2021 at 16:51
 */
public enum Role implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
