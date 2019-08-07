package com.spring.examples.assignment.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
      return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
       return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addtopic(@RequestBody Topic topic){
      topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT,value="/topics")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
        }
