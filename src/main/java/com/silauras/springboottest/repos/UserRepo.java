package com.silauras.springboottest.repos;

import com.silauras.springboottest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Silauras
 * Created on 17.01.2021 at 17:27
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
