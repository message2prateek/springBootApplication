package com.chaapu.springstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service class TopicService {

    @Autowired
    TopicRepository topicRepository;

    List<Topic> getAllTopics(Optional<String> name) {
        ArrayList<Topic> topics = new ArrayList<>();
        if (name.isPresent()) {
            topics.addAll(topicRepository.findByName(name.get()));
        } else {
            topicRepository.findAll().forEach(topics::add);
        }

        return topics;
    }

    Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }

    void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    void updateTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
