package com.silva.castro.hugo.vitor.foodevents.shipping

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ShippingOrderRepository : MongoRepository<ShippingOrder, String>