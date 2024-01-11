package br.todoappv2.services;

import br.todoappv2.entities.Task;
import br.todoappv2.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;


    public String saveNewTask () {
        Task task = new Task();
        taskRepository.save(task);
        return "task created!";
    }

    public void deleteTask (Long taskId) {
        taskRepository.deleteById(taskId);
    }

    public void editTask (Long taskId,String taskDescription) {
        Task task = taskRepository.getReferenceById(taskId);
        task.setDescription(taskDescription);
        taskRepository.save(task);
    }


}
