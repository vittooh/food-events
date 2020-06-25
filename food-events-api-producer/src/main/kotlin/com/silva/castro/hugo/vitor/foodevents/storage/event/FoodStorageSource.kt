package com.silva.castro.hugo.vitor.foodevents.storage.event

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface FoodStorageSource {

    companion object Attrs{
        const val FOOD_STORAGE_CHANNEL = "food-storage-channel"
    }

    @Output(FOOD_STORAGE_CHANNEL)
    abstract fun sendProductEvent(): MessageChannel
}