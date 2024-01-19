package com.finestweber.Aula1Todolist.repository;

import com.finestweber.Aula1Todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
