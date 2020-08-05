package com.silva.castro.hugo.vitor.foodevents.shipping

import dtos.shipping.ShippingOrderDto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.integration.support.MessageBuilder
import org.springframework.stereotype.Component

val log: Logger = LoggerFactory.getLogger(ShippingOrderProcessor::class.java)
const val tag = "[SHIPPING-ORDER-ERROR]"

@Component
class ShippingOrderProcessor {

    @Autowired
    lateinit var shippingOrderRepository: ShippingOrderRepository

    fun sendShippingOrderEvent(shippingOrderDto: ShippingOrderDto, shippingOrderSource: ShippingOrderSource): Boolean {
        val message = MessageBuilder.withPayload(shippingOrderDto).build()
        return shippingOrderSource.getShippingOrderChannel().send(message)
    }

    @StreamListener(ShippingOrderSource.SHIPPING_ORDER_ERROR_CHANNEL)
    fun processErrorOrders(shippingOrderDto: ShippingOrderDto) {
        log.info("$tag Missing item on stock, lets cancel order :: [$shippingOrderDto]")
        shippingOrderRepository.findById(shippingOrderDto.id).orElse(null)?.let {
            it.status = ShippingStatus.REJECTED
            shippingOrderRepository.save(it)
        }
        log.info("$tag Shipping Order Canceled :: [$shippingOrderDto]")
    }

}