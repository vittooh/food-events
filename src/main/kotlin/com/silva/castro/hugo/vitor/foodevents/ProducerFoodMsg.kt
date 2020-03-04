package com.silva.castro.hugo.vitor.foodevents

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Source
import org.springframework.integration.annotation.InboundChannelAdapter
import java.util.*

@EnableBinding(Source::class)
class ProducerFoodMsg {

    private val foods = mutableListOf("Pamonha", "Galinhada", "Sorvetinho")

    @InboundChannelAdapter(Source.OUTPUT)
    fun sendEvent(): String {
        val index = Random().ints(0, 3).findFirst().orElse(0)
        println("Estamos enviando ${foods[index]} para vcs ")
        return foods[index]
    }
}