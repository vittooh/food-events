package com.silva.castro.hugo.silva.foodeventsshipping.event

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.MessageChannel


interface ShippingOrderProcessorInput {

    companion object {
        const val SHIPPING_ORDER_PROCESSOR_INPUT = "shipping-order-processor-input-channel"
    }

    @Input(SHIPPING_ORDER_PROCESSOR_INPUT)
    fun receiveShippingOrderAuthorized() : MessageChannel
}