package com.poeei.tech.taskmanagement.controller.task;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.poeei.tech.taskmanagement.domain.task.TaskSearchCriteria;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TaskEnquiryForm {

	private static final long serialVersionUID = 1L;
	
	private String title;

	public TaskEnquiryForm() {
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TaskSearchCriteria toTaskSearchCriteria() {
		TaskSearchCriteria criteria = new TaskSearchCriteria();
		criteria.setTitle(this.title);
		return criteria;
	}
}