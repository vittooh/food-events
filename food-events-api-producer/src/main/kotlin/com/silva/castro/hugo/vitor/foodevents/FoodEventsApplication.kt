package com.silva.castro.hugo.vitor.foodevents

import com.silva.castro.hugo.vitor.foodevents.shipping.ShippingOrderSource
import com.silva.castro.hugo.vitor.foodevents.storage.event.FoodStorageSource
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding

@SpringBootApplication
@EnableBinding(ShippingOrderSource::class, FoodStorageSource::class)
class FoodEventsApplication

fun main(args: Array<String>) {
    runApplication<FoodEventsApplication>(*args)
}
