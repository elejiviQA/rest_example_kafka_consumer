package com.example.kafka_example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic", groupId = "my_consumer")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}