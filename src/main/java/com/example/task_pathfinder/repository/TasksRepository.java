package com.example.task_pathfinder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import com.example.task_pathfinder.entity.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer>{
	Tasks findByEmail(String email);
	List<Task> findByUserId(int userId);
}
