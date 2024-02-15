package com.nedap.sm.eventexample.eventexample.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {
    @Autowired
    private TestService testService;

    @Test
    void testSaveNewEntityAndEmitEvent() {
        testService.saveNewEntityAndEmitEvent();

        System.out.println("done");
    }
}
