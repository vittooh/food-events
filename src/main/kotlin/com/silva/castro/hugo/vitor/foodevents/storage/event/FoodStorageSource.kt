package com.silva.castro.hugo.vitor.foodevents.storage.event

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface FoodStorageSource {
    @Output("food-storage")
    abstract fun sendProductEvent(): MessageChannel
}