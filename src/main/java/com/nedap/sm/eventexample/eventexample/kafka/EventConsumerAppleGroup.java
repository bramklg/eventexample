package com.nedap.sm.eventexample.eventexample.kafka;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@KafkaListener(topics = "testtopic", groupId = "apple-events")
public class EventConsumerAppleGroup {

    @KafkaHandler
    public void consumeEventOne(KafkaEventOne event) {
        log.info("Apple type one: " + event);
    }

    @KafkaHandler
    public void consumeEventTwo(KafkaEventTwo event) {
        log.info("Apple type two: " + event);
    }
}
