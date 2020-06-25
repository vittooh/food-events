package com.silva.castro.hugo.vitor.foodevents.shipping

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface ShippingOrderSource {

    companion object Attrs {
        const val SHIPPING_ORDER_CHANNEL = "shipping-order-channel"
        const val SHIPPING_ORDER_ERROR_CHANNEL = "shipping-order-error-channel"
    }

    @Output(SHIPPING_ORDER_CHANNEL)
    fun getShippingOrderChannel(): MessageChannel

    @Input(SHIPPING_ORDER_ERROR_CHANNEL)
    fun getShippingErrorChannel(): MessageChannel
}