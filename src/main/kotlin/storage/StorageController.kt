package storage

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import storage.dto.StorageItemDto

@RestController
@RequestMapping("/v1/storage")
class StorageController {

    @Autowired
    lateinit var storageService: StorageService


    @PostMapping
    fun create(storageItemDto: StorageItemDto): Boolean {
        return storageService.createEventStorage(storageItemDto)
    }
}