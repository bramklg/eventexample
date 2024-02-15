package com.nedap.sm.eventexample.eventexample.event;

import lombok.Data;
import lombok.ToString;

import com.nedap.sm.eventexample.eventexample.entity.TestEntity;

@Data
@ToString
public class TestEvent {
    private final Long id;
    private final String value;

    public TestEvent(TestEntity entity) {
        this.id = entity.getId();
        this.value = entity.getValue();
    }
}
