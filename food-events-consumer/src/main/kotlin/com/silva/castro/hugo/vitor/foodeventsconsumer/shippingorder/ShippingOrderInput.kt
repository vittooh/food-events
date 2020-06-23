package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.MessageChannel

interface ShippingOrderInput{

    @Input("shipping-order-consumer-channel")
    fun receiveShippingOrderChannel() : MessageChannel
}