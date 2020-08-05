package com.silva.castro.hugo.silva.foodeventsshipping.event

import dtos.shipping.ShippingOrderDto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Component

val log: Logger = LoggerFactory.getLogger(ShippingOrderProcessor::class.java)
const val tag = "[SHIPPING-ORDER-PROCESSOR]"

@Component
class ShippingOrderProcessor {

    @StreamListener(ShippingOrderProcessorInput.SHIPPING_ORDER_PROCESSOR_INPUT)
    fun processShippingOrder(dto: ShippingOrderDto) {
        log.info("$tag Received order :: [$dto]")
    }
}