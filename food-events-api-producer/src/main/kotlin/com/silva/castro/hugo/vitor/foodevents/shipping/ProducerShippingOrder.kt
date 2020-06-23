package com.silva.castro.hugo.vitor.foodevents.shipping

import org.springframework.cloud.stream.annotation.EnableBinding

@EnableBinding(ShippingOrderSource::class)
class ProducerShippingOrder