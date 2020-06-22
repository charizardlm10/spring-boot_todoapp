package com.charizardlm10.todoapp.Controller;

import com.charizardlm10.todoapp.Connector.TodoConnector;
import com.charizardlm10.todoapp.Model.TodoItem;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    @Autowired
    private TodoConnector todoConnector;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoConnector.findAll();
    }
    @PostMapping
    public TodoItem save(@NotNull @RequestBody TodoItem todoItem){
        return todoConnector.save(todoItem);
    }
    @PutMapping
    public TodoItem update(@NotNull @RequestBody TodoItem todoItem){
        return todoConnector.save(todoItem);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoConnector.deleteById(id);
    }
}
