package dtos.storage

class StorageItemDto(
        var name: String = "",
        var amount: Double = 0.0,
        var unitType: String = "KG",
        var perishable: Boolean = false
) {


    override fun toString(): String {
        return "Name : $name, Amount : $amount, UnitType: $unitType, Perishable : $perishable "
    }
}