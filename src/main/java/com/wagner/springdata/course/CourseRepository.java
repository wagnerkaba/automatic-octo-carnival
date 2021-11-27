package com.wagner.springdata.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String > {

    // You don't have to implement the method!
    // Just declare the method with the
    // findByProperty name format and Spring Data JPA will implement the method for you
    // https://www.youtube.com/watch?v=_Jnu_jHfQbM

    public List<Course> findByTopicId(String topicId);
}
