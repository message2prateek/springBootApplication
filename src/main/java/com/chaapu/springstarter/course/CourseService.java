package com.chaapu.springstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    List<Course> getAllCourses(String topicId) {
        ArrayList<Course> courses = new ArrayList<>();
        courses.addAll(courseRepository.findByTopicId(topicId));
        return courses;
    }

    Course getCourse(String id) {
        return courseRepository.findOne(id);
    }

    void addCourse(Course course) {
        courseRepository.save(course);
    }

    void updateCourse(Course course) {
        courseRepository.save(course);
    }

    void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
