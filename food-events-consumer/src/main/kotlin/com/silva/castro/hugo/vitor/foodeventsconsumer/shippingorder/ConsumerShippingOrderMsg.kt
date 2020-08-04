package com.silva.castro.hugo.vitor.foodeventsconsumer.shippingorder

import com.silva.castro.hugo.vitor.foodeventsconsumer.storage.StorageRepository
import dtos.shipping.ShippingOrderDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.integration.support.MessageBuilder
import org.springframework.messaging.MessageChannel
import org.springframework.stereotype.Component

@Component
class ConsumerShippingOrderMsg {

    @Autowired
    lateinit var storageRepository: StorageRepository

    @Autowired
    lateinit var shippingOrderMessageChannel: ShippingOrderProcessorOutput


    @StreamListener(ShippingOrderInput.SHIPPING_ORDERS_CONSUMER_CHANNEL)
    fun consumeAndProcess(shippingOrderDto: ShippingOrderDto) {
        println("yes we are receiving orders  !")
        /*shippingOrderDto.items.forEach { item ->
            val itemInDb = storageRepository.findByName(item.name)
            if (itemInDb != null && itemInDb.amount < item.amount) {
                println("not found item")
                //send back event for api
            }
        }*/
        val message = MessageBuilder.withPayload(shippingOrderDto).build()
        val sent = shippingOrderMessageChannel.getShippingOrderProcessorChannel().send(message)
        println("Shipping order sent ? : $sent")
    }
}