package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import dtos.shipping.ShippingOrderDto
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Component

@Component
class ConsumerShippingOrderMsg {

    @StreamListener(ShippingOrderInput.SHIPPING_ORDERS_CONSUMER_CHANNEL)
    fun consumeAndProcess(shippingOrderDto: ShippingOrderDto) {
        println("yes we are receiving orders  !")
        println(shippingOrderDto)
    }
}