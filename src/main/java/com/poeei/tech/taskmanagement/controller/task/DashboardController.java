package com.poeei.tech.taskmanagement.controller.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.poeei.tech.taskmanagement.domain.task.Task;
import com.poeei.tech.taskmanagement.domain.task.TaskService;

@Controller
public class DashboardController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping({"/", "/dashboard"})
    public String home(Model model,@ModelAttribute("task") Task task) {
		List<Task> taskList = taskService.selectAllTask();
		model.addAttribute("taskList",taskList);
        return "dashboard";
    }
}