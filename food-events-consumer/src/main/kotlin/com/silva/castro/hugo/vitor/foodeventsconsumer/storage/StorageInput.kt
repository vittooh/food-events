package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.MessageChannel

interface StorageInput{

    @Input("food-storage-consumer-channel")
    fun receiveFoodStorageChannel() :  MessageChannel
}