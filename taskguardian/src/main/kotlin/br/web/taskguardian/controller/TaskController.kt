package br.web.taskguardian.controller

import br.web.taskguardian.controller.request.PostTaskController
import model.TaskModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tasks")
class TaskController {

    @GetMapping
    fun getTask(): TaskModel{
        return TaskModel(
            "1",
            "Tarefa de fazer coisas",
            "Essa tarefa é sobre fazer tal coisa"
        )
    }
    @PostMapping
    fun create(@RequestBody task: PostTaskController) {
        println(task)
    }
}