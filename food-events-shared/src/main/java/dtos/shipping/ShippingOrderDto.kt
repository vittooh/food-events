package dtos.shipping

import dtos.storage.StorageItemDto

class ShippingOrderDto(
        var id: String = "",
        var items: MutableList<StorageItemDto> = mutableListOf()
)