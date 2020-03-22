package com.silva.castro.hugo.vitor.foodevents

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodEventsApplication

fun main(args: Array<String>) {
    println("Lets go up!!")
    runApplication<FoodEventsApplication>(*args)
}
