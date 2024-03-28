package com.example.task_pathfinder.entity;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Tasksテーブルのentityテーブル
 */
@Entity
@Table(name = "tasks") //テーブル名
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "task_title")
	private String taskTitle;
	
	@Column(name = "task_start_day")
	private Date taskStartDay;
	
	@Column(name = "task_end_day")
    private Date taskEndDay;
	
	@Column(name = "task_priority")
    private int taskPriority;
	
	@Column(name = "task_progress")
    private int taskProgress;
	
	@Column(name = "task_description")
    private String taskDescription;
	
	@Column(name = "created_by")
    private String createdBy;
	
	@Column(name = "created_at", nullable = false, updatable = false)
	@CreationTimestamp
    private Timestamp createdAt;
	
	@Column(name = "updated_by")
    private String updatedBy;
	
	@Column(name = "updated_at")
	@UpdateTimestamp
    private Timestamp updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public Date getTaskStartDay() {
		return taskStartDay;
	}

	public void setTaskStartDay(Date taskStartDay) {
		this.taskStartDay = taskStartDay;
	}

	public Date getTaskEndDay() {
		return taskEndDay;
	}

	public void setTaskEndDay(Date taskEndDay) {
		this.taskEndDay = taskEndDay;
	}

	public int getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(int taskPriority) {
		this.taskPriority = taskPriority;
	}

	public int getTaskProgress() {
		return taskProgress;
	}

	public void setTaskProgress(int taskProgress) {
		this.taskProgress = taskProgress;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
