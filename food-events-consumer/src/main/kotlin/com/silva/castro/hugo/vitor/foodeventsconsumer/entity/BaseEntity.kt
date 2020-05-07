package com.silva.castro.hugo.vitor.foodeventsconsumer.entity

import org.springframework.data.annotation.Id

open class BaseEntity {
    @Id
    var id: String = ""
}