package com.silva.castro.hugo.vitor.foodevents.shipping

import dtos.shipping.ShippingOrderDto
import dtos.storage.StorageItemDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ShippingOrderService {

    @Autowired
    lateinit var shippingOrderRepository: ShippingOrderRepository

    @Autowired
    lateinit var shippingOrderProcessor: ShippingOrderProcessor

    @Autowired
    lateinit var shippingOrderSource: ShippingOrderSource

    fun publishEventShippingOrder(itemName: String, amount: Double): Boolean {
        val persisted = shippingOrderRepository.save(
                ShippingOrder(item = itemName, amount = amount)
        )
        //TODO change this to mappers, preferable for map struct
        return shippingOrderProcessor.sendShippingOrderEvent(
                ShippingOrderDto(id = persisted.id, items =
                mutableListOf(StorageItemDto(name = itemName, amount = amount))), shippingOrderSource)
    }
}