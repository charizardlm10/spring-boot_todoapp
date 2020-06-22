package com.charizardlm10.todoapp.Connector;

import com.charizardlm10.todoapp.Model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoConnector extends JpaRepository<TodoItem,Long> {
}
