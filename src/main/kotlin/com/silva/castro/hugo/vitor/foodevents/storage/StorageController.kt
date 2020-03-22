package com.silva.castro.hugo.vitor.foodevents.storage

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.silva.castro.hugo.vitor.foodevents.storage.dto.StorageItemDto
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/v1/storage")
class StorageController {

    @Autowired
    lateinit var storageService: StorageService


    @PostMapping
    fun create(@RequestBody storageItemDto: StorageItemDto): Boolean {
        return storageService.createEventStorage(storageItemDto)
    }
}