package com.silva.castro.hugo.vitor.foodevents

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.integration.annotation.InboundChannelAdapter
import org.springframework.integration.annotation.Poller
import org.springframework.integration.support.MessageBuilder
import org.springframework.messaging.Message
import java.util.*

@EnableBinding(MyCustomSource::class)
class ProducerFoodMsg {

    private val foods = mutableListOf("Pamonha", "Galinhada", "Sorvetinho")

    class MessageDto(
            val message: String?
    )

    @InboundChannelAdapter(channel = "default-channel", poller = [Poller(fixedDelay = "2000")])
    fun sendEvent(): String {
        val index = Random().ints(0, 3).findFirst().orElse(0)
        val str = "Estamos enviando comidas default, enviando ${foods[index]} para vcs "
        println(str)
        return str
    }


    @InboundChannelAdapter(channel = "custom-channel", poller = [Poller(fixedDelay = "3000")])
    fun sendEventCustom(): Message<MessageDto> {
        val index = Random().ints(0, 3).findFirst().orElse(0)
        val str = "Estamos enviando comidas custom, enviando ${foods[index]} para vcs "
        println(str)
        return MessageBuilder.withPayload(MessageDto(str)).build()
    }
}