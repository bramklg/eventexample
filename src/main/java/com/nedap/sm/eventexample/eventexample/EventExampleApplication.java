package com.nedap.sm.eventexample.eventexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EventExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventExampleApplication.class, args);
    }
}
