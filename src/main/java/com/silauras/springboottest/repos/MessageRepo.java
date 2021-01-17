package com.silauras.springboottest.repos;

import com.silauras.springboottest.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Silauras
 * Created on 17.01.2021 at 13:47
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
