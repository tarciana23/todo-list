package br.com.tarcianaoliveira.todolist.repository;

import br.com.tarcianaoliveira.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
