package com.silva.castro.hugo.vitor.foodeventsconsumer.storage

import com.silva.castro.hugo.vitor.foodeventsconsumer.entity.BaseEntity
import dtos.storage.UnitTypes
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Storage(
        var name: String = "",
        var amount: Double = 0.0,
        var unitType: UnitTypes = UnitTypes.KG,
        var perishable: Boolean = false
) : BaseEntity()