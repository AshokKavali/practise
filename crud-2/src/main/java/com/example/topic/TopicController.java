package com.example.topic;

import java.util.Arrays;
import java.util.List;
import com.example.topic.TopicNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	public List<Topic> topics = Arrays.asList(new Topic("Spring", "Spring framework", "Spring desc"),
			new Topic("Java", "Java J2EE", "J2EE desc"), new Topic("Spring Boot", "Spring boot 3.3.5", "desc 3.3.5")

	);

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topics;
	}

	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id) throws TopicNotFoundException{
		for (Topic topic : topics) {
			if (topic.getId().equals(id)) {
				return topic;
			}
		}
		throw new TopicNotFoundException("Topic not found with id " + id);

	}

}
