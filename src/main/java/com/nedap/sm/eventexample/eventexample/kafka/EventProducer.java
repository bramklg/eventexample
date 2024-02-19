package com.nedap.sm.eventexample.eventexample.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class EventProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void produceEvent(BaseEvent event) {
        kafkaTemplate.send("testtopic", event);
    }
}
