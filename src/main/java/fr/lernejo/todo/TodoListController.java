package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    @GetMapping("/api/todo")
    public Todo get() {
        return new Todo("bonjour !", "Louis");
    }
    @PostMapping("/api/todo")
    public void post(Todo todo) {

    }
}