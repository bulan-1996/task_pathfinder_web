package com.example.task_pathfinder.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.task_pathfinder.dto.TasksDTO;
import com.example.task_pathfinder.service.TasksService;

/*
 * TasksテーブルController 
 */
@RestController
public class TasksController {
	private final TasksService tasksService;
	
	/**
	 * Spring Bootでは、コンストラクタに@Autowiredアノテーションが付けられている場合、
	 * Springが自動的にBeanをインジェクションするので@Autowiredはここには不要である。
	 * @param tasksService
	 */
	public TasksController(TasksService tasksService) {
		this.tasksService = tasksService;
	}
	
	
	@PostMapping("api/taskInsert")
	public void registrationTasks(@RequestBody TasksDTO tasksDTO) {
		tasksService.registrationTasks(tasksDTO);
	}
	
	@GetMapping("api/getTasks")
	public ResponseEntity<List<Task>> getTasksByUserId(@RequestParam("userId") int userId) {
		 List<Task> tasks = tasksService.getTasksByUserId(userId);
		 return ResponseEntity.ok(tasks);
	}
	
}
