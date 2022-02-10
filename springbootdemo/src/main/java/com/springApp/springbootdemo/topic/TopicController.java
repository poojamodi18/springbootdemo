package com.springApp.springbootdemo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("ID101","Java","Core Java, Advanced Java"),
                new Topic("ID102","Spring","Spring Framework"),
                new Topic("ID103","Spring Boot","Spring Boot Framework")
        );
    }
}
