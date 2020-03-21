package storage.event

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import storage.dto.StorageItemDto

@EnableBinding(Sink::class)
class ConsumerFoodMsg {

    @StreamListener(Sink.INPUT)
    fun reciveMsg(storageItemDto: StorageItemDto) {
        println("Default delivery nos vamos comer  ::: $storageItemDto !!")
    }
}