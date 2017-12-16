package com.chaapu.springstarter.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface TopicRepository extends CrudRepository<Topic, String> {
    public List<Topic> findByName(String name);
}
