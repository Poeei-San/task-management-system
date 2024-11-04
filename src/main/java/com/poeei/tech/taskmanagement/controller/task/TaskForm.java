package com.poeei.tech.taskmanagement.controller.task;

import com.poeei.tech.taskmanagement.domain.task.Task;

public class TaskForm {

	private int id;
	
	private String title;

	public TaskForm () {
	}
	
	public TaskForm (Task task) {
		this.id = task.getId();
		this.title = task.getTitle();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}