package com.finestweber.Aula1Todolist.service;

import com.finestweber.Aula1Todolist.entity.Todo;
import com.finestweber.Aula1Todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo)
    {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list()
    {
        Sort sort = Sort.by("nome").ascending();
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo)
    {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id)
    {
        todoRepository.deleteById(id);
        return list();
    }
}
