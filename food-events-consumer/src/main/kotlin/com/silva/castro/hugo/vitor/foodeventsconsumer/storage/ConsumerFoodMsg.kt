package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import dtos.storage.StorageItemDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink

@EnableBinding(StorageInput::class)
class ConsumerFoodMsg {

    @Autowired
    lateinit var storageRepository: StorageRepository

    @StreamListener(value = "food-storage-consumer-channel")
    fun receiveMsg(storageItemDto: StorageItemDto) {
        //todo criar 2 cusntom bind um para o storage e outro para o shipping.
        println("Default Storage!! Vamos armazenar  ::: $storageItemDto !!")
        storageRepository.save(Storage(storageItemDto.name, storageItemDto.amount, storageItemDto.unitType, storageItemDto.perishable))
    }
}