package com.silva.castro.hugo.vitor.foodevents.storage

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.silva.castro.hugo.vitor.foodevents.storage.dto.StorageItemDto
import com.silva.castro.hugo.vitor.foodevents.storage.event.FoodStorageProcessor
import com.silva.castro.hugo.vitor.foodevents.storage.event.FoodStorageSource
import java.util.logging.Logger

val log: Logger = Logger.getLogger(StorageService::class.java.name)

@Service
class StorageService {

    @Autowired
    private lateinit var foodStorageProcessor: FoodStorageProcessor

    @Autowired
    private lateinit var foodStorageSource: FoodStorageSource

    fun createEventStorage(storageItemDto: StorageItemDto): Boolean {
        log.info("Enviando Msg de armazenamento")
        val response = foodStorageProcessor.processFoodStorage(storageItemDto, foodStorageSource)
        log.info("Mensagem foi enviada com sucesso? : $response")
        return response
    }
}