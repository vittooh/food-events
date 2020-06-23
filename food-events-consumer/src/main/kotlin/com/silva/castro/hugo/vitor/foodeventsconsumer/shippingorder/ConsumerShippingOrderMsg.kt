package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import dtos.shipping.ShippingOrderDto
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener

@EnableBinding(ShippingOrderInput::class)
class ConsumerShippingOrderMsg {

    @StreamListener("shipping-order-consumer-channel")
    fun consumeAndProcess(shippingOrderDto: ShippingOrderDto){
        println("yes we are receiving orders  !")
        println(shippingOrderDto)
    }
}