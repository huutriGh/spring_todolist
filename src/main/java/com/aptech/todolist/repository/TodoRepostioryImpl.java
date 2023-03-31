package com.aptech.todolist.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.aptech.todolist.model.Todo;

@Repository("todoRepostioryImpl")
public class TodoRepostioryImpl implements TodoRepository {

    @Override
    public List<Todo> listAll() {
       
        Todo todo = new Todo();
        todo.setId("Spring").setTitle("Spring boot");
        Todo todo1 = new Todo();
        todo1.setId("React").setTitle("React JS");
        Todo todo2 = new Todo();
        todo2.setId("Web").setTitle("Webapp with Spring boot + ReactJs");

        List<Todo> todos = new ArrayList<>();
        todos.add(todo);
        todos.add(todo1);
        todos.add(todo2);
        
        return todos;

       


    }
    
}
