package com.silva.castro.hugo.vitor.foodevents.shipping

import dtos.shipping.ShippingOrderDto
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.integration.support.MessageBuilder
import org.springframework.stereotype.Component

@Component
class ShippingOrderProcessor {


    fun sendShippingOrderEvent(shippingOrderDto: ShippingOrderDto, shippingOrderSource: ShippingOrderSource): Boolean {
        val message = MessageBuilder.withPayload(shippingOrderDto).build()
        return shippingOrderSource.getShippingOrderChannel().send(message)
    }

    @StreamListener(ShippingOrderSource.SHIPPING_ORDER_ERROR_CHANNEL)
    fun processErrorOrders(id: String) {
        println(id)
    }
}