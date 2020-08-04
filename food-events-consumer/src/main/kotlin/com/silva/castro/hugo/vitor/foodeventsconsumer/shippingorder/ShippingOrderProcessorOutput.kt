package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface ShippingOrderProcessorOutput {
    companion object {
        const val SHIPPING_ORDER_PROCESSOR = "shipping-order-processor-channel"
    }

    @Output(SHIPPING_ORDER_PROCESSOR)
    fun getShippingOrderProcessorChannel(): MessageChannel
}