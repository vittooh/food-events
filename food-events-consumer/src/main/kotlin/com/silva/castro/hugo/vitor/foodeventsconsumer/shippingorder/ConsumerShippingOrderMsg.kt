package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import com.silva.castro.hugo.vitor.foodeventsconsumer.storage.StorageRepository
import dtos.shipping.ShippingOrderDto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.integration.support.MessageBuilder
import org.springframework.stereotype.Component

val log: Logger = LoggerFactory.getLogger(ConsumerShippingOrderMsg::class.java)
const val tag = "[SHIPPING-ORDER-STORAGE]"

@Component
class ConsumerShippingOrderMsg {

    @Autowired
    lateinit var storageRepository: StorageRepository

    @Autowired
    lateinit var shippingOrderMessageChannel: ShippingOrderSource


    @StreamListener(ShippingOrderInput.SHIPPING_ORDERS_CONSUMER_CHANNEL)
    fun consumeAndProcess(shippingOrderDto: ShippingOrderDto) {
        log.info("$tag Order received:: $shippingOrderDto")
        shippingOrderDto.items.forEach { item ->
            val itemInDb = storageRepository.findByName(item.name)
            if (itemInDb == null || itemInDb.amount < item.amount) {
                log.error("$tag Item :: ${item.name} not found or don't have stock")
                val sent = shippingOrderMessageChannel
                        .getShippingOrderErrorChannel()
                        .send(MessageBuilder.withPayload(shippingOrderDto).build())
                log.error("$tag Shipping  order error sent ? :: $sent")
                return
            } else {
                itemInDb.amount = itemInDb.amount - item.amount
                storageRepository.save(itemInDb)
            }
        }
        val message = MessageBuilder.withPayload(shippingOrderDto).build()
        val sent = shippingOrderMessageChannel.getShippingOrderProcessorChannel().send(message)
        log.info("$tag Shipping order sent ? :: $sent")
    }
}