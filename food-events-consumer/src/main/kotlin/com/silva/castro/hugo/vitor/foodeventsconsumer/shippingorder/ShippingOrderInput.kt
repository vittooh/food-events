package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.MessageChannel

interface ShippingOrderInput {

    companion object Attrs {
        const val SHIPPING_ORDERS_CONSUMER_CHANNEL = "shipping-order-consumer-channel"
    }

    @Input(SHIPPING_ORDERS_CONSUMER_CHANNEL)
    fun receiveShippingOrderChannel(): MessageChannel
}