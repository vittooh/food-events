package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import dtos.storage.StorageItemDto
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink

@EnableBinding(Sink::class)
class ConsumerFoodMsg {

    @StreamListener(Sink.INPUT)
    fun reciveMsg(storageItemDto: StorageItemDto) {
        println("Default Storage!! Vamos armazenar  ::: $storageItemDto !!")
    }
}