package com.poeei.tech.taskmanagement.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.poeei.tech.taskmanagement.domain.task.Task;
import com.poeei.tech.taskmanagement.domain.task.TaskSearchCriteria;

@Mapper
public interface TaskMapper {
	public void insertTask(Task task);
	
	public List<Task> selectAllTask();

	public Task selectTaskById(int id);
	
	public void updateTaskById(Task task);

	public void deleteTaskById(int id);
	
	public List<Task> selectByCriteria(TaskSearchCriteria criteria);
}