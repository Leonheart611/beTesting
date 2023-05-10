package com.example.blog

import com.example.blog.model.Todo
import com.example.blog.model.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/todo")
class TodoController(@Autowired val repository: TodoRepository) {

    @GetMapping("")
    fun getAllUsers(): List<Todo> =
        repository.findAll().toList()

    @PostMapping("")
    fun createTodo(@RequestBody data: Todo): ResponseEntity<Todo> {
        repository.save(data)
        return ResponseEntity(data, HttpStatus.CREATED)
    }
}