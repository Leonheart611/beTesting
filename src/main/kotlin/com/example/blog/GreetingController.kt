package com.example.blog

import com.example.blog.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {
    private val template = "Hello, %s!"
    private val counter = AtomicLong()

    @GetMapping("/greetings")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): User {
        return User(counter.incrementAndGet(), String.format(template, name))
    }
}