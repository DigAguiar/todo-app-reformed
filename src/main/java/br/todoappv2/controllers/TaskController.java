package br.todoappv2.controllers;

import br.todoappv2.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todoapp")
public class TaskController {
    @Autowired
    TaskService taskService;


}
