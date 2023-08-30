package br.web.taskguardian

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskGuardianApplication

fun main(args: Array<String>) {
	runApplication<TaskGuardianApplication>(*args)
}
