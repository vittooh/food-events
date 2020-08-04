package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StorageRepository : MongoRepository<Storage, String> {

    fun findByName(name: String) : Storage?
}