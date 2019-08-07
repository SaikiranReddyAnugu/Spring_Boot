package com.spring.examples.assignment.topics;

import java.util.List;
import java.util.Optional;

public interface TopicService {
    public List<Topic> getAllTopics();
    public Optional<Topic> getTopic(String topicId);
    public void addTopic(Topic topic);
    public void updateTopic(Topic topic);
    public void deleteTopic(String id);

}
