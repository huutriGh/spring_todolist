package com.aptech.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.aptech.todolist.model.Todo;
import com.aptech.todolist.repository.TodoRepository;


@Service("todoService")
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repository ;



    @Override
    public List<Todo> getAll() {
        return repository.listAll();
    }
 
    
    
}
