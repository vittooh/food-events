package com.silva.castro.hugo.vitor.foodevents.shipping

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface ShippingOrderSource {
    @Output("shipping-order")
    abstract fun getShippingChannel(): MessageChannel
}