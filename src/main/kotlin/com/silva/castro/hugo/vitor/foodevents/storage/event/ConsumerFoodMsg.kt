package com.silva.castro.hugo.vitor.foodevents.storage.event

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import com.silva.castro.hugo.vitor.foodevents.storage.dto.StorageItemDto

@EnableBinding(Sink::class)
class ConsumerFoodMsg {

    @StreamListener(Sink.INPUT)
    fun reciveMsg(storageItemDto: StorageItemDto) {
        println("Default Storage!! Vamos armazenar  ::: $storageItemDto !!")
    }
}