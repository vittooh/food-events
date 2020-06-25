package com.silva.castro.hugo.vitor.foodeventsconsumer

import com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder.ShippingOrderInput
import com.silva.castro.hugo.vitor.foodeventsconsumer.storage.StorageInput
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding

@SpringBootApplication
@EnableBinding(ShippingOrderInput::class,StorageInput::class)
class FoodEventsConsumerApplication

fun main(args: Array<String>) {
	SpringApplication.run(FoodEventsConsumerApplication::class.java, *args)
}
