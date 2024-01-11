package br.todoappv2.controllers;

import br.todoappv2.entities.Task;
import br.todoappv2.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todoapp")
public class TaskController {
    @Autowired
    TaskService taskService;


    @GetMapping("/list")
    public String refreshPage (@ModelAttribute Task task) {

    }


    @PostMapping("/createTask")
    public String createNewTask () {

        taskService.saveNewTask();
        return "index";
    }


}
