package com.nedap.sm.eventexample.eventexample.kafka;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.val;

@Component
@AllArgsConstructor
public class RandomEventProducer {
    private final EventProducer eventProducer;

    @Scheduled(fixedRate = 5_000)
    public void produceRandomEvent() {
        val eventOne = KafkaEventOne.builder()
                .name("RandomEvent")
                .build();

        eventProducer.produceEvent(eventOne);

        val eventTwo = KafkaEventTwo.builder()
                .otherField("Some other field value")
                .build();

        eventProducer.produceEvent(eventTwo);
    }
}
