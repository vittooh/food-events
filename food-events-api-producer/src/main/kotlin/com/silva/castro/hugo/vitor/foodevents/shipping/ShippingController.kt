package com.silva.castro.hugo.vitor.foodevents.shipping

import dtos.shipping.ShippingOrderDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/shipping")
class ShippingController {

    @Autowired
    lateinit var shippingOrderService: ShippingOrderService

    @PostMapping
    fun createOrder(shippingOrderDto: ShippingOrderDto): Boolean {
        return shippingOrderService.publishEventShippingOrder(shippingOrderDto)
    }
}