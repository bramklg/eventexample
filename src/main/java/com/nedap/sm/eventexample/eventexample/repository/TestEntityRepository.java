package com.nedap.sm.eventexample.eventexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nedap.sm.eventexample.eventexample.entity.TestEntity;

@Repository
public interface TestEntityRepository extends CrudRepository<TestEntity, Long> {
}
