package com.app.todo.repositories;

import com.app.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository is a core interface in Spring Data JPA that provides a complete set of tools for the data access layer of an application
public interface TaskRepository extends JpaRepository<Task, Long> {
}
