package com.spring.examples.assignment.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicRespository topicRespository;
    @Override
    public List<Topic> getAllTopics() {
        return topicRespository.findAll();
    }

    @Override
    public Optional<Topic> getTopic(String topicId) {
        return topicRespository.findById(topicId);
    }

    @Override
    public void addTopic(Topic topic) {
        topicRespository.save(topic);
    }

    @Override
    public void updateTopic(Topic topic) {
        topicRespository.save(topic);
    }

    @Override
    public void deleteTopic(String id) {
        topicRespository.deleteById(id);
    }
}
