package com.poeei.tech.taskmanagement.domain.task;

import java.util.List;

public interface TaskService {

	public void registerTask(Task task);
	
	public List<Task> selectAllTask();
	
	public Task seleteTaskById(int id);
	
	public void updateTaskById(Task task);
	
	public void deleteTaskById(int id);
	
	public List<Task> findByCriteria(TaskSearchCriteria criteria);
}