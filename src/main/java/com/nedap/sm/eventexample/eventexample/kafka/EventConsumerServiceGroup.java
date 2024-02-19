package com.nedap.sm.eventexample.eventexample.kafka;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@KafkaListener(topics = "testtopic", groupId = "service-events")
public class EventConsumerServiceGroup {

    @KafkaHandler
    public void consumeEventOne(KafkaEventOne event) {
        log.info("Type one event: " + event);
    }

    @KafkaHandler
    public void consumeEventTwo(KafkaEventTwo event) {
        log.info("Type two event: " + event);
    }
}
