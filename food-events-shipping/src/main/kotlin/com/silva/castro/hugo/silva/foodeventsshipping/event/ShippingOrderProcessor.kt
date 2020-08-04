package com.silva.castro.hugo.silva.foodeventsshipping.event

import dtos.shipping.ShippingOrderDto
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Component

@Component
class ShippingOrderProcessor {

    @StreamListener(ShippingOrderProcessorInput.SHIPPING_ORDER_PROCESSOR_INPUT)
    fun processShippingOrder(dto: ShippingOrderDto){
        println("We are receiving orders finally")
        println(dto)
    }
}