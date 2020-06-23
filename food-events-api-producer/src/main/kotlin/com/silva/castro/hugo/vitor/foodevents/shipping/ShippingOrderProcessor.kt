package com.silva.castro.hugo.vitor.foodevents.shipping

import dtos.shipping.ShippingOrderDto
import org.springframework.integration.support.MessageBuilder
import org.springframework.stereotype.Component

@Component
class ShippingOrderProcessor {

    fun sendShippingOrderEvent(shippingOrderDto: ShippingOrderDto, shippingOrderSource: ShippingOrderSource): Boolean {
        val message = MessageBuilder.withPayload(shippingOrderDto).build()
        return shippingOrderSource.getShippingChannel().send(message)
    }
}