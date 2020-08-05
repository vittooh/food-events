package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface ShippingOrderSource {
    companion object {
        const val SHIPPING_ORDER_PROCESSOR = "shipping-order-processor-channel"
        const val SHIPPING_ORDER_ERROR = "shipping-order-error-channel"
    }

    @Output(SHIPPING_ORDER_PROCESSOR)
    fun getShippingOrderProcessorChannel(): MessageChannel

    @Output(SHIPPING_ORDER_ERROR)
    fun getShippingOrderErrorChannel(): MessageChannel
}