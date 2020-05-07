package com.silva.castro.hugo.vitor.foodeventsconsumer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodEventsConsumerApplication

fun main(args: Array<String>) {
	SpringApplication.run(FoodEventsConsumerApplication::class.java, *args)
}
