package com.silva.castro.hugo.vitor.foodevents

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface MyCustomSource {

    @Output("default-channel")
    abstract fun sendEventDefaultChannel(): MessageChannel

    @Output("custom-channel")
    abstract fun sendEventCustomChannel(): MessageChannel

}