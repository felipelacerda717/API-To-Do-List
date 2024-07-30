package com.to_do.to_do_list.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.to_do.to_do_list.Service.TodoService;
import com.to_do.to_do_list.todo.Todo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@Tag(name = "Todo", description = "API para gerenciamento de tarefas")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    @Operation(summary = "Criar uma nova tarefa")
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @GetMapping
    @Operation(summary = "Listar todas as tarefas")
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obter uma tarefa por ID")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id).orElseThrow();
        return ResponseEntity.ok(todo);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar uma tarefa por ID")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
        return todoService.updateTodo(id, todoDetails);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar uma tarefa por ID")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}
