package com.silva.castro.hugo.vitor.foodevents.shipping

import dtos.shipping.ShippingOrderDto
import org.springframework.stereotype.Service

@Service
class ShippingOrderService {

    fun publishEventShippingOrder(shippingOrderDto: ShippingOrderDto) : Boolean{
        TODO("create logic to send event")
    }
}