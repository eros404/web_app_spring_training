package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    private final TodoRepository repository;

    public TodoListController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/todo")
    public Iterable<TodoEntity> get() {
        return repository.findAll();
    }
    @PostMapping("/api/todo")
    public void post(@RequestBody TodoEntity todo) {
        repository.save(todo);
    }
}
