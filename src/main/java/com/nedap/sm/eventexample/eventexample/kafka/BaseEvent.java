package com.nedap.sm.eventexample.eventexample.kafka;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, property = "__TYPE__")
public abstract class BaseEvent {
}
