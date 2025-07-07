package br.com.tarcianaoliveira.todolist.service;

import br.com.tarcianaoliveira.todolist.entity.Todo;
import br.com.tarcianaoliveira.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository repository;

    public TodoService(TodoRepository repository){
        this.repository = repository;
    }

    public List<Todo> create(Todo todo){
        repository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by(
                Sort.Order.desc("prioridade"),
                Sort.Order.asc("nome")
        );
        return repository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        repository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        repository.deleteById(id);
        return list();
    }
}
