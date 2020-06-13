package dtos.shipping

class ShippingOrderDto(
        var items: MutableList<ShippingOrderItem> = mutableListOf()
)