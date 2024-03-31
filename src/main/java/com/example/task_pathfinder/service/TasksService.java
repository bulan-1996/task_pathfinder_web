package com.example.task_pathfinder.service;

import org.springframework.stereotype.Service;

import com.example.task_pathfinder.dto.TasksDTO;
import com.example.task_pathfinder.entity.Tasks;
import com.example.task_pathfinder.repository.TasksRepository;

/**
 * Tasksテーブルサービスクラス
 */
@Service
public class TasksService {
	private final TasksRepository tasksRepository;
	
	// tasksRepositoryインスタンスを注入
	public TasksService(TasksRepository tasksRepository) {
		this.tasksRepository = tasksRepository;
	}
	
	//Tasks情報をデータベースに保存する処理
	public void registrationTasks(TasksDTO tasksDTO) {
		// 新規追加
		Tasks tasks = new Tasks();
		tasks.setTaskTitle(tasksDTO.getTaskTitle());
		tasks.setTaskStartDay(tasksDTO.getTaskStartDay());
		tasks.setTaskEndDay(tasksDTO.getTaskEndDay());
		tasks.setTaskPriority(tasksDTO.getTaskPriority());
		tasks.setTaskProgress(tasksDTO.getTaskProgress());
		tasks.setTaskDescription(tasksDTO.getTaskDescription());
		tasks.setCreatedBy(tasksDTO.getCreatedBy());
		tasks.setUpdatedBy(tasksDTO.getUpdatedBy());
		tasksRepository.save(tasks);
	}
}
