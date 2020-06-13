package dtos.shipping

import dtos.storage.StorageItemDto

class ShippingOrderItem(
        var storageItemDto: StorageItemDto,
        var amount : Double
)