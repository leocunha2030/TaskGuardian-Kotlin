package br.web.taskguardian.controller

import br.web.taskguardian.controller.request.PostTaskController
import model.TaskModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tasks")
class TaskController {

    val tasks = mutableListOf<TaskModel>()

    @GetMapping
    fun getTask(): MutableList<TaskModel> {
        return tasks
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody task: PostTaskController) {
        var id = if (tasks.isEmpty()){
            "1"
        }else{
            tasks.last().id.toInt() + 1
        }.toString()
        tasks.add(TaskModel(id,task.name,task.description))
    }
}