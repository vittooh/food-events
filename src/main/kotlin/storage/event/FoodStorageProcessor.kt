package storage.event

import storage.dto.StorageItemDto
import org.springframework.integration.support.MessageBuilder
import org.springframework.stereotype.Component

@Component
class FoodStorageProcessor {

    fun processFoodStorage(storageItemDto: StorageItemDto, foodStorageSource: FoodStorageSource): Boolean {
        val message = MessageBuilder.withPayload(storageItemDto).build()
        return foodStorageSource.sendProductEvent().send(message)
    }
}