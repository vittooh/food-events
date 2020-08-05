package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import dtos.storage.StorageItemDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Component

val log = LoggerFactory.getLogger(StorageProcessor::class.java)
const val tag = "[DEFAULT-STORAGE]"
@Component
class StorageProcessor {

    @Autowired
    lateinit var storageRepository: StorageRepository

    @StreamListener(value = StorageInput.FOOD_STORAGE_CHANNEL)
    fun receiveMsg(storageItemDto: StorageItemDto) {
        log.info("$tag Going to store item:: $storageItemDto")
        val itemInDbAmount = storageRepository.findByName(storageItemDto.name)?.amount ?: 0.0
        storageRepository.save(
                Storage(
                        storageItemDto.name,
                        storageItemDto.amount + itemInDbAmount,
                        storageItemDto.unitType, storageItemDto.perishable)
        )
        log.info("$tag Item storage successfully:: $storageItemDto")
    }
}