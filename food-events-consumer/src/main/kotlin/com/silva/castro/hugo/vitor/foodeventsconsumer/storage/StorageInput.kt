package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.MessageChannel

interface StorageInput {

    companion object Atts{
        const val FOOD_STORAGE_CHANNEL = "food-storage-consumer-channel"
    }

    @Input(FOOD_STORAGE_CHANNEL)
    fun receiveFoodStorageChannel(): MessageChannel
}