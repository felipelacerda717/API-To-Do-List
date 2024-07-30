package com.to_do.to_do_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "To-Do List API", version = "1.0", description = "API para gerenciamento de tarefas"))

public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
}
