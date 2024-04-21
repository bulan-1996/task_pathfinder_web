package com.example.task_pathfinder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task_pathfinder.entity.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer>{
	List<Tasks> findByUserId(Integer userId);
}
