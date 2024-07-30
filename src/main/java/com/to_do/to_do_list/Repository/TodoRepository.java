package com.to_do.to_do_list.Repository;
import com.to_do.to_do_list.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
