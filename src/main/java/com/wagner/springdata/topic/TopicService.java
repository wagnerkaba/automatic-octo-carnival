package com.wagner.springdata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){

        Optional<Topic> byId = topicRepository.findById(id);

        return byId.get();
    }


    public void addTopíc(Topic topic) {

        topicRepository.save(topic);

    }


    public void updateTopíc(String id, Topic topic) {

        topicRepository.save(topic);

    }

    public void deleteTopíc(String id) {

        topicRepository.deleteById(id);
    }
}
