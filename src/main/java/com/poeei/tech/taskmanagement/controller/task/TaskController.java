package com.poeei.tech.taskmanagement.controller.task;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poeei.tech.taskmanagement.domain.task.Task;
import com.poeei.tech.taskmanagement.domain.task.TaskSearchCriteria;
import com.poeei.tech.taskmanagement.domain.task.TaskService;

@Controller
@RequestMapping("/task-management")
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@Autowired
	private TaskEnquiryForm criteriaform;

	@GetMapping("/register")
    public String showTaskRegistrationPage(Model model) {
        model.addAttribute("task", new Task());
        return "register-task";
    }

    @PostMapping("/register")
    public String registerTask(@ModelAttribute("task") Task task) {
        taskService.registerTask(task);
        return "redirect:/dashboard";
    }

    @GetMapping("/edit/{id}")
    public String showTaskEditionPage(@PathVariable("id") int id, Model model) {
		Task task = taskService.seleteTaskById(id);
		model.addAttribute("task", task);
		return "edit-task";
    }

    @PostMapping("/update") 
    public String updateTask(@ModelAttribute("task") Task task,Model model) { 
		taskService.updateTaskById(task);
		return "redirect:/dashboard"; 
    }

    @GetMapping("/delete/{id}")
    public String showTaskDeletionPage(@PathVariable("id") int id, Model model) { 
        Task task = taskService.seleteTaskById(id); 
        model.addAttribute("task", task); 
        return "delete-task"; 
    }

    @PostMapping("/delete")
    public String deleteTask(@RequestParam("id") int id) { 
        taskService.deleteTaskById(id);
        return "redirect:/dashboard"; 
    }

    private void setupCriteriaAndDisplay(Model model) {
		TaskSearchCriteria criteria = criteriaform.toTaskSearchCriteria();
		List<Task> taskList = taskService.findByCriteria(criteria);
		model.addAttribute("taskList", taskList);
	}

    @RequestMapping(value = "/search", method = { RequestMethod.GET , RequestMethod.POST})
	public String searchUserByNameAndCode(@ModelAttribute("criteriaform") TaskEnquiryForm criteriaform, HttpServletRequest request, Model model) {
		this.criteriaform = criteriaform;
		model.addAttribute("criteriaform", criteriaform);
		setupCriteriaAndDisplay(model);
		return "search-task";
	}
}