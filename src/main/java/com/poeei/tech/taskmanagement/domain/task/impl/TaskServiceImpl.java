package com.poeei.tech.taskmanagement.domain.task.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.poeei.tech.taskmanagement.domain.task.Task;
import com.poeei.tech.taskmanagement.domain.task.TaskSearchCriteria;
import com.poeei.tech.taskmanagement.domain.task.TaskService;
import com.poeei.tech.taskmanagement.mapper.TaskMapper;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskMapper taskMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED , rollbackFor= Exception.class)
	public void registerTask(Task task) {
		taskMapper.insertTask(task);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<Task> selectAllTask() {
		return taskMapper.selectAllTask();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Task seleteTaskById(int id) {
		return taskMapper.selectTaskById(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED , rollbackFor= Exception.class)
	public void updateTaskById(Task task) {
		taskMapper.updateTaskById(task);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED , rollbackFor= Exception.class)
	public void deleteTaskById(int id) {
		taskMapper.deleteTaskById(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED , readOnly = true)
	public List<Task> findByCriteria(TaskSearchCriteria criteria) {
		return taskMapper.selectByCriteria(criteria);
	}
}