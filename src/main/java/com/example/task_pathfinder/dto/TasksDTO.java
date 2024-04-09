package com.example.task_pathfinder.dto;

import java.util.Date;

/**
 * Tasks情報をセットするDTOクラス
 */
public class TasksDTO {
	/***
	 * id:
	 * userId:ユーザーID
	 * taskTitle:タイトル
	 * taskStartDay:開始日
	 * taskEndDay:終了日
	 * taskPriority:優先度
	 * taskProgress:進捗
	 * taskDescription:説明
	 * createdBy:作成者
	 * updatedBy:更新者
	 */
	private int id;
	private int userId;
	private String taskTitle;
	private Date taskStartDay;
	private Date taskEndDay;
	private int taskPriority;
	private int taskProgress;
	private String taskDescription;
	private String createdBy;
	private String updatedBy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}
