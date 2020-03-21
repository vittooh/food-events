package storage.dto

class StorageItemDto(
        val name: String = "",
        val amount: Double = 0.0,
        val unitType: String = "KG",
        val perishable: Boolean = false
)