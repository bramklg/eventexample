package com.nedap.sm.eventexample.eventexample.eventlistener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.nedap.sm.eventexample.eventexample.event.TestEvent;
import com.nedap.sm.eventexample.eventexample.repository.TestEntityRepository;

@Component
@AllArgsConstructor
@Slf4j
public class TestEntityEventListener {
    private final TestEntityRepository testEntityRepository;

    @TransactionalEventListener
    @Async
    public void handleTestEntityCreatedEvent(TestEvent event) {
        log.info("Received event: {} on thread {}", event, Thread.currentThread());

        testEntityRepository
                .findById(event.getId())
                .ifPresentOrElse(testEntity -> log.info("Entity with id {} has value {}", testEntity.getId(), testEntity.getValue()),
                        () -> {
                            log.error("Entity with id {} not found", event.getId());
                        });

        log.info("Handled event: {} on thread {}", event, Thread.currentThread());
    }
}
