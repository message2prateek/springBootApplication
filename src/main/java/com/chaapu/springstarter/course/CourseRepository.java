package com.chaapu.springstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String id);
}
