package com.study.yaroslavambrozyak.todo.repository;

import com.study.yaroslavambrozyak.todo.entity.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo,String> {

}
