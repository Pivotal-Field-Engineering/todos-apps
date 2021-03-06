package io.todos.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@EnableRedisRepositories
@SpringBootApplication
@EnableConfigurationProperties(TodosProperties::class)
class TodosRedis

fun main(args: Array<String>) {
    runApplication<TodosRedis>(*args)
}

