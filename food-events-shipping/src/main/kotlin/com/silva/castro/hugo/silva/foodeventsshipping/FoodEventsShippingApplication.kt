package com.silva.castro.hugo.silva.foodeventsshipping

import com.silva.castro.hugo.silva.foodeventsshipping.event.ShippingOrderProcessorInput
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding

@SpringBootApplication
@EnableBinding(ShippingOrderProcessorInput::class)
class FoodEventsShippingApplication

fun main(args: Array<String>) {
    runApplication<FoodEventsShippingApplication>(*args)
}
