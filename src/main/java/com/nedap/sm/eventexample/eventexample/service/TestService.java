package com.nedap.sm.eventexample.eventexample.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import com.nedap.sm.eventexample.eventexample.entity.TestEntity;
import com.nedap.sm.eventexample.eventexample.event.TestEvent;
import com.nedap.sm.eventexample.eventexample.repository.TestEntityRepository;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class TestService {
    private final TestEntityRepository testEntityRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public void saveNewEntityAndEmitEvent() {
        val entity = testEntityRepository.save(TestEntity.builder().value(RandomStringUtils.randomAlphabetic(10)).build());

        testEntityRepository.save(entity);

        log.info("Saved entity with id {} on thread {}, now publishing event", entity.getId(), Thread.currentThread());

        applicationEventPublisher.publishEvent(new TestEvent(entity));
    }
}
