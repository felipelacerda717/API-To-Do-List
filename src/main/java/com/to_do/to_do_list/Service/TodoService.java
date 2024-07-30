package com.to_do.to_do_list.Service;
import com.to_do.to_do_list.Repository.TodoRepository;
import com.to_do.to_do_list.todo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo updateTodo(Long id, Todo todoDetails) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
        todo.setCompleted(todoDetails.isCompleted());
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}