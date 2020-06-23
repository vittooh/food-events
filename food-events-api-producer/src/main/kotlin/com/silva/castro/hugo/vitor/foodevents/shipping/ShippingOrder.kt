package com.silva.castro.hugo.vitor.foodevents.shipping

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class ShippingOrder(
        @Id
        var id: String = "",
        var item: String = "",
        var amount: Double = 0.0,
        var status: ShippingStatus = ShippingStatus.PENDING
)