package com.silva.castro.hugo.vitor.foodevents.shipping

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface ShippingOrderSource {

    companion object Attrs {
        val str = ""
    }

    @Output("shipping-order-channel")
    fun getShippingChannel(): MessageChannel
}