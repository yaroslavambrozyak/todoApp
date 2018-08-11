package com.study.yaroslavambrozyak.todo;

import com.study.yaroslavambrozyak.todo.entity.Todo;
import com.study.yaroslavambrozyak.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	TodoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Todo todo = new Todo();
		todo.setId("23sdc2");
		todo.setTodoTitle("title");
		todo.setTodoDescription("desc");
		repository.save(todo);
		Optional<Todo> byId = repository.findById("23sdc1");
		System.out.println(byId.get().getTodoTitle());
	}
}
