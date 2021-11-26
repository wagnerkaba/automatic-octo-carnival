package com.wagner.springdata.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String > {

    // https://www.youtube.com/watch?v=_Jnu_jHfQbM
    public List<Topic> findByName(String name);
}
